//try_1


//
//
//
//package Event.management.system;
//
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//
//public class Edit_event extends JFrame  implements ActionListener {
//    //tetx fild  er jonno
//    JTextField t2,t3,t4;
//    JComboBox  t5 ;
//    JButton b1,b2;
//    Edit_event() //cons
//    {
//        //panel
//        JPanel panel=new JPanel();
//        panel.setBounds(5,5,875,490);
//        panel.setBackground(new Color(3,45,48));
//        panel.setLayout(null);
//        add(panel);//panel  k  add korlam frame  e
//
//
//
//        //1st for title
//        JLabel l1=new JLabel("Edit  Event");
//        l1.setBounds(194,10,160,22);
//        l1.setFont(new Font("Tahoma",Font.BOLD,22));
//        l1.setForeground(Color.WHITE);
//        panel.add(l1);
//
//
//
//
//        //event name  er  jonno
//        JLabel l2=new JLabel("Event Name");
//        l2.setBounds(64,70,152,22);
//        l2.setFont(new Font("Tahoma",Font.BOLD,14));
//        l2.setForeground(Color.WHITE);
//        panel.add(l2);
//
//
//        //text fild of  evewnt name er jonno
//        t2=new JTextField();
//        t2.setBounds(200,70,156,20);
//        t2.setFont(new Font("Tahoma",Font.PLAIN,14));
//        t2.setForeground(Color.WHITE);
//        t2.setBackground(new Color(16,108,115));
//        panel.add(t2);
//
//
//        //edit_event er
//        //Add components   er  jonno
//        JLabel l3=new JLabel("Add components");//availability  er bodole
//        l3.setBounds(64,110,152,22);
//        l3.setFont(new Font("Tahoma",Font.BOLD,14));
//        l3.setForeground(Color.WHITE);
//        panel.add(l3);
//        //label  3  tai  txt fld  o  3  hte hbe
//        //text fild of  Price  er jonno
//        t3=new JTextField();
//
//        t3.setBounds(200,110,156,20);
//        t3.setFont(new Font("Tahoma",Font.PLAIN,14));
//        t3.setForeground(Color.WHITE);
//        t3.setBackground(new Color(16,108,115));
//        panel.add(t3);
//          //edit class er
//        //  price er  jonno
//        JLabel l4=new JLabel("Price");//availability  er bodole
//        l4.setBounds(64,150,152,22);
//        l4.setFont(new Font("Tahoma",Font.BOLD,14));
//        l4.setForeground(Color.WHITE);
//        panel.add( l4);
//
//     //edit class er
//     //  price er  jonno
//        t4=new JTextField();
//        t4.setBounds(200,150,156,20);
//        t4.setFont(new Font("Tahoma",Font.PLAIN,14));
//        t4.setForeground(Color.WHITE);
//        t4.setBackground(new Color(16,108,115));
//        panel.add(t4);
//
//        //edit class er
//        //   offer er  jonno
//        JLabel l5=new JLabel("Offer");//availability  er bodole
//        l5.setBounds(64,190,152,22);
//        l5.setFont(new Font("Tahoma",Font.BOLD,14));
//        l5.setForeground(Color.WHITE);
//        panel.add( l5);
//
//        ////edit class er
//        //   offer er  jonno
//
//        //combobox  aikhane theke  choice kora jabe
//        t5=new JComboBox(new String[]{"Gold","Premium","Normal"});
//
//        t5.setBounds(200,190,156,20);
//        t5.setFont(new Font("Tahoma",Font.PLAIN,14));
//        t5.setForeground(Color.WHITE);
//        t5.setBackground(new Color(16,108,115));
//        panel.add(t5);
//
////button of edit
//        b1=new JButton("Edit");
//        b1.setBounds(64,321,111,33);
//        b1.setBackground(Color.BLACK);
//        b1.setForeground(Color.WHITE);
//        b1.addActionListener(this);
//        panel.add(b1);
//        //edit class er
//
//
//
//        //button of back
//        b2=new JButton("Back");
//        b2.setBounds(198,321,111,33);
//        b2.setBackground(Color.BLACK);
//        b2.setForeground(Color.WHITE);
//        b2.addActionListener(this);
//        panel.add(b2);//panel  e  add korlam
//
//         //edit_event class er
//        //Image    er  jonno
//        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/editevent.png"));
//        //SCALING  ER  JONNO
//        Image image=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
//        //PASS KORBO IMAGE
//        ImageIcon imageIcon1=new ImageIcon(image);
//        JLabel label=new JLabel(imageIcon1);
//        label.setBounds(500,60,300,300);
//        panel.add(label);
//
//
//
//        //frame
//        setUndecorated(true);
//        setLocation(20,200);
//        setLayout(null);
//        setSize(885,500);
//        setVisible(true);
//    }
//    //action perform er jonno
//
//
//    //action perform er jonno
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == b1) {
//            try {
//                //obj of database for connection
//                con c = new con();
//                //1st e sob data extract kore string type e rakhlam
//                String eventname = t2.getText();
//                String offer = (String) t5.getSelectedItem();
//                String price = t4.getText();
//                String addcomponent = t3.getText();
//
//                //table e data rakha hoy from string
//                String updateQuery = "UPDATE eeeventtt SET add_component = ?, offer = ?, price = ? WHERE event_name = ?";
//                PreparedStatement preparedStatement = c.connection.prepareStatement(updateQuery);
//                preparedStatement.setString(1, addcomponent);
//                preparedStatement.setString(2, offer);
//                preparedStatement.setString(3, price);
//                preparedStatement.setString(4, eventname);
//
//                preparedStatement.executeUpdate();
//                JOptionPane.showMessageDialog(null, "Event successfully edited");
//                setVisible(false);
//            } catch (Exception E) {
//                E.printStackTrace();
//            }
//        } else if (e.getSource() == b2) {
//            setVisible(false);
//        }
//    }
//
//    public static void main(String[] args) {
//        new Edit_event();
//    }
//}
//
//
//
//


//try=2



package Event.management.system;



//event name ta aikhane unique//


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Edit_event extends JFrame implements ActionListener {

    //event name ta aikhane unique//
    JTextField t2, t3, t4;
    JComboBox t5;
    JButton b1, b2;

    public Edit_event() {
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 875, 490);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JLabel l1 = new JLabel("Edit Event");
        l1.setBounds(194, 10, 160, 22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 22));
        l1.setForeground(Color.WHITE);
        panel.add(l1);

        JLabel l2 = new JLabel("Event Name");
        l2.setBounds(64, 70, 152, 22);
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setForeground(Color.WHITE);
        panel.add(l2);

        t2 = new JTextField();
        t2.setBounds(200, 70, 156, 20);
        t2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(16, 108, 115));
        panel.add(t2);

        JLabel l3 = new JLabel("Add components");
        l3.setBounds(64, 110, 152, 22);
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setForeground(Color.WHITE);
        panel.add(l3);

        t3 = new JTextField();
        t3.setBounds(200, 110, 156, 20);
        t3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(16, 108, 115));
        panel.add(t3);

        JLabel l4 = new JLabel("Price");
        l4.setBounds(64, 150, 152, 22);
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setForeground(Color.WHITE);
        panel.add(l4);

        t4 = new JTextField();
        t4.setBounds(200, 150, 156, 20);
        t4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t4.setForeground(Color.WHITE);
        t4.setBackground(new Color(16, 108, 115));
        panel.add(t4);

        JLabel l5 = new JLabel("Offer");
        l5.setBounds(64, 190, 152, 22);
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setForeground(Color.WHITE);
        panel.add(l5);

        t5 = new JComboBox(new String[]{"Gold", "Premium", "Normal"});
        t5.setBounds(200, 190, 156, 20);
        t5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t5.setForeground(Color.WHITE);
        t5.setBackground(new Color(16, 108, 115));
        panel.add(t5);

        b1 = new JButton("Edit");
        b1.setBounds(64, 321, 111, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(198, 321, 111, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/editevent.png"));
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500, 60, 300, 300);
        panel.add(label);

        setUndecorated(true);
        setLocation(20, 200);
        setLayout(null);
        setSize(885, 500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                con c = new con();
                String eventname = t2.getText();
                String offer = (String) t5.getSelectedItem();
                String price = t4.getText();
                String addcomponent = t3.getText();

                String updateQuery = "UPDATE eeeventtt SET event_name = ?, add_component = ?, offer = ?, price = ? WHERE event_name = ?";
                PreparedStatement preparedStatement = c.connection.prepareStatement(updateQuery);
                preparedStatement.setString(1, eventname);
                preparedStatement.setString(2, addcomponent);
                preparedStatement.setString(3, offer);
                preparedStatement.setString(4, price);
                preparedStatement.setString(5, eventname);

                preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Event successfully edited");
                setVisible(false);
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else if (e.getSource() == b2) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Edit_event();
    }
}


