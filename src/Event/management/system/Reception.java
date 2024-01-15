package Event.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception  extends JFrame  {
    //JButton back;
    //constructor
    Reception()
    {
        super("Receiption");

       //panel
      JPanel panel=new JPanel();
      panel.setLayout(null);
      panel.setBounds(230,5,1230,820);
      panel.setBackground(new Color(3,45,48));
      add(panel);

      //panel
      JPanel panel1=new JPanel();
      panel1.setLayout(null);
      panel1.setBounds(5,5,270,820);
      panel1.setBackground(new Color(31, 108, 97));
      add(panel1);


        //login er jonno
        ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icon/Loogo.png"));//path
        Image i2=i11.getImage().getScaledInstance(250,250,Image.SCALE_SMOOTH);
        ImageIcon  imageIcon1=new ImageIcon(i2);
        JLabel label1=new JLabel(imageIcon1);
        label1.setBounds(5,430,250,250);//aita x and  y  axis theke distance  fix  kore
        panel1.add(label1);



      //button _> new customer info
      JButton btnNCF=new JButton("New customer form");
      btnNCF.setBounds(15,10,200,20);//20 height  and
      btnNCF.setBackground(Color.BLACK);
      btnNCF.setForeground(Color.WHITE);
      panel1.add(btnNCF);

      btnNCF.addActionListener(new ActionListener() {//this  er  bodole
          @Override
          public void actionPerformed(ActionEvent e) {
              try{
                 new  New_customer();

          }
              catch (Exception E)
              {
                  E.printStackTrace();
              }
          }
      });



      //button _> Event list
      JButton btnEventlist=new JButton("Event list");
        btnEventlist.setBounds(15,35,200,20);//25 kore y  e  gap  and  height  20
        btnEventlist.setBackground(Color.BLACK);
        btnEventlist.setForeground(Color.WHITE);
      panel1.add(btnEventlist);

        btnEventlist.addActionListener(new ActionListener() {//this  er  bodole
          @Override
          public void actionPerformed(ActionEvent e) {

              try{


                  new  Event_list();//class er  object  banalam aikhane //recption e  room  e  clk hiol;e  toikhn event list  page  e  chole jay


              }
              catch (Exception E)
              {
                  E.printStackTrace();
              }
          }
      });



        //button _>customer info
      JButton btncustminfo=new JButton("Customer info");
        btncustminfo.setBounds(15,60,200,20);
        btncustminfo.setBackground(Color.BLACK);
        btncustminfo.setForeground(Color.WHITE);
      panel1.add(btncustminfo);

        btncustminfo.addActionListener(new ActionListener() {//this  er  bodole
          @Override
          public void actionPerformed(ActionEvent e) {
              try{
                  new Customer_information();
          }
              catch (Exception E)
              {
                  E.printStackTrace();
              }
          }
      });


        //button _> update event  info
        JButton btnupdate_event_info= new JButton("Show  specific  Event info.");
        btnupdate_event_info.setBounds(15,85,200,20);
        btnupdate_event_info.setBackground(Color.BLACK);
        btnupdate_event_info.setForeground(Color.WHITE);
        panel1.add(btnupdate_event_info);

        btnupdate_event_info.addActionListener(new ActionListener() {//this  er  bodole
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Show_event();

                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        //button _>customer info
        JButton btnupdateinfocustm=new JButton("Update customer  info.");
        btnupdateinfocustm.setBounds(15,110,200,20);
        btnupdateinfocustm.setBackground(Color.BLACK);
        btnupdateinfocustm.setForeground(Color.WHITE);
        panel1.add(btnupdateinfocustm);

        btnupdateinfocustm.addActionListener(new ActionListener() {//this  er  bodole
            @Override
            public void actionPerformed(ActionEvent e) {
                try{//oi  class  crt  hobar  por  aikhane  functionality  add korbo
                 new Update_checkin();
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });


        //button _>all  employee  info
        JButton btnallemployeinfo=new JButton("All employee info.");
        btnallemployeinfo.setBounds(15,135,200,20);
        btnallemployeinfo.setBackground(Color.BLACK);
        btnallemployeinfo.setForeground(Color.WHITE);
        panel1.add(btnallemployeinfo);

        btnallemployeinfo.addActionListener(new ActionListener() {//this  er  bodole
            @Override
            public void actionPerformed(ActionEvent e) {
                try{//oi  class  crt  hobar  por  aikhane  functionality  add korbo
                    new Allemployee();
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });
        //for pick service
        JButton btn_pickservice=new JButton("Pick up service");
        btn_pickservice.setBounds(15,160,200,20);
        btn_pickservice.setBackground(Color.BLACK);
        btn_pickservice.setForeground(Color.WHITE);
        panel1.add(btn_pickservice);

        btn_pickservice.addActionListener(new ActionListener() {//this  er  bodole
            @Override
            public void actionPerformed(ActionEvent e) {
                try{//oi  class  crt  hobar  por  aikhane  functionality  add korbo
                    new Pick_up();
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });



        //for sech event
        JButton btn_searchevent=new JButton("Search event");
        btn_searchevent.setBounds(15,185,200,20);
        btn_searchevent.setBackground(Color.BLACK);
        btn_searchevent.setForeground(Color.WHITE);
        panel1.add(btn_searchevent);

        btn_searchevent.addActionListener(new ActionListener() {//this  er  bodole
            @Override
            public void actionPerformed(ActionEvent e) {
                try{//oi  class  crt  hobar  por  aikhane  functionality  add korbo
                    new Search_event();//button  e  clk korle  aita  kaj kore
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });






        //for department
        JButton btn_department=new JButton("Department");
        btn_department.setBounds(15,210,200,20);
        btn_department.setBackground(Color.BLACK);
        btn_department.setForeground(Color.WHITE);
        panel1.add(btn_department);

        btn_department.addActionListener(new ActionListener() {//this  er  bodole
            @Override
            public void actionPerformed(ActionEvent e) {
                try{//oi  class  crt  hobar  por  aikhane  functionality  add korbo
                  new Department();//aitr jonno  department e  clk korle  department cls  open hoy
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });




        //for booked or checkout  or mark
        JButton btn_mark=new JButton(" Checkout ");
        btn_mark.setBounds(15,235,200,20);
        btn_mark.setBackground(Color.BLACK);
        btn_mark.setForeground(Color.WHITE);
        panel1.add(btn_mark);

        btn_mark.addActionListener(new ActionListener() {//this  er  bodole
            @Override
            public void actionPerformed(ActionEvent e) {
                try{//oi  class  crt  hobar  por  aikhane  functionality  add korbo
                    new Checkout();
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });





        //for manager info
        JButton btn_managerinfo=new JButton(" Manager info ");
        btn_managerinfo.setBounds(15,260,200,20);
        btn_managerinfo.setBackground(Color.BLACK);
        btn_managerinfo.setForeground(Color.WHITE);
        panel1.add(btn_managerinfo);

        btn_managerinfo.addActionListener(new ActionListener() {//this  er  bodole
            @Override
            public void actionPerformed(ActionEvent e) {
                try{//oi  class  crt  hobar  por  aikhane  functionality  add korbo
                   new Managerinfo();
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });











        //for  back buttoin
        JButton btn_back=new JButton(" Back ");
        btn_back.setBounds(20,300,100,20);
        btn_back.setBackground(Color.BLACK);
        btn_back.setForeground(Color.WHITE);
        panel1.add(btn_back);

        btn_back.addActionListener(new ActionListener() {//this  er  bodole
            @Override
            public void actionPerformed(ActionEvent e) {
                try{//oi  class  crt  hobar  por  aikhane  functionality  add korbo
                   new Dashboard();
                   setVisible(false);
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });







        //for  book
        JButton btn_book=new JButton(" Book Car ");
        btn_book.setBounds(20,400,100,20);
        btn_book.setBackground(Color.BLACK);
        btn_book.setForeground(Color.WHITE);
        panel1.add(btn_book);

        btn_book.addActionListener(new ActionListener() {//this  er  bodole
            @Override
            public void actionPerformed(ActionEvent e) {
                try{//oi  class  crt  hobar  por  aikhane  functionality  add korbo
                    // new Managerinfo();
                    new  Book_driver();
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });








        //for sech event
        JButton btn_logout=new JButton("Logout");
        btn_logout.setBounds(20,350,100,20);
        btn_logout.setBackground(Color.BLACK);
        btn_logout.setForeground(Color.WHITE);
        panel1.add(btn_logout);

        btn_logout.addActionListener(new ActionListener() {//this  er  bodole
            @Override
            public void actionPerformed(ActionEvent e) {
                try{//oi  class  crt  hobar  por  aikhane  functionality  add korbo
                    new Login();
                    setVisible(false);
                    //new Search_event();//button  e  clk korle  aita  kaj kore
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });



//
//
//        //add  button for back
//        back=new JButton("BACK");//SHOW KORBE
//        back.setBounds(15,700,150,30);
//        back.setBackground(Color.BLACK);
//        back.setForeground(Color.WHITE);
//        back.setFont(new Font("Tahoma",Font.BOLD,15));
//        back.addActionListener(this);
//        add(back);
//
//







        // For the reception image
        ImageIcon i113 = new ImageIcon(ClassLoader.getSystemResource("icon/Rcptn.jpg"));
        Image i23 = i113.getImage().getScaledInstance(1230, 820, Image.SCALE_SMOOTH);// panel.setBounds(230,5,1230,820);
        ImageIcon imageIcon123 = new ImageIcon(i23);
        JLabel label123 = new JLabel(imageIcon123);
        label123.setBounds(0, 0, 1230, 820); // Adjust the coordinates here1230,820);
        panel.add(label123);






        //frame

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);







    }
//    @Override
//    public  void actionPerformed(ActionEvent e)
//    {
//        if(e.getSource()==back)
//        {
//            new Dashboard();//
//            this.setVisible(false);
//        }
//
//    }
















    //main  function
    public static void main(String[] args) {
     new Reception();//object of  constructor
    }
}
