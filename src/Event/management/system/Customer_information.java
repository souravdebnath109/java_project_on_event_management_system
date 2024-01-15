package Event.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Customer_information extends JFrame
{
    //constructor
    Customer_information()
{






//frame e te  panel  add kolam
    JPanel panel = new JPanel();
    panel.setBackground(new Color(3, 45, 48));
    panel.setLayout(null);

// Set the panel's size to match the frame's size
    panel.setBounds(0, 0, 890, 590);

    add(panel);



//Table
        JTable table=new JTable();
        table.setBounds(10,40,900,450);
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(3,45,48));
        panel.add(table);



try{
    con c=new con();
    String q="select  * from customer";//table  er  nam
    ResultSet resultSet=c.statement.executeQuery(q);//query theke j data ase  ta  ase  resulkt set er vitore store hbe
    table.setModel(DbUtils.resultSetToTableModel(resultSet));//data ber hoye  table  e  store hoise



}catch(Exception e )
{
    e.printStackTrace();
}
//id  er  label  ja  table  er  heading
JLabel id=new JLabel("ID");
id.setBounds(31,11,100,14);
id.setForeground(Color.WHITE);
id.setFont(new Font("Tahoma",Font.BOLD,14));
panel.add(id);

//number iakhne hbe


    JLabel number=new JLabel("Number");
    number.setBounds(150,11,100,14);
    number.setForeground(Color.WHITE);
    number.setFont(new Font("Tahoma",Font.BOLD,14));
    panel.add(number);

    //name iakhne hbe


    JLabel name=new JLabel("Name");
    name.setBounds(270,11,100,14);
    name.setForeground(Color.WHITE);
    name.setFont(new Font("Tahoma",Font.BOLD,14));
    panel.add(name);



    //gender iakhne hbe


    JLabel gender=new JLabel("Gender");
    gender.setBounds(360,11,100,14);
    gender.setForeground(Color.WHITE);
    gender.setFont(new Font("Tahoma",Font.BOLD,14));
    panel.add(gender);



  //Age iakhne hbe


    JLabel Age=new JLabel("Age");
    Age.setBounds(480,11,100,14);
    Age.setForeground(Color.WHITE);
    Age.setFont(new Font("Tahoma",Font.BOLD,14));
    panel.add(Age);




  //allocated event number ta  iakhne hbe


    JLabel allocated_event=new JLabel("Total events:");
    allocated_event.setBounds(600,11,100,14);
    allocated_event.setForeground(Color.WHITE);
    allocated_event.setFont(new Font("Tahoma",Font.BOLD,14));
    panel.add(allocated_event);




  //time number ta  iakhne hbe


    JLabel time=new JLabel("Time:");
    time.setBounds(720,11,100,14);
    time.setForeground(Color.WHITE);
    time.setFont(new Font("Tahoma",Font.BOLD,14));
    panel.add(time);




  //deposit number ta  iakhne hbe


    JLabel deposit=new JLabel("Deposit:");
    deposit.setBounds(800,11,100,14);
    deposit.setForeground(Color.WHITE);
    deposit.setFont(new Font("Tahoma",Font.BOLD,14));
    panel.add(deposit);


//buttohn
    JButton back=new JButton("Back");
    back.setBounds(450,510,120,30);
    back.setBackground(Color.BLACK);
    back.setForeground(Color.WHITE);
    panel.add(back);

//kaj of back button
    back.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            setVisible(false);
        }
    });




    //frmae
    setUndecorated(true);
setSize(900,600);
setLocation(300,100);
setLayout(null);
setVisible(true);

}
//main
    public static void main(String[] args) {
new Customer_information();
    }
}
