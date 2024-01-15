package Event.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Search_event extends JFrame  implements ActionListener {
    JCheckBox checkBox;
    Choice  choice;
    JTable  table;
    JButton  add,back;








    Search_event(){

//panel
JPanel  panel=new JPanel();
panel.setBackground(new Color(3,45,48));
panel.setBounds(5,5,690,490);
panel.setLayout(null);
add(panel);


JLabel searchevent=new JLabel("search   for event");
        searchevent.setBounds(200,11,220,31);
        searchevent.setForeground(Color.WHITE);
        searchevent.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(searchevent);



        //event no or  id

        JLabel evntnmbbr=new JLabel("Event number:");
        evntnmbbr.setBounds(5,162,150,20);
        evntnmbbr.setForeground(Color.WHITE);
        evntnmbbr.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(evntnmbbr);


         //available
        JLabel availability=new JLabel("Availability:");
        availability.setBounds(120,162,150,20);
        availability.setForeground(Color.WHITE);
        availability.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(availability);




//
//
//        //price
//        JLabel price=new JLabel("Availability:");
//        price.setBounds(458,162,150,20);
//        price.setForeground(Color.WHITE);
//        price.setFont(new Font("Tahoma",Font.BOLD,14));
//        panel.add(price);
//


        //event  name
        JLabel evnt_name=new JLabel("Event name:");
        evnt_name.setBounds(235,162,150,20);
        evnt_name.setForeground(Color.WHITE);
        evnt_name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(evnt_name);








        //components
        JLabel components_name=new JLabel("Components:");
        components_name.setBounds(350,162,150,20);
        components_name.setForeground(Color.WHITE);
        components_name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(components_name);




        //offer
        JLabel offer=new JLabel("Offer:");
        offer.setBounds(470,162,150,20);
        offer.setForeground(Color.WHITE);
        offer.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(offer);





        //price
        JLabel price=new JLabel("Price:");
        price.setBounds(580,162,150,20);
        price.setForeground(Color.WHITE);
        price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(price);





        JLabel rbt=new JLabel("Offer type:");
        rbt.setBounds(15,73,120,20);
        rbt.setForeground(Color.WHITE);
        rbt.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(rbt);





        //checkbox

        checkBox =new JCheckBox("Only display available");
        checkBox.setBounds(500,69,205,23);
        checkBox.setForeground(Color.WHITE);
        checkBox.setBackground(new Color(3,45,48));
        panel.add(checkBox);



        //choice
        choice=new Choice();
        choice.add("platinum");
        choice.add("gold");
        choice.add("silver");
        choice.setBounds(140,70,120,20);
        panel.add(choice);

        //table

     table=new JTable();
     table.setBounds(0,187,700,150);
     table.setBackground(new Color(3,45,48));
     table.setForeground(Color.WHITE);
     panel.add(table);

try
{
    con c=new con();
    String q="select * from eeeventtt";
    ResultSet resultSet=c.statement.executeQuery(q);//query  data  of table  ber  hobe
    table.setModel(DbUtils.resultSetToTableModel(resultSet));//table  e  query  er  result k  nilam

}catch (Exception e)
{
    e.printStackTrace();


}
//add button
add=new JButton("Search");
add.setBounds(200,400,120,30);
add.setBackground(Color.BLACK);
add.setForeground(Color.WHITE);
add.addActionListener(this);
panel.add(add);


//back button
        back =new JButton("Back");
        back .setBounds(380,400,120,30);
        back .setBackground(Color.BLACK);
        back .setForeground(Color.WHITE);
        back.addActionListener(this);
panel.add(back );













        //frame
     // JLable search_for_room;
        setUndecorated(true);
        setLocation(500,100);
        setLayout(null);
        setSize(700,500);
       setVisible(true);
    }

    @Override//change  lagbe
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add)
        {
            String Q="select * from eeeventtt where offer='"+choice.getSelectedItem()+"'";//change  lagbe
            String Q1="select * from eeeventtt where Availability='Available'  And offer='"+choice.getSelectedItem()+"'";//change  lagbe
           try{
               con c =new con();
               ResultSet resultSet=c.statement.executeQuery(Q);
               table.setModel(DbUtils.resultSetToTableModel(resultSet));


               if(checkBox.isSelected())
               {
                   ResultSet resultSet1=c.statement.executeQuery(Q1);
                   table.setModel(DbUtils.resultSetToTableModel(resultSet1));

               }



           }catch (Exception E)
           {

           }


        }

        else {
            setVisible(false);
        }



    }

    public  static void main(String[] args)
    {

        new Search_event();
    }



}
