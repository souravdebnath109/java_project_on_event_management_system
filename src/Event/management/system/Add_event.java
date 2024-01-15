package Event.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//
//public class Add_event extends JFrame  implements ActionListener {
//    //tetx fild  er jonno
//    JTextField t2,t3,t4,t6;
//    JComboBox  t5,t8 ;
//    JButton b1,b2;
// Add_event()//cons
// {
//     //panel
//     JPanel panel=new JPanel();
//     panel.setBounds(5,5,875,490);
//     panel.setBackground(new Color(3,45,48));
//     panel.setLayout(null);
//     add(panel);//panel  k  add korlam frame  e
//
//
//
//     //1st for title
//     JLabel l1=new JLabel("Add Event");
//     l1.setBounds(194,10,160,22);
//     l1.setFont(new Font("Tahoma",Font.BOLD,22));
//     l1.setForeground(Color.WHITE);
//     panel.add(l1);
//
//
//
//
//     //event name  er  jonno
//     JLabel l2=new JLabel("Event Name");
//     l2.setBounds(64,70,152,22);
//     l2.setFont(new Font("Tahoma",Font.BOLD,14));
//     l2.setForeground(Color.WHITE);
//     panel.add(l2);
//
//
//     //text fild of  evewnt name er jonno
//     t2=new JTextField();
//     t2.setBounds(200,70,156,20);
//     t2.setFont(new Font("Tahoma",Font.PLAIN,14));
//     t2.setForeground(Color.WHITE);
//     t2.setBackground(new Color(16,108,115));
//     panel.add(t2);
//
//     //Add components   er  jonno
//     JLabel l3=new JLabel("Add components");//availability  er bodole
//     l3.setBounds(64,110,152,22);
//     l3.setFont(new Font("Tahoma",Font.BOLD,14));
//     l3.setForeground(Color.WHITE);
//     panel.add(l3);
//      //label  3  tai  txt fld  o  3  hte hbe
//     //text fild of  Price  er jonno
//     t3=new JTextField();
//     t3.setBounds(200,110,156,20);
//     t3.setFont(new Font("Tahoma",Font.PLAIN,14));
//     t3.setForeground(Color.WHITE);
//     t3.setBackground(new Color(16,108,115));
//     panel.add(t3);
//
//     //  price er  jonno
//     JLabel l4=new JLabel("Price");//availability  er bodole
//     l4.setBounds(64,150,152,22);
//     l4.setFont(new Font("Tahoma",Font.BOLD,14));
//     l4.setForeground(Color.WHITE);
//     panel.add( l4);
//
////  price er  jonno
//     t4=new JTextField();
//     t4.setBounds(200,150,156,20);
//     t4.setFont(new Font("Tahoma",Font.PLAIN,14));
//     t4.setForeground(Color.WHITE);
//     t4.setBackground(new Color(16,108,115));
//     panel.add(t4);
//
//
//     //   offer er  jonno
//     JLabel l5=new JLabel("Offer");//availability  er bodole
//     l5.setBounds(64,190,152,22);
//     l5.setFont(new Font("Tahoma",Font.BOLD,14));
//     l5.setForeground(Color.WHITE);
//     panel.add( l5);
//     //   offer er  jonno
//
//  //combobox  aikhane theke  choice kora jabe
//     t5=new JComboBox(new String[]{"Gold","Premium","Normal"});
//
//     t5.setBounds(200,190,156,20);
//     t5.setFont(new Font("Tahoma",Font.PLAIN,14));
//     t5.setForeground(Color.WHITE);
//     t5.setBackground(new Color(16,108,115));
//     panel.add(t5);
//
//
//     //  event no  er  jonno
//     JLabel l6=new JLabel("Event No.");//availability  er bodole
//     l6.setBounds(64,230,152,22);
//     l6.setFont(new Font("Tahoma",Font.BOLD,14));
//     l6.setForeground(Color.WHITE);
//     panel.add(l6);
//
////  event no. er  jonno
//     t6=new JTextField();
//     t6.setBounds(200,230,156,20);
//     t6.setFont(new Font("Tahoma",Font.PLAIN,14));
//     t6.setForeground(Color.WHITE);
//     t6.setBackground(new Color(16,108,115));
//     panel.add(t6);
//
//
//
//
//
//     //  availability  er  jonno
//     JLabel l7=new JLabel("Availability");//availability  er bodole
//     l7.setBounds(64,270,152,22);
//     l7.setFont(new Font("Tahoma",Font.BOLD,14));
//     l7.setForeground(Color.WHITE);
//     panel.add(l7);
//
//// avalable er  jonno
//     t8=new JComboBox(new String[]{"Available","Occupied"});
//     t8.setBounds(200,270,156,20);
//     t8.setFont(new Font("Tahoma",Font.PLAIN,14));
//     t8.setForeground(Color.WHITE);
//     t8.setBackground(new Color(16,108,115));
//     panel.add(t8);
//
//
//
//
//
//
//
//
//     //button of add
//    b1=new JButton("Add");
//    b1.setBounds(64,321,111,33);
//    b1.setBackground(Color.BLACK);
//    b1.setForeground(Color.WHITE);
//    b1.addActionListener(this);//jeno click  e  action perform kore
//    panel.add(b1);//panel  e  add korlam
//
//
//     //button of back
//     b2=new JButton("Back");
//     b2.setBounds(198,321,111,33);
//     b2.setBackground(Color.BLACK);
//     b2.setForeground(Color.WHITE);
//     b2.addActionListener(this);
//     panel.add(b2);//panel  e  add korlam
//
//     //Image    er  jonno
//     ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/event.png"));
//      //SCALING  ER  JONNO
//     Image image=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
//      //PASS KORBO IMAGE
//      ImageIcon imageIcon1=new ImageIcon(image);
//      JLabel label=new JLabel(imageIcon1);
//      label.setBounds(500,60,300,300);
//      panel.add(label);
//
//
//
//     //frame
//     setUndecorated(true);
//      setLocation(20,200);
//       setLayout(null);
//       setSize(885,500);
//     setVisible(true);
// }
// //action perform er jonno
//
//
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//     if(e.getSource()==b1)//add e click korle
//     {
//         try{//
//             //obj of  database for connection
//            con c=new con();
//            //1st e  sob data  extract kore string typre  e  rakhlam
//            String eventname=t2.getText();//for event name
//            String offer=(String) t5.getSelectedItem();//for combox
//            String  price=t4.getText();
//            String addcomponent= t3.getText();//foor textfild
//             String eventno=t6.getText();
//             String availability=(String) t8.getSelectedItem();
//
//            //table e data rakha hoy ffrom string
//          String q="insert into eeeventtt values('"+eventno+"','"+availability+"',"+eventname+"','"+addcomponent+"','"+offer+"','"+price+"')";
//
//             c.statement.executeUpdate(q);//table  e data rakhle update hoy
//            JOptionPane.showMessageDialog(null," event successfully added ");
//            setVisible(false);//frame close hoy
//         }catch (Exception E)
//         {
//             E.printStackTrace();
//
//         }
//
//
//
//     }
//     else//back button  e clk korle  oi  page er frame  ta off hoye jay
//     {
//
//setVisible(false);
//
//     }
//
//    }
//
//    public static void main(String[] args) {
//new Add_event();
//    }
//}
//
//
public  class Add_event extends  JFrame  implements  ActionListener{
    JTextField t2,t4,t5,t7;
    JComboBox t3,t6;
    JButton b1,b2;
    Add_event()
    {


        super("Add event");
        JPanel panel=new JPanel();
        panel.setBounds(5,5,875,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);


        //label for add event
        JLabel l1=new JLabel("Add event");
        l1.setBounds(194,10,160,22);
        l1.setFont(new Font("Tahoma",Font.BOLD,22));
        l1.setForeground(Color.WHITE);
        panel.add(l1);

        //event no
        JLabel l2=new JLabel("Event no.");
        l2.setBounds(64,70,152,22);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        l2.setForeground(Color.WHITE);
        panel.add(l2);

        t2 =new JTextField();
        t2.setBounds(200,70,156,20);
        t2.setFont(new Font("Tahoma",Font.PLAIN,14));
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(16,108,115));
        panel.add(t2);

        //availability
        JLabel l3=new JLabel("Availability");
        l3.setBounds(64,110,152,22);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setForeground(Color.WHITE);
        panel.add(l3);

        t3 =new JComboBox(new String[]{"Available","Occupied"});

        t3.setBounds(200,110,156,20);
        t3.setFont(new Font("Tahoma",Font.PLAIN,14));
        t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(16,108,115));
        panel.add(t3);



        //event name
        JLabel l4=new JLabel("Event name");
        l4.setBounds(64,150,152,22);
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        l4.setForeground(Color.WHITE);
        panel.add(l4);

        t4 =new JTextField();
        t4 .setBounds(200,150,156,20);
        t4 .setFont(new Font("Tahoma",Font.PLAIN,14));
        t4 .setForeground(Color.WHITE);
        t4 .setBackground(new Color(16,108,115));
        panel.add(t4);




        //add compionennt
        JLabel l5=new JLabel("Add component");
        l5.setBounds(64,190,152,22);
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        l5.setForeground(Color.WHITE);
        panel.add(l5);

        t5=new JTextField();
        t5 .setBounds(200,190,156,20);
        t5 .setFont(new Font("Tahoma",Font.PLAIN,14));
        t5 .setForeground(Color.WHITE);
        t5 .setBackground(new Color(16,108,115));
        panel.add(t5);



        //add offer
        JLabel l6=new JLabel("Offer");
        l6.setBounds(64,230,152,22);
        l6.setFont(new Font("Tahoma",Font.BOLD,14));
        l6.setForeground(Color.WHITE);
        panel.add(l6);

        t6=new JComboBox(new String[]{"Gold","Platinum","Silver"});
        t6 .setBounds(200,230,156,20);
        t6 .setFont(new Font("Tahoma",Font.PLAIN,14));
        t6 .setForeground(Color.WHITE);
        t6.setBackground(new Color(16,108,115));
        panel.add(t6);



        //price
        JLabel l7=new JLabel("Price");
        l7.setBounds(64,270,152,22);
        l7.setFont(new Font("Tahoma",Font.BOLD,14));
        l7.setForeground(Color.WHITE);
        panel.add(l7);


        t7=new JTextField();
        t7 .setBounds(200,270,156,20);
        t7 .setFont(new Font("Tahoma",Font.PLAIN,14));
        t7 .setForeground(Color.WHITE);
        t7 .setBackground(new Color(16,108,115));
        panel.add(t7);
       // button
        b1=new JButton("ADD");
        b1.setBounds(64,321,111,33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);

        //back
        b2=new JButton("BACK");
        b2.setBounds(198,321,111,33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);
        //image


     //Image    er  jonno
     ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/event.png"));
      //SCALING  ER  JONNO
     Image image=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
      //PASS KORBO IMAGE
      ImageIcon imageIcon1=new ImageIcon(image);
      JLabel label=new JLabel(imageIcon1);
      label.setBounds(500,60,300,300);
      panel.add(label);







        //frame
        setUndecorated(false);
        setLocation(20,200);
        setLayout(null);
        setSize(885,500);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            try{
                con c =new con();
                String eventno=t2.getText();
                String  ava=(String)t3.getSelectedItem();
                String   event_name= t4.getText();
                String   add_component= t5.getText();
                String   offer=(String)t6.getSelectedItem();
                String   price= t7.getText();
//query
                String q="insert into eeeventtt values('"+eventno+"','"+ ava+"','"+event_name+"' ,'"+ add_component+"','"+  offer+"','"+ price +"')";
                c.statement.executeUpdate(q);
                //perferctly run hole
                JOptionPane.showMessageDialog(null,"event Sucessfully Added");
                setVisible(false);






            }
            catch (Exception E)
            {
              E.printStackTrace();
            }
        }
        else
        {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Add_event();

    }
}
