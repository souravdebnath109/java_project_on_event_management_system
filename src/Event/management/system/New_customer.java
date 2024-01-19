package Event.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class New_customer  extends JFrame  implements ActionListener {
    //combobox
    JComboBox combobox;//aikhane amar dropodoiwn lagbe

  JTextField textFieldnumber,textname,textage,textdeposit;
  JRadioButton r1,r2;
  Choice c1;
  //date
  JLabel date;
  JButton add,back;




 New_customer()
 {
     super("New Customer Form");


     //panel
     JPanel panel=new JPanel();
     panel.setBounds(5,5,840,540);
     panel.setBackground(new Color(3,45,48));
     //panel.setForeground(new Font("Tahoma",Font.BOLD,14));
     panel.setForeground(Color.WHITE);
     panel.setLayout(null);//karon amader panel  er majhe  label k  nijer moto add korbo
     add(panel);
     //get
     ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/customeer.png"));
     Image image=imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
     ImageIcon imageIcon1=new ImageIcon(image);//pass

     //frame  e  show korbe  hading
     JLabel  labelName=new JLabel("NEW CUSTOMER FORM");
     labelName.setBounds(118,11,260,53);
     labelName.setForeground(Color.WHITE);
     labelName.setFont(new Font("Tahoma",Font.BOLD,20));
     panel.add(labelName);


     //label for id
     JLabel labelid=new JLabel("ID");
     labelid.setBounds(35,76,200,14);
     labelid.setForeground(Color.WHITE);
     labelid.setFont(new Font("Tahoma",Font.PLAIN,14));
     panel.add(labelid);


    //combobox e
     combobox=new JComboBox(new String[]{"passport","voter id","driving license"});
     combobox.setBounds(271,73,150,20);
     combobox.setForeground(Color.WHITE);
     combobox.setBackground(new Color(3,45,48));
     combobox.setFont(new Font("Tahoma",Font.PLAIN,14));
      panel.add(combobox);



     //label for phone number
     JLabel labelnumber=new JLabel("NUMBER");
     labelnumber.setBounds(35,111,200,14);
     labelnumber.setForeground(Color.WHITE);
     labelnumber.setFont(new Font("Tahoma",Font.PLAIN,14));
     panel.add(labelnumber);
     //textfild
     textFieldnumber=new JTextField();
     textFieldnumber.setBounds(271,111,150,20);
     panel.add(textFieldnumber);







     //label for name
     JLabel labelname=new JLabel("NAME");
     labelname.setBounds(35,151,200,14);
     labelname.setForeground(Color.WHITE);
     labelname.setFont(new Font("Tahoma",Font.PLAIN,14));
     panel.add(labelname);
     //textfild
     textname=new JTextField();
     textname.setBounds(271,151,150,20);
     panel.add(textname);
     //GENDR  E

     //label for GENDER
     JLabel labelgender=new JLabel("GENDER :");
     labelgender.setBounds(35,191,200,14);
     labelgender.setForeground(Color.WHITE);
     labelgender.setFont(new Font("Tahoma",Font.PLAIN,14));
     panel.add(labelgender);

     //male er jonno
     r1=new JRadioButton("Male");
     r1.setFont(new Font("Tahoma",Font.BOLD,14));
     r1.setForeground(Color.WHITE);
     r1.setBackground(new Color(3,45,48));
     r1.setBounds(271,191,80,12);
     panel.add(r1);


 //female er jonno
     r2=new JRadioButton("Female");
     r2.setFont(new Font("Tahoma",Font.BOLD,14));
     r2.setForeground(Color.WHITE);
     r2.setBackground(new Color(3,45,48));
     r2.setBounds(350,191,80,12);
     panel.add(r2);





     //label for age
     JLabel labelage=new JLabel("Age");
     labelage.setBounds(35,231,200,14);
     labelage.setFont(new Font("Tahoma",Font.PLAIN,14));
     labelage.setForeground(Color.WHITE);
     panel.add(labelage);
     //textfild
     textage=new JTextField();
     textage.setBounds(271,231,150,20);
     panel.add(textage);

     //alocated event

     //label for age
     JLabel labelevent=new JLabel(" Allocated event");
     labelevent.setBounds(35,274,200,14);
     labelevent.setFont(new Font("Tahoma",Font.PLAIN,14));
     labelevent.setForeground(Color.WHITE);
     panel.add(labelevent);

     c1= new Choice();
     try{//event show korbe
         connect c=new connect();//conction banay
         ResultSet resultSet=c.statement.executeQuery("select * from   eeeventtt ");//data ber kore

          while(resultSet.next())
          {
              c1.add(resultSet.getString("event_no"));//eeeventtt er (event_no) jei column oitar data lagbe  and   ta  store hbe c1 e


          }




     }catch (Exception e)
     {
         e.printStackTrace();

     }
     c1.setBounds(271,274,150,20);
     c1.setFont(new Font("Tahoma",Font.BOLD,14));
     c1.setBackground(new Color(3,45,48));
     c1.setForeground(Color.WHITE);
     panel.add(c1);



     //label for  register or check in status
     JLabel  labelregister=new JLabel(" Register");
     labelregister.setBounds(35,316,200,14);
     labelregister.setFont(new Font("Tahoma",Font.PLAIN,14));
     labelregister.setForeground(Color.WHITE);
     panel.add(labelregister);
     //date and  timer jonno


     Date date1=new Date();
     date=new JLabel(""+date1);
     date.setBounds(271,316,200,14);
     date.setFont(new Font("Tahoma",Font.PLAIN,14));
     date.setForeground(Color.WHITE);
     panel.add( date);

       //for deposit



     //label for age
     JLabel labeldeposit=new JLabel("Deposit");
     labeldeposit.setBounds(35,359,200,14);
     labeldeposit.setFont(new Font("Tahoma",Font.PLAIN,14));
     labeldeposit.setForeground(Color.WHITE);
     panel.add(  labeldeposit);
     //textfild
     textdeposit=new JTextField();
     textdeposit.setBounds(271,359,150,20);
     panel.add(textdeposit);

//button

    add=new JButton("ADD");
    add.setBounds(100,430,120,30);
    add.setForeground(Color.WHITE);
    add.setBackground(Color.BLACK);
    add.addActionListener(this);//action

    panel.add(add);




    back=new JButton("BACK");
     back.setBounds(260,430,120,30);
     back.setForeground(Color.WHITE);
     back.setBackground(Color.BLACK);
     back.addActionListener(this);
    panel.add(back);








//image k  label  e niye  add kora   hoy
     JLabel imglabel=new JLabel(imageIcon1);
     imglabel.setBounds(550,150,200,200);
     panel.add(imglabel);













     //frame
     setLayout(null);
     setSize(850,550);
     setVisible(true);
     setLocation(260,130);

 }
 //action porform of  button


    @Override
    public void actionPerformed(ActionEvent e) {

     if(e.getSource()==add)
     {
  connect c =new connect();//connection
         //data ber kore
         String  radiobtn=null;
         if(r1.isSelected())
         {
         radiobtn="Male";
         }
         else if(r2.isSelected()) {
             radiobtn="Female";
         }
      String s1=(String)combobox.getSelectedItem();
         String s2=textFieldnumber.getText();
         String s3=textname.getText();
         String s4=radiobtn;
         String s5=textage.getText();
         String s6=c1.getSelectedItem();//choice  e
         String s7=date.getText();
         String s8=textdeposit.getText();
        // System.out.println(s8);
         try{
             String q="insert into customer values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";//data insert
             String q1="update eeeventtt set availability ='Occupied' where  event_no="+s6;
             c.statement.executeUpdate(q);
             c.statement.executeUpdate(q1);

             JOptionPane.showMessageDialog(null,"added sucessfully");
            setVisible(false);



         }catch (Exception E)
         {
           E.printStackTrace();

         }





     }
     else //back btn clk hole
     {
         setVisible(false);
     }
    }

    public static void main(String[] args) {
        new New_customer();
    }
}
