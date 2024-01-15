package Event.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import java.util.jar.JarEntry;

public class Add_driver extends JFrame  implements ActionListener {
    JTextField nameText,ageText,carcText, carnText,locText;
    JComboBox comboBox,comboBox1;
    JButton   add,back;
    Add_driver()
    {


        super(" Add driver");
        //panel
        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        //add drivers er jonno
        //panel  er  maje   label  nilam  jate    text  add korbo
        JLabel label=new JLabel("ADD DRIVERS");
        label.setBounds(194,10,200,22);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma",Font.BOLD,22));//size boro aitar karon aita title
        panel.add(label);


        //



         //name:
        //panel  er  maje   label  nilam  jate    text  add korbo
        JLabel name=new JLabel("NAME:");
        name.setBounds(64,70,102,22);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(name);
        //text fild of  name
        nameText=new JTextField();
        nameText.setBounds(174,70,156,20);
        nameText.setForeground(Color.WHITE);
        nameText.setFont(new Font("Tahoma",Font.BOLD,14));
         nameText.setBackground(new Color(16,108,115));
         panel.add(nameText);


         //age:
        //panel  er  maje   label  nilam  jate    text  add korbo
        JLabel age=new JLabel("AGE:");
        age.setBounds(64,110,102,22);
        age.setForeground(Color.WHITE);
        age.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(age);
        //text fild of  age
        ageText=new JTextField();
        ageText.setBounds(174,110,156,20);
        ageText.setForeground(Color.WHITE);
        ageText.setFont(new Font("Tahoma",Font.BOLD,14));
        ageText.setBackground(new Color(16,108,115));
         panel.add(ageText);




        //gender:
        //panel  er  maje   label  nilam  jate    text  add korbo
        JLabel gender=new JLabel("GENDER:");
        gender.setBounds(64,150,102,22);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(gender);

        comboBox=new JComboBox(new String[]{"Male","Female"} );
        comboBox.setBounds(176,150,154,20);
        comboBox.setForeground(Color.WHITE);
        comboBox.setFont(new Font("Tahoma",Font.BOLD,14));
        comboBox.setBackground(new Color(16,108,115));
        panel.add(  comboBox);



        //car Company:
        //panel  er  maje   label  nilam  jate    text  add korbo
        JLabel carC=new JLabel("CAR COMPANY:");
        carC.setBounds(64,190,120,22);
        carC.setForeground(Color.WHITE);
        carC.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(carC);
        //text fild of  age
        carcText=new JTextField();
        carcText.setBounds(174,190,156,20);
        carcText.setForeground(Color.WHITE);
        carcText.setFont(new Font("Tahoma",Font.BOLD,14));
        carcText.setBackground(new Color(16,108,115));
        panel.add(carcText);




        //car name:
        //panel  er  maje   label  nilam  jate    text  add korbo
        JLabel carN=new JLabel("CAR NAME");
        carN.setBounds(64,230,102,22);
        carN.setForeground(Color.WHITE);
        carN.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(carN);
        //text fild of  age
        carnText=new JTextField();
        carnText.setBounds(174,230,156,20);
        carnText.setForeground(Color.WHITE);
        carnText.setFont(new Font("Tahoma",Font.BOLD,14));
        carnText.setBackground(new Color(16,108,115));
        panel.add(carnText);







        //available  er  joonno:  combobox
        //panel  er  maje   label  nilam  jate    text  add korbo
        JLabel available=new JLabel("AVAILABLE");
        available.setBounds(64,270,102,22);
        available.setForeground(Color.WHITE);
        available.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(available);

        comboBox1=new JComboBox(new String[]{"Yes","No"} );
        comboBox1.setBounds(176,270,154,20);
        comboBox1.setForeground(Color.WHITE);
        comboBox1.setFont(new Font("Tahoma",Font.BOLD,14));
        comboBox1.setBackground(new Color(16,108,115));
        panel.add(  comboBox1);






        //car   er  (location ) aita: aita oi  companmy  er .(proti  location) er jonno  alada gari thakbe
        //panel  er  maje   label  nilam  jate    text  add korbo
        JLabel loc=new JLabel("LOCATION");
        loc.setBounds(64,310,102,22);
        loc.setForeground(Color.WHITE);
        loc.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(loc);
        //text fild of  age
        locText=new JTextField();
        locText.setBounds(174,310,156,20);
        locText.setFont(new Font("Tahoma",Font.BOLD,14));
        locText.setBackground(new Color(16,108,115));
        locText.setForeground(Color.WHITE);
        panel.add(locText);


        //add button er jonno
         add=new JButton("ADD");
         add.setBounds(64,380,111,33);
         add.setBackground(Color.BLACK);
         add.setForeground(Color.WHITE);
         add.addActionListener(this);
         panel.add(add);




        //back button er jonno
        back=new JButton("BACK");
        back.setBounds(198,380,111,33);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);


        //image er jonno
        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/add_driver.com"));
        Image image=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel label1=new JLabel(imageIcon1);
        label1.setBounds(500,60,300,300);
        panel.add(label1);









        setUndecorated(true);//aita hole 4 dike  akta  simana  thake and alada window  er moto crt hoy na
        //frame
       setLocation(20,200);
        setLayout(null);
        setSize(900,500);
        setVisible(true);




    }


    //implement mane  jdi button  e  clk pore taile
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add)
        {
            //variable giye  store hoy
            String name=nameText.getText();//nilam
            String age=ageText.getText();
            String gender= (String) comboBox.getSelectedItem();//dropdown tai
            String company=carcText.getText();
            String carname=carnText.getText();
            String available=(String) comboBox1.getSelectedItem();//dropdown tai
            String location=locText.getText();

            try{
        con c =new con();
        //query  er  jonno
        String q="insert into add_driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+carname+"','"+available+"','"+location+"')";
        c.statement.executeUpdate(q);
        JOptionPane.showMessageDialog(null,"Driver Added");//success  hoile
        setVisible(false);
            }catch (Exception E)
            {
                E.printStackTrace();

            }






        }
        else//mane  oi  layout  ta  kete  jabe
        {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Add_driver();

    }
}
