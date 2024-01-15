package Event.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Admin extends JFrame implements ActionListener {

   JButton add_Event,delete_event,add_Employee,edit_event,edit_employee,add_driver,logout,back;



    Admin()
    {


        super("EVENT MANAGEMENT SYSTEM");

        //sob button  e  x  same  thakbe  and y chng hbe
        //add employee button
        add_Employee=new JButton("ADD EMPLOYEE");//SHOW KORBE
        add_Employee.setBounds(250,230,200,30);
        add_Employee.setBackground(Color.WHITE);
        add_Employee.setForeground(Color.BLACK);
        add_Employee.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Employee.addActionListener(this);
        add(add_Employee);


        //add  button for add event
        add_Event=new JButton("ADD EVENT");//SHOW KORBE
        add_Event.setBounds(250,380,200,30);
        add_Event.setBackground(Color.WHITE);
        add_Event.setForeground(Color.BLACK);
        add_Event.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Event.addActionListener(this);
        add(add_Event);



        //add  button for edit event
        edit_event=new JButton("EDIT  EVENT");//SHOW KORBE
        edit_event.setBounds(250,530,200,30);
        edit_event.setBackground(Color.WHITE);
        edit_event.setForeground(Color.BLACK);
        edit_event.setFont(new Font("Tahoma",Font.BOLD,15));
        edit_event.addActionListener(this);
        add(edit_event);



        //add  button for LOGOUT
        logout=new JButton("LOGOUT");//SHOW KORBE
        logout.setBounds(5,650,150,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.setFont(new Font("Tahoma",Font.BOLD,15));
        logout.addActionListener(this);
        add(logout);




        //add  button for back
        back=new JButton("BACK");//SHOW KORBE
        back.setBounds(170,650,150,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.addActionListener(this);
        add(back);






        //sob button  e  x  same  thakbe  and y chng hbe
        //edit employee button
        edit_employee=new JButton("EDIT EMPLOYEE");//SHOW KORBE
        edit_employee.setBounds(550,230,200,30);
        edit_employee.setBackground(Color.WHITE);
        edit_employee.setForeground(Color.BLACK);
        edit_employee.setFont(new Font("Tahoma",Font.BOLD,15));
        edit_employee.addActionListener(this);
        add(edit_employee);





        //add  button for   delete_event         //250,380,200,30);
        delete_event=new JButton("DELETE EVENT");//SHOW KORBE
        delete_event.setBounds(550,380,200,30);
        delete_event.setBackground(Color.WHITE);
        delete_event.setForeground(Color.BLACK);
        delete_event.setFont(new Font("Tahoma",Font.BOLD,15));
        delete_event.addActionListener(this);
        add(delete_event);




        //add  button for   add_driver
        add_driver=new JButton("ADD DRIVER");//SHOW KORBE
        add_driver.setBounds(550,530,200,30);
        add_driver.setBackground(Color.WHITE);
        add_driver.setForeground(Color.BLACK);
        add_driver.setFont(new Font("Tahoma",Font.BOLD,15));
        add_driver.addActionListener(this);
        add(add_driver);

       //image  er jonno for add employee
       ImageIcon  l1=new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
       Image  l11=l1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon=new ImageIcon(l11);//pass
        JLabel label=new JLabel(imageIcon);
        label.setBounds(70,180,120,120);
        add(label);



        //image  er jonno for  add event
        ImageIcon  imageIcon1=new ImageIcon(ClassLoader.getSystemResource("icon/event.png"));
        Image  image= imageIcon1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon11=new ImageIcon(image);//pass
        JLabel label1=new JLabel(imageIcon11);
        label1.setBounds(70,340,120,120);
        add(label1);



        //image  er jonno for  edit event
        ImageIcon  imageIcon2=new ImageIcon(ClassLoader.getSystemResource("icon/editevent.png"));
        Image  image1= imageIcon2.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon12=new ImageIcon(image1);//pass
        JLabel label2=new JLabel(imageIcon12);
        label2.setBounds(70,520,120,120);
        add(label2);



        //image  er jonno for  edit employee         //e.setBounds(550,230,200,30);
        ImageIcon  imageIcon21=new ImageIcon(ClassLoader.getSystemResource("icon/editemployees.png"));
        Image  image109= imageIcon21.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon112=new ImageIcon(image109);//pass
        JLabel label21=new JLabel(imageIcon112);
        label21.setBounds(770,180,120,120);
        add(label21);





     //image  er jonno for  deleteevent       //.setBounds(70,340,120,120);
        ImageIcon  imageIcon211=new ImageIcon(ClassLoader.getSystemResource("icon/delete_event.png"));
        Image  image108= imageIcon211.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon113=new ImageIcon(image108);//pass
        JLabel label22=new JLabel(imageIcon113);
        label22.setBounds(770,340,120,120);
        add(label22);




       // image  er jonno for  logo      //.setBounds(70,340,120,120);
        ImageIcon  imageIcon23=new ImageIcon(ClassLoader.getSystemResource("icon/Loogo.png"));
        Image  image110= imageIcon23.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon imageIcon114=new ImageIcon(image110);//pass
        JLabel label221=new JLabel(imageIcon114);
        label221.setBounds(1000,390,250,250);
        add(label221);


        //image  er jonno for  ADDdriver     //.setBounds(70,340,120,120);
        ImageIcon  imageIcon2023=new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image  image111= imageIcon2023.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon121=new ImageIcon(image111);//pass
        JLabel label2211=new JLabel(imageIcon121);
        label2211.setBounds(770,500,120,120);
        add(label2211);







        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add_Employee)
        {
            //AI BUTTON  E  CLK KORLE  AIKHN=ANE  REDIRECT HOY
             new Add_employee();

        }
        else if (e.getSource()==add_Event) {
            new Add_event();//oi page  e  jabe

        }
        //edit event e jay  jaitar main kaj add event er code tai nisi pore chyange koete hbe
        else if (e.getSource()==edit_event) {

            new Edit_event();

        }
        //edit event e jay  jaitar main kaj add employee er code tai nisi pore chyange koete hbe

        else if (e.getSource()==edit_employee) {
            new Edit_employee();

        }
//
//        else if (e.getSource()==add_Event) {
//
//        }

        else if (e.getSource()==delete_event) {
            new Delete_event();

        }
          //add driver er jonno
        else if (e.getSource()==add_driver) {
            new Add_driver();//click  korle  redirect kore  ai  page  ta

        }

        else if (e.getSource()==logout) {
            System.exit(102);//aita  jekonota hote pare

        }


        else if (e.getSource()==back) {
            new Dashboard();//dash board open hoy
            setVisible(false);//ai  frame  ta  tokhon close tai aikhane  set  visibility  false kora hoise

        }



    }

    public static void main(String[] args) {
        new Admin();
    }
}
