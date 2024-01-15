package Event.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

public class Change_password  extends JFrame {
    Change_password(){
       super("Change Password  or Name page");



       JPanel panel2=new JPanel();
       panel2.setLayout(null);
       panel2.setBounds(0,5,350,350);
       panel2.setBackground(new Color(31, 108, 97));
       add(panel2);

       //background image  change korte hbe
       ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/protection.png"));//path
       Image i1=imageIcon.getImage().getScaledInstance(350,350,Image.SCALE_DEFAULT);
       ImageIcon  imageIcon1=new ImageIcon(i1);

       JLabel label=new JLabel(imageIcon1);
       label.setBounds(0,0,350,350);
       panel2.add(label);






       JPanel panel1=new JPanel();
       panel1.setLayout(null);
       panel1.setBounds(300,5,700,370);
       panel1.setBackground(new Color(3,45,48));
       add(panel1);


       JLabel newPassword=new JLabel("New Password");
        newPassword.setBounds(50,5,150,20);
        newPassword.setBackground(Color.BLACK);
        newPassword.setForeground(Color.WHITE);
        newPassword. setFont(new Font("Tahoma",Font.BOLD,15));
       panel1.add(newPassword);


       JTextField newPasswordd=new JTextField();
        newPasswordd.setBounds(200,10,150,20);
        newPasswordd.setBackground(new Color(17, 142, 152));
       panel1.add(newPasswordd);


//      //textfild   gap 20
//       JLabel password=new JLabel("Password");
//       password.setBounds(100,50,100,20);
//       password.setBackground(Color.BLACK);
//       password.setForeground(Color.WHITE);
//       password. setFont(new Font("Tahoma",Font.BOLD,15));
//       panel1.add(password);
//
//
//       JTextField passwordd=new JTextField();
//       passwordd.setBounds(200,50,150,20);
//       passwordd.setBackground(new Color(17, 142, 152));
//       panel1.add(passwordd);


       //textfild  for  name
       JLabel changename=new JLabel("New  name");
        changename.setBounds(50,90,150,20);
        changename.setBackground(Color.BLACK);
        changename.setForeground(Color.WHITE);
        changename. setFont(new Font("Tahoma",Font.BOLD,15));
       panel1.add(  changename);


       JTextField changenamee=new JTextField();
        changenamee.setBounds(200,90,150,20);
        changenamee.setBackground(new Color(17, 142, 152));
       panel1.add(changenamee);

//
//       //textfild  for   gender
//       JLabel gender=new JLabel("Gender");
//       gender.setBounds(100,130,100,20);
//       gender.setBackground(Color.BLACK);
//       gender.setForeground(Color.WHITE);
//       gender. setFont(new Font("Tahoma",Font.BOLD,15));
//       panel1.add( gender);
//
//
//       JTextField genderr=new JTextField();
//       genderr.setBounds(200,130,150,20);
//       genderr.setBackground(new Color(17, 142, 152));
//       panel1.add(genderr);
//

       //button
       JButton ok=new JButton("Ok");
        ok.setBounds(200,170,100,20);//20 height  and
        ok.setBackground(Color.BLACK);
        ok.setForeground(Color.WHITE);
       panel1.add(ok);
        ok.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               try{
                   con C=new con();
                   String name=changenamee.getText();
                   String pass=newPasswordd.getText();
                   C.statement.executeUpdate("update login set username='"+name+"',password='"+pass+"'");
                   JOptionPane.showMessageDialog(null,"updated Sucessfully");
                   setVisible(false);


               }catch (Exception E)
               {
                   E.printStackTrace();
               }





           }
       });




////textfild
//       JButton alreadyhaveanaccount=new JButton("Already Have AN Account");
//       alreadyhaveanaccount.setBounds(150,210,200,20);
//       alreadyhaveanaccount.setBackground(Color.BLACK);
//       alreadyhaveanaccount.setForeground(Color.WHITE);
//       panel1.add(alreadyhaveanaccount);
//       alreadyhaveanaccount.addActionListener(new ActionListener() {
//           @Override
//           public void actionPerformed(ActionEvent e) {
//               try{
//                   setVisible(false);
//                   new Login();
//
//               }catch (Exception E1)
//               {
//                   E1.printStackTrace();
//               }
//           }
//       });





//frame
       setLayout(null);
       setLocation(400,190);//center theke
       setSize(700,370);//frame  er
       setVisible(true);




   }




    public static void main(String[] args) {
        new Change_password();
    }
}




