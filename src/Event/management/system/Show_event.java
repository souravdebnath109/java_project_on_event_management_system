

//amar kora AITA
package Event.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Show_event  extends JFrame {
    Show_event()
    {


        super("Show Event Status");
        // Initialize the frame
        setLayout(null);
        setSize(950, 450);
        setLocation(300, 200);
        setVisible(true);

        // Create a panel
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 940, 490);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null); // Set the layout to null
        add(panel);

        // Load and set the image
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/billboard_event.png"));
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(600, 60, 300, 300); // Adjusted position
        panel.add(label);

        // Label fr register detail
        JLabel label1 = new JLabel("Show Event Status");
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
        JLabel label3 = new JLabel("Availability:");
        label3.setBounds(25, 100, 110, 20); // Adjusted position
        label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label3.setForeground(Color.WHITE);
        panel.add(label3);



        //
        JTextField textField3=new JTextField();
        textField3.setBounds(248,100,140,20);
        panel.add(textField3);










        // Label for  allocated_event
        JLabel label8= new JLabel("Event no:");
        label8.setBounds(25, 130, 170, 18); // Adjusted position
        label8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label8.setForeground(Color.WHITE);
        panel.add(label8);



        //
        JTextField textField8=new JTextField();
        textField8.setBounds(248,130,140,20);
        panel.add(textField8);

////BUTTON fr update
//
//        JButton update=new JButton("Update");
//        update.setBounds(120,315,89,23);
//        update.setForeground(Color.WHITE);
//        update.setBackground(Color.BLACK);
//        panel.add(update);
//
//        update.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    connect C = new connect();
//                    String q = c.getSelectedItem();
//                    String allocated_event = textField8.getText();
//                    String name = textField3.getText();
//                //  String register = textField5.getText();
//                   // String deposit = textField6.getText();
//
//
//                    // Modify the SQL query to update the record
//                    String updateQuery = "update customer set name='" + name + "', allocated_event='" + allocated_event +
//                            "',  where number='" + q + "'";
//                    C.statement.executeUpdate(updateQuery);
//                    JOptionPane.showMessageDialog(null, "Updated Successfully");
//                    setVisible(false);
//                } catch (Exception E) {
//                    E.printStackTrace();
//                }
//            }
//        });


//
//// BUTTON for update
//        JButton update = new JButton("Update");
//        update.setBounds(120, 315, 89, 23);
//        update.setForeground(Color.WHITE);
//        update.setBackground(Color.BLACK);
//        panel.add(update);
//
//        update.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    connect C = new connect();
//                    String q = c.getSelectedItem();
//                    String eventNo = textField8.getText();
//                    String availability = "available"; // Set the text to "available"
//
//                    String updateQuery = "update eeeventtt set availability='" + availability + "' where event_no='" + eventNo + "'";
//                    C.statement.executeUpdate(updateQuery);
//                    JOptionPane.showMessageDialog(null, "Updated Successfully");
//                    setVisible(false);
//                } catch (Exception E) {
//                    E.printStackTrace();
//                }
//            }
//        });
//


//BUTTON fr back

        JButton back=new JButton("Back");
        back.setBounds(180,355,89,23);
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
        check.setBounds(60,355,89,23);
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
//                        textField3.setText(resultSet.getString("name"));//strorw hoy//done
//
                        textField8.setText(resultSet.getString("allocated_event"));//strorw hoy//done// textField6.setText(resultSet.getString("deposit"));//strorw hoy//done


                        //pending er jonno
                        //event no  same hole oitar jinis ase
                        ResultSet resultSet1=c.statement.executeQuery("select * from eeeventtt where event_no='"+textField8.getText()+"'");


    // textField5.setText(resultSet.getString("register"));//strorw hoy//done

                        while (resultSet1.next()){
                            textField3.setText(resultSet1.getString("availability"));
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
        SwingUtilities.invokeLater(() -> new Show_event());
    }
}



//by guru____>try-1

