package Event.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add_employee extends JFrame implements ActionListener {
    JTextField nameText,ageText,salaryText,phoneText,emailText;  //textfild
    JRadioButton radioButtonm,radioButtonf;//male and female er jonno

     JComboBox comboBox;
     JButton add,back;
    //constructor
    Add_employee()

    {

        //panel
        JPanel  panel=new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        //panel  e  name    r label  add korlam
        JLabel name=new JLabel("NAME");
        name.setBounds( 60,30,150,27);
        name.setFont(new Font("serif",Font.BOLD,17));
        name.setForeground(Color.WHITE);
        panel.add(name);//panel  e  name namer  lebel  add korlam




        //textfild for name
       nameText=new JTextField();
       nameText.setBounds(200,30,150,27);
       nameText.setBackground(new Color(16,108,115));
       nameText.setFont(new Font("Tahoma",Font.BOLD,14));
       nameText.setForeground(Color.WHITE);
       panel.add(nameText);




        //panel  e  name    r label  add korlam
        JLabel nameText=new JLabel("Age");
        nameText.setBounds( 60,80,150,27);
        nameText.setFont(new Font("serif",Font.BOLD,17));
        nameText.setForeground(Color.WHITE);
        panel.add(nameText);//panel  e  name namer  lebel  add korlam



        ageText = new JTextField();
        ageText.setBounds(200, 80, 150, 27); // Adjust the bounds as needed
        ageText.setBackground(new Color(16, 108, 115));
        ageText.setFont(new Font("Tahoma", Font.BOLD, 14));
        ageText.setForeground(Color.WHITE);
        panel.add(ageText);






        //panel  e  gender  r label  add korlam
        JLabel gender=new JLabel("GENDER");
        gender.setBounds( 60,120,150,27);//+50
        gender.setFont(new Font("serif",Font.BOLD,17));
        gender.setForeground(Color.WHITE);
        panel.add(gender);//panel  e  name namer  lebel  add korlam


         //radio button for male
        radioButtonm=new JRadioButton("MALE");
        radioButtonm.setBounds(200,120,70,27);
        radioButtonm.setBackground(new Color(3,45,48));
        radioButtonm.setFont(new Font("Tahoma",Font.BOLD,14));
        radioButtonm.setForeground(Color.WHITE);
        panel.add(radioButtonm);


        //radio button for female
        radioButtonf=new JRadioButton("FEMALE");
        radioButtonf.setBounds(280,120,100,27);
        radioButtonf.setBackground(new Color(3,45,48));
        radioButtonf.setFont(new Font("Tahoma",Font.BOLD,14));
        radioButtonf.setForeground(Color.WHITE);
        panel.add(radioButtonf);

        //panel  e  job r label  add korlam
        JLabel job=new JLabel("JOB");
        job.setBounds( 60,170,150,27);//+50
        job.setFont(new Font("serif",Font.BOLD,17));
        job.setForeground(Color.WHITE);
        panel.add(job);//panel  e  name namer  lebel  ad

       //COMBOOBX  with option add korlam panel  e
       comboBox=new JComboBox(new String[]{"Accounanant","Manager","Stuff","Kitchen stuff","Event specialist"});
       comboBox.setBackground(new Color(16,108,115));
       comboBox.setBounds(200,170,150,30);
       comboBox.setFont(new Font("Tahoma",Font.BOLD,14));
       comboBox.setForeground(Color.WHITE);
       panel.add(comboBox);



        //panel  e  Salary  r label  add korlam
        JLabel salary=new JLabel("SALARY");
        salary.setBounds( 60,220,150,27);//+50
        salary.setFont(new Font("serif",Font.BOLD,17));
        salary.setForeground(Color.WHITE);
        panel.add(salary);//panel  e  name namer  lebel  add korlam



//
        //textfild for salaryText
        salaryText=new JTextField();
        salaryText.setBounds(200,220,150,27);
        salaryText.setBackground(new Color(16,108,115));
        salaryText.setFont(new Font("Tahoma",Font.BOLD,14));
        salaryText .setForeground(Color.WHITE);
        panel.add(salaryText);







        //panel  e  PHONE  r label  add korlam
        JLabel phone=new JLabel("PHONE ");
        phone.setBounds( 60,270,150,27);//+50
        phone.setFont(new Font("serif",Font.BOLD,17));
        phone.setForeground(Color.WHITE);
        panel.add(phone);//panel  e  name namer  lebel  add korlam



//
        //textfild for   phoneText
        phoneText=new JTextField();
        phoneText.setBounds(200,270,150,27);
        phoneText.setBackground(new Color(16,108,115));
        phoneText.setFont(new Font("Tahoma",Font.BOLD,14));
        phoneText .setForeground(Color.WHITE);
        panel.add(phoneText);



        //panel  e  PHONE  r label  add korlam
        JLabel email=new JLabel("E-MAIL ");
        email.setBounds( 60,320,150,27);//+50
        email.setFont(new Font("serif",Font.BOLD,17));
        email.setForeground(Color.WHITE);
        panel.add(email);//panel  e  name namer  lebel  add korlam



//
        //textfild for   emailText
        emailText=new JTextField();
        emailText.setBounds(200,320,150,27);//prev er sathe +50
        emailText.setBackground(new Color(16,108,115));
        emailText.setFont(new Font("Tahoma",Font.BOLD,14));
        emailText .setForeground(Color.WHITE);
        panel.add(emailText);







        //panel  add employee detai(aed)   r label  add korlam
        JLabel  aed =new JLabel("ADD EMPLOYEE DETAIL ");
        aed.setBounds( 450,24,445,35);//+50
        aed.setFont(new Font("Tahoma",Font.BOLD,31));
        aed.setForeground(Color.WHITE);

        panel.add(aed);//panel  e  name namer  lebel  add korlam




       //button for add
        add=new JButton("ADD");
        add.setBounds(80,420,100,30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);



       //button for back
        back=new JButton("BACK");
        back.setBounds(200,420,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);




        //image

      ImageIcon  imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/addemp.png"));
      //scale
      Image image=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
      ImageIcon imageIcon1=new ImageIcon(image);
      //label e nibo then  oi label ta ke panel e nibo
      JLabel label=new JLabel(imageIcon1);
      label.setBounds(500,100,300,300);
      panel.add(label);







        //frame
        setUndecorated(true);
        setLocation(60,160);
        setLayout(null);
        setSize(900,500);//frame  size
        setVisible(true);

    }
    //button clik korle kaj kore

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add)
        {
            String name=nameText.getText();//STOR  HOY
            String age=ageText.getText();
            String salary=salaryText.getText();
            String  phone=phoneText.getText();
            String  email=emailText.getText();
            //combobox er jonno
            String job=(String)comboBox.getSelectedItem();
            //for radio
            String gender=null;
            if(radioButtonm.isSelected())
            {
                gender="Male";
            }
            else if (radioButtonf.isSelected())
            {
                gender="Female";
            }
            //connection  crt kore
            try{
                con c=new con();//concetion er object
                //value table onusare  aita  query chalay
                String q="insert into add_employee values('"+ name+"','"+ age+"','"+ gender+"','"+job+"','"+ salary+"','"+ phone+"','"+ email+"')";
                c.statement.executeUpdate(q);
                //jdi data  valo vabe entry  hoy
                JOptionPane.showMessageDialog(null,"Employee added ");
                setVisible(false);




            }catch (Exception E)
            {
                E.printStackTrace();
            }


        }
        else//back  ...AITA FRAME  CLOSE  KORE
        {
            setVisible(false);//ai page  cut hoye  jabe
        }

    }

    //main
    public static void main(String[] args) {
        new Add_employee();

    }


}
