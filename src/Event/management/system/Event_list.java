package Event.management.system;




//?creating room?vdo  k  ai khane    add event kora hoise
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Event_list  extends JFrame {
   // JLabel event_name;

    JTable table;//table
    JButton  back;//button



    Event_list()
    {


        //panel

        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,43));
        panel.setLayout(null);
        add(panel);




        //image

        ImageIcon imageicon=new ImageIcon(ClassLoader.getSystemResource("icon/eventlist.png"));//image  nilam
        Image image=imageicon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);//scale korlam
        ImageIcon  imageIcon1=new ImageIcon(image);//scaled kora ta pass korlam
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(600,200,200,200);
        panel.add(label);



        //table
        table=new JTable();
        table.setBounds(10,40,500,400);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            con c=new con();
            String  EventInfo="Select * from  eeeventtt";//query
            ResultSet  resultSet=c.statement.executeQuery(EventInfo);//tai  sob  data  resultset  er vitore store hoy  amader query theke
            //DbUtils use korle   akta jar  file  project  er  library  te install korte hoy project er
            table.setModel(DbUtils.resultSetToTableModel(resultSet));//aitar karone resultset theke table e  giye  store hoy





        }
        catch (Exception e )
        {
            e.printStackTrace();
        }

        //back button
         back=new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(200,500,120,30);
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




        //label  er jonno   mane    aita  hbe column  er  nam of  {{{Event   no}}}}
        //aiJlabel  k  globally  declare korte hbe na karon amar  er pore ar  ake  use  korte hbe na a.....
        //mane  ai  constructor   er baire ake  r  use korte hbe na
        JLabel event_no=new JLabel("Event_no.");
        event_no.setBounds(15,15,80,19);
        event_no.setForeground(Color.WHITE);
        event_no.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(event_no);



        //label  er jonno   mane    aita  hbe column  er  nam of  {{{ event name}}}}
        //aiJlabel  k  globally  declare korte hbe na karon amar  er pore ar  ake  use  korte hbe na a.....
        //mane  ai  constructor   er baire ake  r  use korte hbe na
        JLabel event_name=new JLabel("Event_name");
        event_name.setBounds(110,15,101,19);//150,19);
        event_name.setForeground(Color.WHITE);
        event_name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(event_name);


        //label  er jonno   mane    aita  hbe column  er  nam of  {{{all components}}}}
        //aiJlabel  k  globally  declare korte hbe na karon amar  er pore ar  ake  use  korte hbe na a.....
        //mane  ai  constructor   er baire ake  r  use korte hbe na
        JLabel allComponents=new JLabel("Components");
        allComponents.setBounds(210,15,150,19);
        allComponents.setForeground(Color.WHITE);
        allComponents.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(allComponents);





        //label  er jonno   mane    aita  hbe column  er  nam of  {{{offer}}}}
        //aiJlabel  k  globally  declare korte hbe na karon amar  er pore ar  ake  use  korte hbe na a.....
        //mane  ai  constructor   er baire ake  r  use korte hbe na
        JLabel offer=new JLabel(" Offer");
        offer.setBounds(310,15,80,19);
        offer.setForeground(Color.WHITE);
        offer.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(offer);



        //label  er jonno   mane    aita  hbe column  er  nam of  {{{price}}}}
        //aiJlabel  k  globally  declare korte hbe na karon amar  er pore ar  ake  use  korte hbe na a.....
        //mane  ai  constructor   er baire ake  r  use korte hbe na
        JLabel price=new JLabel("Price");
        price.setBounds(410,15,80,19);
        price.setForeground(Color.WHITE);
        price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(price);






        //event no  aikhane add korinai

       //frame
        setUndecorated(true);//
        setLayout(null);
        setLocation(400,100);//edited
        setSize(900,600);
        setVisible(true);



    }


    public static void main(String[] args) {
        new Event_list();

    }
}
