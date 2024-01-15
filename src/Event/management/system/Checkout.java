package Event.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Checkout extends JFrame {

    Checkout() {
        // Create the panel first
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 790, 390);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("Checkout");
        label.setBounds(100, 20, 150, 30);
        label.setFont(new Font("Tahoma", Font.BOLD, 20));
        label.setForeground(Color.WHITE);
        panel.add(label);
     //userid
        JLabel userid = new JLabel("Customer-id");
        userid.setBounds(30, 80, 150, 30);
        userid.setFont(new Font("Tahoma", Font.BOLD, 20));
        userid.setForeground(Color.WHITE);
        panel.add(userid);

      //choioce
        Choice Customer=new Choice();
        Customer.setBounds(200,80,150,25);
        panel.add(Customer);


        //eventnumber
        JLabel eventnumber = new JLabel("Event Number");
        eventnumber.setBounds(30, 130, 150, 30);
        eventnumber.setFont(new Font("Tahoma", Font.BOLD, 14));
        eventnumber.setForeground(Color.WHITE);
        panel.add(eventnumber);

        //labeleventnumber
        JLabel labeleventnumber = new JLabel("");
        labeleventnumber.setBounds(200, 130, 150, 30);
        labeleventnumber.setFont(new Font("Tahoma", Font.BOLD, 14));
        labeleventnumber.setForeground(Color.WHITE);
        panel.add(labeleventnumber);

         //time
        JLabel Checkintime = new JLabel("Check in time");
        Checkintime.setBounds(30, 180, 150, 30);
        Checkintime.setFont(new Font("Tahoma", Font.BOLD, 14));
        Checkintime.setForeground(Color.WHITE);
        panel.add(Checkintime);

//database theke ane  aikhane storee korbo
        JLabel labelCheckintime = new JLabel();
        labelCheckintime.setBounds(200, 180, 250, 30);
        labelCheckintime.setFont(new Font("Tahoma", Font.BOLD, 14));
        labelCheckintime.setForeground(Color.WHITE);
        panel.add(labelCheckintime);

        //checkout
        JLabel checkouttime = new JLabel("Check out time");
        checkouttime.setBounds(30, 230, 150, 30);
        checkouttime.setFont(new Font("Tahoma", Font.BOLD, 14));
        checkouttime.setForeground(Color.WHITE);
        panel.add(checkouttime);






        Date date=new Date();



JLabel labelcheckouttime = new JLabel(""+date);
        labelcheckouttime.setBounds(200, 230, 250, 30);
        labelcheckouttime.setFont(new Font("Tahoma", Font.BOLD, 14));
        labelcheckouttime.setForeground(Color.WHITE);
        panel.add(labelcheckouttime);
        try{
            con c=new con();
            ResultSet  resultSet=c.statement.executeQuery("select * from customer");
            while(resultSet.next())
            {
                Customer.add(resultSet.getString("number"));//colum er nam aikhane pass korlam
            }
        }catch (Exception E)
        {
            E.printStackTrace();
        }


        //button chkout
      JButton checkout=new JButton("Check-out");
        checkout.setBounds(30,300,120,30);
        checkout.setForeground(Color.WHITE);
        checkout.setBackground(Color.BLACK);
        panel.add(checkout);
        checkout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pt-try
              //  System.out.println("Check-out button clicked");

                try {
                    con cv = new con();
                    cv.statement.executeUpdate("delete from customer where number ='" + Customer.getSelectedItem() + "'");//data delte hoise
                    cv.statement.executeUpdate("update eeeventtt set availability ='Available' where event_no='" +labeleventnumber.getText() + "'");//availability and ocuupied kore
                    //cv.statement.executeUpdate("update eeeventtt set availability ='Available' where event_no='3'");//availability and ocuupied kore
                    JOptionPane.showMessageDialog(null, "Done");
                    setVisible(false);
                }catch (Exception  E)
                {
                    E.printStackTrace();
                }

            }
        });
        //chk
        JButton check=new JButton("Test");
        check.setBounds(300,300,120,30);
        check.setForeground(Color.WHITE);
        check.setBackground(Color.BLACK);
        panel.add( check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                con c=new con();
                try{
                  ResultSet  resultSet=c.statement.executeQuery("select * from customer where number ='"+Customer.getSelectedItem()+"' ");
                  while (resultSet.next())
                  {

                      labeleventnumber.setText(resultSet.getString("allocated_event"));
                      labelCheckintime.setText(resultSet.getString("register"));//column er nam
                  }
                }catch (Exception E )
                {
                 E.printStackTrace();
                }
            }
        });

        //back
        JButton back=new JButton("Back");
        back.setBounds(170,300,120,30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        panel.add(back);


        //back  er  kaj
        back.addActionListener(new ActionListener() {
            @Override
            //aikhane  globally  declare kori  naai    tai  constructor  er baire override kori nai vitorei  korsi
            public void actionPerformed(ActionEvent e) {
                //back  er  kj
                setVisible(false);//frame ta  close hbe



            }
        });













//ckout er image

        //get
        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/chk_out.png"));
        Image image=imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);//pass




//image k  label  e niye  add kora   hoy
        JLabel imglabel=new JLabel(imageIcon1);
        imglabel.setBounds(550,150,200,200);
        panel.add(imglabel);







        setUndecorated(true);
        setLayout(null);
        setSize(800, 400);
        setLocation(500, 210);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Checkout();
        });
    }
}
