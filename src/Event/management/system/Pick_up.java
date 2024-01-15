package Event.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Pick_up extends JFrame {

//aitar kaj akhono  baki ,,,ai video  dekha  hoy  ni


    Pick_up()
    {

        super("Pick Up");

        //panel
        JPanel  panel=new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setBounds(5,5,790,590);

        panel.setLayout(null);
        add(panel);

        //JLabel
        JLabel pus=new JLabel("Pick Up Service");//pus  mane holo pick up  service
        pus.setBounds( 90,11,160,25);
        pus.setForeground(Color.WHITE);
        pus.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(pus);


        //JLabel
        JLabel toc=new JLabel("Type of  car:");//pus  mane holo pick up  service
        toc.setBounds( 32,97,89,14);
        toc.setForeground(Color.WHITE);
        toc.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(toc);


        //dropdown for choice
          Choice  c=new Choice();
          c.setBounds(123,94,150,25);
          panel.add(c);

          try{
         con C=new con();
         //query
              ResultSet  resultSet=C.statement.executeQuery("select * from add_driver");
              while (resultSet.next())
              {
                  c.add(resultSet.getString("carname"));//aita copy korbe
              }

          }catch (Exception e)
          {
              e.printStackTrace();
          }


//query er table er jonno
        JTable  table=new JTable();
          table.setBounds(10,233,800,250);
          table.setBackground(new Color(3,45,48));
          table.setForeground(Color.WHITE);
          panel.add(table);
          try{
con C=new con();
String q="select * from add_driver";//  q  a  save  korlam
ResultSet resultSet=C.statement.executeQuery(q);//query kore
              table.setModel(DbUtils.resultSetToTableModel(resultSet));

          }catch (Exception  e)
          {
              e.printStackTrace();
          }


          //label for table
          JLabel name=new JLabel("Name");
          name.setBounds(24,208,46,14);
         name. setForeground(Color.WHITE);
          panel.add(name);


          //label for table
          JLabel age=new JLabel("Age");
        age.setBounds(165,208,46,14);
          age.setForeground(Color.WHITE);
          panel.add(age);




          //label for table
          JLabel gender=new JLabel("Gender");
        gender.setBounds(264,208,46,14);
gender.setForeground(Color.WHITE);
          panel.add(gender);




          //label for table
          JLabel company=new JLabel("Company");
        company.setBounds(366,208,60,14);
        company. setForeground(Color.WHITE);
          panel.add(company);





          //label for table
          JLabel carname=new JLabel("Carname");
        carname.setBounds(486,208,60,14);
        carname.setForeground(Color.WHITE);
          panel.add(carname);





          //label for table
          JLabel available=new JLabel("Available");
        available.setBounds(600,208,60,14);
        available. setForeground(Color.WHITE);
          panel.add(available);





// Label for table
        JLabel location = new JLabel("Location");
        location.setBounds(700, 208, 60, 14);
        location.setForeground(Color.WHITE); // Set the foreground color to white
        panel.add(location);




//button for display
        JButton display=new JButton("Display");
        display.setBounds(200,500,120,30);
        display.setBackground(Color.BLACK);
        display.setForeground(Color.WHITE);
        panel.add(display);

  //actionailty
       display.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String q="select * from add_driver where carname='"+c.getSelectedItem()+"' ";//dropdown tai get selected item kora hoise
               try{
  con c =new con();
  ResultSet resultSet=c.statement.executeQuery(q);//store hoise
                   table.setModel(DbUtils.resultSetToTableModel(resultSet));

               }catch (Exception E)
               {
                E.printStackTrace();
               }
           }
       });






//button for back
        JButton back=new JButton("Back");
        back.setBounds(420,500,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);


        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });





//frame
        setSize(800,600);
        setLocation(500,100);
        setVisible(true);
        setLayout(null);


    }
    public static void main(String[] args) {

        new Pick_up();
    }
}
