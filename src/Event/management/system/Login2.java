package Event.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login2  extends JFrame implements ActionListener {

    JTextField textField1;
    JPasswordField passwordField1;
    JButton b1,b2,b3;
    Login2()
    {

        super("Login 2");

        //username
        JLabel label1=new JLabel("Username");
        label1.setBounds(40,20,100,30);
        label1.setFont(new Font("Tahoma",Font.BOLD,16));
        label1.setForeground(Color.WHITE);
        add(label1);
        //pss
        JLabel label2=new JLabel("Password");
        label2.setBounds(40,70,100,30);//  x  same  thakbe  but  y  change  hbe
        label2.setFont(new Font("Tahoma",Font.BOLD,16));
        label2.setForeground(Color.WHITE);
        add(label2);


        //textfiled  ->  user     enter  kore
        textField1=new JTextField();
        textField1.setBounds(150,20,150,30);
        textField1.setForeground(Color.WHITE);
        setFont(new Font("Tahoma",Font.PLAIN,15));
        textField1.setBackground(new Color(26,104,110));
        add(textField1);


        //password field
        passwordField1=new JPasswordField();
        passwordField1.setBounds(150,70,150,30);
        passwordField1.setForeground(Color.WHITE);
        // setFont(new Font("Tahoma",Font.PLAIN,15));
        //passwordField1.setEchoChar((char) 0); // Show characters as they are
        passwordField1.setBackground(new Color(26,104,110));
        add(passwordField1);
        //Image
//        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/Loogo(1).png"));
//        //scale  korlam image  k  label k  fit korte
//        Image i1=imageIcon.getImage().getScaledInstance(255,300,Image.SCALE_DEFAULT);
//        JLabel label=new JLabel(imageIcon);
//        label.setBounds(318,10,255,300);
//        add(label);



//// ...
//        ImageIcon imageIcon = null;
//        URL iconURL = ClassLoader.getSystemResource("icon/Loogo.png");
//        if (iconURL != null) {
//            imageIcon = new ImageIcon(iconURL);
//        }
//// ...

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/Loogo.png"));


        Image i1=imageIcon.getImage().getScaledInstance(255,300,Image.SCALE_SMOOTH); // Use SCALE_SMOOTH
        ImageIcon newIcon = new ImageIcon(i1);
        JLabel label=new JLabel(newIcon);
        label.setBounds(318,10,255,300);
        add(label);
        //LOGIN button
        b1=new JButton("Login");//button  e  visible  hoy
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);//clk  e  kaj  korrew
        add(b1);

        //CANCEL BUTTON
        b2=new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);


        //CANCEL BUTTON
        b3=new JButton("Change Password or name");
        b3.setBounds(40,190,260,30);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);







        getContentPane().setBackground(new Color(14, 38, 35));
        setLayout(null);
        setLocation(400,190);//center theke
        setSize(700,370);//frame  er
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {





        //b1 holo  login  button
        if(e.getSource()==b1)//login button  e  click korle
        {
            try {
                con c = new con();//object
                String user = textField1.getText();//user ja  input  dibe ta  aikhane  store hbe
                String pass = passwordField1.getText();

               // if (user!="" && pass!="") {
                    //chk  j   sheet  a  ase  kina
                    //query  chalabe
                    String q = "select  * from login2 where user_name='" + user + "'and  password='" + pass + "' ";
                    ResultSet resultSet = c.statement.executeQuery(q);//value  chk  kore   and store kore


                    if (resultSet.next())//jdi  match  hoy  data
                    {


                        // new Dashboard();// aita  redirect kore Dashboard  e  ..mane  close  hbar  age  oita  khule

                        new Admin();

                        setVisible(false);//karon  notun  cls  nai
                    } else//match  na  hole
                    {
                        JOptionPane.showMessageDialog(null, " Invalid ");
                    }
             //   }

                }
            catch(Exception E)
                {
                    E.printStackTrace();
                }

        }
        else if(e.getSource()==b3)
        {
            try{
                new Change_pass_2();
               // setVisible(true);

            }catch (Exception E1)
            {
                E1.printStackTrace();
            }



        }
        else//cancel  button  click  korle  aita(102  dekhabe ) aita na kore akhon aita   er  ager  page  e  jabe
        {
//            System.exit(102);
            new Dashboard();
            setVisible(false);

        }


    }

    public static void main(String[] args) {
        new Login2();
    }
}
