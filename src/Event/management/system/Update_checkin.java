////package Event.management.system;
////
////import javax.swing.*;
////import java.awt.*;
////
////public  class Update_checkin  extends JFrame {
////    Update_checkin(){
////
////        // Load and set the image
////        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/update_by_me.png"));
////        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
////        ImageIcon imageIcon1 = new ImageIcon(image);
////        JLabel label = new JLabel(imageIcon1);
////        label.setBounds(500, 60, 300, 300);
////        panel.add(label);
////
////
////        JPanel  panel=new JPanel();
////        panel.setBounds(5,5,940,490);
////        panel.setBackground(new Color(3,45,48));
////        panel.setLayout(null);
////        add(panel);
////
////
////
////
////        //frame
////        setLayout(null);
////        setSize(950,500);
////        setLocation(400,200);
////        setVisible(true);
////
////    }
////
////    public static void main(String[] args) {
////new Update_checkin();
////    }
////}
//
//
//package Event.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.sql.ResultSet;
//
//public class Update_checkin extends JFrame {
//    Update_checkin() {
//        // Initialize the frame
//        setLayout(null);
//        setSize(950, 500);
//        setLocation(400, 200);
//        setVisible(true);
//
//        // Create a panel
//        JPanel panel = new JPanel();
//        panel.setBounds(5, 5, 940, 490);
//        panel.setBackground(new Color(3, 45, 48));
//        panel.setLayout(null); // Set the layout to null
//        add(panel);
//
//        // Load and set the image
//        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/update_by_me.png"));
//        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
//        ImageIcon imageIcon1 = new ImageIcon(image);
//        JLabel label = new JLabel(imageIcon1);
//        label.setBounds(500, 60, 300, 300);
//        panel.add(label);
//
////label
//        JLabel label1=new JLabel("Register Details");
//        label1.setBounds(124,-120,222,300);
//        label1.setFont(new Font("Tahoma",Font.BOLD,25));
//        label1.setForeground(Color.WHITE);
//        panel.add(label1);
//
//
////label
//        JLabel label2=new JLabel("ID");
//        label2.setBounds(25,88,46,14);
//        label2.setFont(new Font("Tahoma",Font.PLAIN,20));
//        label2.setForeground(Color.WHITE);
//        panel.add(label2);
//
//
//        //choice
//        Choice c=new Choice();
//        c.setBounds(248,85,140,20);
//        panel.add(c);
//        try{
//            connect C=new connect();
//            ResultSet resultSet=C.statement.executeQuery("select * from customer");
//           while (resultSet.next())
//           {
//          C.add(resultSet.getString("number"));
//           }
//        }catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//
//
//
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> new Update_checkin());
//    }
//}

//
//package Event.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.sql.ResultSet;
//
//public class Update_checkin extends JFrame {
//    Update_checkin() {
//        // Initialize the frame
//        setLayout(null);
//        setSize(950, 500);
//        setLocation(400, 200);
//        setVisible(true);
//
//        // Create a panel
//        JPanel panel = new JPanel();
//        panel.setBounds(5, 5, 940, 490);
//        panel.setBackground(new Color(3, 45, 48));
//        panel.setLayout(null); // Set the layout to null
//        add(panel);
//
//        // Load and set the image
//        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/update_by_me.png"));
//        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
//        ImageIcon imageIcon1 = new ImageIcon(image);
//        JLabel label = new JLabel(imageIcon1);
//        label.setBounds(500, 60, 300, 300);
//        panel.add(label);
//
//        // label
//        JLabel label1 = new JLabel("Register Details");
//        label1.setBounds(124, -120, 222, 300);
//        label1.setFont(new Font("Tahoma", Font.BOLD, 25));
//        label1.setForeground(Color.WHITE);
//        panel.add(label1);
//
//        // label
//        JLabel label2 = new JLabel("ID");
//        label2.setBounds(25, 88, 40, 14);
//        label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        label2.setForeground(Color.WHITE);
//        panel.add(label2);
//
//        // Choice
//        Choice c = new Choice();
//        c.setBounds(100, 85, 250, 20);
//        panel.add(c);
//        try {
//            connect C = new connect();
//            ResultSet resultSet = C.statement.executeQuery("select * from customer");
//            while (resultSet.next()) {
//                c.add(resultSet.getString("number"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> new Update_checkin());
//    }
//}


package Event.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Update_checkin extends JFrame {
    Update_checkin() {

        super("Update Check in Page");
        // Initialize the frame
        setLayout(null);
        setSize(950, 500);
        setLocation(300, 150);
        setVisible(true);

        // Create a panel
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 940, 490);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null); // Set the layout to null
        add(panel);

        // Load and set the image
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/update_by_me.png"));
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(600, 60, 300, 300); // Adjusted position
        panel.add(label);

        // Label fr register detail
        JLabel label1 = new JLabel("Register Details");
        label1.setBounds(25, 30, 300, 30); // Adjusted position
        label1.setFont(new Font("Tahoma", Font.BOLD, 25));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        // Label for id
        JLabel label2 = new JLabel("ID");
        label2.setBounds(25, 70, 40, 20); // Adjusted position
        label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        // Choice
        Choice c = new Choice();
        c.setBounds(248, 70, 150, 20); // Adjusted position
        panel.add(c);
        try {
            connect C = new connect();
            ResultSet resultSet = C.statement.executeQuery("select * from customer");
            while (resultSet.next()) {
                c.add(resultSet.getString("number"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }




        // Label fr name
        JLabel label3 = new JLabel("Name:");
        label3.setBounds(25, 129, 97, 20); // Adjusted position
        label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label3.setForeground(Color.WHITE);
        panel.add(label3);



        //
        JTextField textField3=new JTextField();
        textField3.setBounds(248,129,140,20);
        panel.add(textField3);




        // Label for gender
        JLabel label4 = new JLabel("Gender");
        label4.setBounds(25, 174, 97, 20); // Adjusted position
        label4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        //
        JTextField textField4=new JTextField();
        textField4.setBounds(248,174,140,20);
        panel.add(textField4);



        // Label for register time
        JLabel label5= new JLabel("Register time");
        label5.setBounds(25, 216, 170, 20); // Adjusted position
        label5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label5.setForeground(Color.WHITE);
        panel.add(label5);



        //
        JTextField textField5=new JTextField();
        textField5.setBounds(248,216,140,20);
        panel.add(textField5);

        // Label for amount paid
        JLabel label6= new JLabel("Amount paid :");
        label6.setBounds(25, 261, 170, 18); // Adjusted position
        label6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label6.setForeground(Color.WHITE);
        panel.add(label6);



        //
        JTextField textField6=new JTextField();
        textField6.setBounds(248,261,140,20);
        panel.add(textField6);

        // Label for pending amount
        JLabel label7= new JLabel("Pending Amount:");
        label7.setBounds(25, 302, 170, 18); // Adjusted position
        label7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label7.setForeground(Color.WHITE);
        panel.add(label7);



        //
        JTextField textField7=new JTextField();
        textField7.setBounds(248,302,140,20);
        panel.add(textField7);

        // Label for  allocated_event
        JLabel label8= new JLabel("Event no:");
        label8.setBounds(25, 343, 170, 18); // Adjusted position
        label8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label8.setForeground(Color.WHITE);
        panel.add(label8);



        //
        JTextField textField8=new JTextField();
        textField8.setBounds(248,343,140,20);
        panel.add(textField8);

//BUTTON fr update

        JButton update=new JButton("Update");
        update.setBounds(56,378,89,23);
        update.setForeground(Color.WHITE);
        update.setBackground(Color.BLACK);
        panel.add(update);
//        update.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try{
//                connect  C=new connect();
//                String q=c.getSelectedItem();
//                String allocated_event =textField8.getText();//evnt_2
//                String name=textField3.getText();//name_1
//                String register=textField5.getText();//register_3
//                String deposit=textField6.getText();//deposit_4
//              // String gender=textField4.getText();//gender_
//                    C.statement.executeUpdate("update customer set name='"+name+"',allocated_event='"+allocated_event+"',register='"+register+"',deposit='"+deposit+"',where  number='"+q+"'");
//                    JOptionPane.showMessageDialog(null,"Updated Successfully");
//                    setVisible(false);
//
//
//
//                }catch (Exception E )
//                {
//                    E.printStackTrace();
//
//                }            }
//        });


        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    connect C = new connect();
                    String q = c.getSelectedItem();
                    String allocated_event = textField8.getText();
                    String name = textField3.getText();
                    String register = textField5.getText();
                    String deposit = textField6.getText();

                    // Modify the SQL query to update the record
                    String updateQuery = "update customer set name='" + name + "', allocated_event='" + allocated_event +
                            "', register='" + register + "', deposit='" + deposit + "' where number='" + q + "'";
                    C.statement.executeUpdate(updateQuery);
                    JOptionPane.showMessageDialog(null, "Updated Successfully");
                    setVisible(false);
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });




//BUTTON fr back

        JButton back=new JButton("Back");
        back.setBounds(168,378,89,23);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        panel.add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        //chk btn
        //BUTTON fr chk

        JButton check=new JButton("Check");
        check.setBounds(281,378,89,23);
        check.setForeground(Color.WHITE);
        check.setBackground(Color.BLACK);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // String id=c.getSelectedItem();
                // String q="select * from where  customer number ='"+id+"' ";
                String id = c.getSelectedItem();
                String q = "SELECT * FROM customer WHERE number='" + id + "'";

                try{
                    connect c=new connect();
                    ResultSet resultSet=c.statement.executeQuery(q);
                    while(resultSet.next()){
                        textField3.setText(resultSet.getString("name"));//strorw hoy//done
                        textField4.setText(resultSet.getString("gender"));//strorw hoy//done
                        textField5.setText(resultSet.getString("register"));//strorw hoy//done
                        textField8.setText(resultSet.getString("allocated_event"));//strorw hoy//done
                        textField6.setText(resultSet.getString("deposit"));//strorw hoy//done


                        //pending er jonno
                        ResultSet resultSet1=c.statement.executeQuery("select * from eeeventtt   where event_no='"+textField8.getText()+"'");//event no  same hole oitar jinis ase

                        while (resultSet1.next()){
                            String price=resultSet1.getString("price");//price colum theke data lagebe
                            int  amountpaid=Integer.parseInt(price)-Integer.parseInt(textField6.getText());
                            if(Integer.parseInt(price)<Integer.parseInt(textField6.getText())){
                                textField7.setText("Extra paid");
                            }else textField7.setText(""+amountpaid);
                        }
                    }


                }catch (Exception E)
                {
                    E.printStackTrace();
                }


            }
        });




    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Update_checkin());
    }
}






