//package Event.management.system;
////package Event.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Edit_employee extends JFrame implements ActionListener {
//    JTextField nameText,ageText,salaryText,phoneText,emailText;  //textfild
//    JRadioButton radioButtonm,radioButtonf;//male and female er jonno
//
//    JComboBox comboBox;
//    JButton add,back;
//    //constructor
//    Edit_employee()
//
//    {
//         //edit er jonno
//        //panel
//        JPanel  panel=new JPanel();
//        panel.setBounds(5,5,890,490);
//        panel.setBackground(new Color(3,45,48));
//        panel.setLayout(null);
//        add(panel);
//
//        //panel  e  name    r label  add korlam
//        JLabel name=new JLabel("NAME");
//        name.setBounds( 60,30,150,27);
//        name.setFont(new Font("serif",Font.BOLD,17));
//        name.setForeground(Color.WHITE);
//        panel.add(name);//panel  e  name namer  lebel  add korlam
//
//
//
//        //edit er jonno
//        //textfild for name
//        nameText=new JTextField();
//        nameText.setBounds(200,30,150,27);
//        nameText.setBackground(new Color(16,108,115));
//        nameText.setFont(new Font("Tahoma",Font.BOLD,14));
//        nameText.setForeground(Color.WHITE);
//        panel.add(nameText);
//
//
//
//        //edit er jonno
//        //panel  e  age  r label  add korlam
//        JLabel age=new JLabel("AGE");
//        age.setBounds( 60,80,150,27);//+50
//        age.setFont(new Font("serif",Font.BOLD,17));
//        age.setForeground(Color.WHITE);
//        panel.add(age);//panel  e  name namer  lebel  add korlam
//
//
//
//        //edit er jonno//
//        //textfild for ageText
//        ageText=new JTextField();
//        ageText.setBounds(200,80,150,27);
//        ageText.setBackground(new Color(16,108,115));
//        ageText.setFont(new Font("Tahoma",Font.BOLD,14));
//        ageText.setForeground(Color.WHITE);
//        panel.add(ageText);
//
//
//        //edit er jonno
//        //panel  e  gender  r label  add korlam
//        JLabel gender=new JLabel("GENDER");
//        gender.setBounds( 60,120,150,27);//+50
//        gender.setFont(new Font("serif",Font.BOLD,17));
//        gender.setForeground(Color.WHITE);
//        panel.add(gender);//panel  e  name namer  lebel  add korlam
//
//        //edit er jonno
//        //radio button for male
//        radioButtonm=new JRadioButton("MALE");
//        radioButtonm.setBounds(200,120,70,27);
//        radioButtonm.setBackground(new Color(3,45,48));
//        radioButtonm.setFont(new Font("Tahoma",Font.BOLD,14));
//        radioButtonm.setForeground(Color.WHITE);
//        panel.add(radioButtonm);
//
//        //edit er jonno
//        //radio button for female
//        radioButtonf=new JRadioButton("FEMALE");
//        radioButtonf.setBounds(280,120,100,27);
//        radioButtonf.setBackground(new Color(3,45,48));
//        radioButtonf.setFont(new Font("Tahoma",Font.BOLD,14));
//        radioButtonf.setForeground(Color.WHITE);
//        panel.add(radioButtonf);
//
//        //edit er jonno
//        //edit er jonno
//        //panel  e  job r label  add korlam
//        JLabel job=new JLabel("JOB");
//        job.setBounds( 60,170,150,27);//+50
//        job.setFont(new Font("serif",Font.BOLD,17));
//        job.setForeground(Color.WHITE);
//        panel.add(job);//panel  e  name namer  lebel  ad
//        //edit er jonno
//        //COMBOOBX  with option add korlam panel  e
//        comboBox=new JComboBox(new String[]{"Accounanant","Manager","Stuff","Kitchen stuff","Event specialist"});
//        comboBox.setBackground(new Color(16,108,115));
//        comboBox.setBounds(200,170,150,30);
//        comboBox.setFont(new Font("Tahoma",Font.BOLD,14));
//        comboBox.setForeground(Color.WHITE);
//        panel.add(comboBox);
//
//
//        //edit er jonno
//        //panel  e  Salary  r label  add korlam
//        JLabel salary=new JLabel("SALARY");
//        salary.setBounds( 60,220,150,27);//+50
//        salary.setFont(new Font("serif",Font.BOLD,17));
//        salary.setForeground(Color.WHITE);
//        panel.add(salary);//panel  e  name namer  lebel  add korlam
//
//
//
//        //edit er jonno//
//        //textfild for salaryText
//        salaryText=new JTextField();
//        salaryText.setBounds(200,220,150,27);
//        salaryText.setBackground(new Color(16,108,115));
//        salaryText.setFont(new Font("Tahoma",Font.BOLD,14));
//        salaryText .setForeground(Color.WHITE);
//        panel.add(salaryText);
//
//
//
//
//
//        //edit er jonno
//
//        //panel  e  PHONE  r label  add korlam
//        JLabel phone=new JLabel("PHONE ");
//        phone.setBounds( 60,270,150,27);//+50
//        phone.setFont(new Font("serif",Font.BOLD,17));
//        phone.setForeground(Color.WHITE);
//        panel.add(phone);//panel  e  name namer  lebel  add korlam
//
//
//
//        //edit er jonno//
//        //textfild for   phoneText
//        phoneText=new JTextField();
//        phoneText.setBounds(200,270,150,27);
//        phoneText.setBackground(new Color(16,108,115));
//        phoneText.setFont(new Font("Tahoma",Font.BOLD,14));
//        phoneText .setForeground(Color.WHITE);
//        panel.add(phoneText);
//
//
//        //edit er jonno
//        //panel  e  PHONE  r label  add korlam
//        JLabel email=new JLabel("E-MAIL ");
//        email.setBounds( 60,320,150,27);//+50
//        email.setFont(new Font("serif",Font.BOLD,17));
//        email.setForeground(Color.WHITE);
//        panel.add(email);//panel  e  name namer  lebel  add korlam
//
//
//
//        //edit er jonno//
//        //textfild for   emailText
//        emailText=new JTextField();
//        emailText.setBounds(200,320,150,27);//prev er sathe +50
//        emailText.setBackground(new Color(16,108,115));
//        emailText.setFont(new Font("Tahoma",Font.BOLD,14));
//        emailText .setForeground(Color.WHITE);
//        panel.add(emailText);
//
//
//
//
//
//        //edit er jonno
//
//        //panel  add employee detai(aed)   r label  add korlam
//        JLabel  aed =new JLabel("EDIT EMPLOYEE DETAIL ");
//        aed.setBounds( 450,24,445,35);//+50
//        aed.setFont(new Font("Tahoma",Font.BOLD,31));
//        aed.setForeground(Color.WHITE);
//
//        panel.add(aed);//panel  e  name namer  lebel  add korlam
//
//
//
////
////        //button for add
////        add=new JButton("ADD");
////        add.setBounds(80,420,100,30);
////        add.setBackground(Color.BLACK);
////        add.setForeground(Color.WHITE);
////        add.addActionListener(this);
////        panel.add(add);
//
//
//        //button for update
//        add=new JButton("UPDATE");
//        add.setBounds(80,420,100,30);
//        add.setBackground(Color.BLACK);
//        add.setForeground(Color.WHITE);
//        add.addActionListener(this);
//        panel.add(add);
//
//
//
//
//        //button for back
//        back=new JButton("BACK");
//        back.setBounds(200,420,100,30);
//        back.setBackground(Color.BLACK);
//        back.setForeground(Color.WHITE);
//        back.addActionListener(this);
//        panel.add(back);
//
//
//
//
//        //image
//
//        ImageIcon  imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/editemployees.png"));
//        //scale
//        Image image=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
//        ImageIcon imageIcon1=new ImageIcon(image);
//        //label e nibo then  oi label ta ke panel e nibo
//        JLabel label=new JLabel(imageIcon1);
//        label.setBounds(500,100,300,300);
//        panel.add(label);
//
//
//
//
//
//
//
//        //frame
//        setUndecorated(true);
//        setLocation(60,160);
//        setLayout(null);
//        setSize(900,500);//frame  size
//        setVisible(true);
//
//    }
//
//
//
////    //button clik korle kaj kore
////
////    @Override
////    public void actionPerformed(ActionEvent e) {
////        if(e.getSource()==add)
////        {
////            String name=nameText.getText();//STOR  HOY
////            String age=ageText.getText();
////            String salary=salaryText.getText();
////            String  phone=phoneText.getText();
////            String  email=emailText.getText();
////            //combobox er jonno
////            String job=(String)comboBox.getSelectedItem();
////            //for radio
////            String gender=null;
////            if(radioButtonm.isSelected())
////            {
////                gender="Male";
////            }
////            else if (radioButtonf.isSelected())
////            {
////                gender="Female";
////            }
////            //connection  crt kore
////            try{
////                connect c=new connect();//concetion er object
////                //value table onusare  aita  query chalay
////                String q="insert into add_employee values('"+ name+"','"+ age+"','"+ gender+"','"+job+"','"+ salary+"','"+ phone+"','"+ email+"')";
////                c.statement.executeUpdate(q);
////                //jdi data  valo vabe entry  hoy
////                JOptionPane.showMessageDialog(null,"Employee added ");
////                setVisible(false);
////
////
////
////
////            }catch (Exception E)
////            {
////                E.printStackTrace();
////            }
////
////
////        }
////        else//back  ...AITA FRAME  CLOSE  KORE
////        {
////            setVisible(false);//ai page  cut hoye  jabe
////        }
////
////    }
//
//
//
//    //try-1
//
//
//    //button clik korle kaj kore
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == add) {
//            String name = nameText.getText();
//            String age = ageText.getText();
//            String salary = salaryText.getText();
//            String phone = phoneText.getText();
//            String email = emailText.getText();
//            String job = (String) comboBox.getSelectedItem();
//            String gender = null;
//
//            if (radioButtonm.isSelected()) {
//                gender = "Male";
//            } else if (radioButtonf.isSelected()) {
//                gender = "Female";
//            }
//
//            try {
//                connect c = new connect();
//                // Assuming you have an employee ID associated with the record to be updated
//                // You need to replace EMPLOYEE_ID with the actual ID value
//                String updateQuery = "UPDATE add_employee SET name='" + name + "', age='" + age +
//                        "', gender='" + gender + "', job='" + job + "', salary='" + salary +
//                        "', phone='" + phone + "', email='" + email +
//                        "' WHERE EMPLOYEE_ID='YOUR_EMPLOYEE_ID'";
//                c.statement.executeUpdate(updateQuery);
//                JOptionPane.showMessageDialog(null, "Employee updated");
//                setVisible(false);
//            } catch (Exception E) {
//                E.printStackTrace();
//            }
//        } else if (e.getSource() == back) {
//            setVisible(false);
//        }
//    }
//
//    //main
//    public static void main(String[] args) {
//        new Edit_employee();
//
//    }
//
//
//}




package Event.management.system;//package Event.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class Delete_event extends JFrame {
//    JTextField t2;
//    JButton b1,b2;
//
//    Delete_event() {
//        // panel
//        JPanel panel = new JPanel();
//        panel.setBounds(5, 5, 875, 490);
//        panel.setBackground(new Color(3, 45, 48));
//        panel.setLayout(null);
//        add(panel);  // Add the panel to the frame
//
//        // label and textfield
//        // 1st for title
//        JLabel l1 = new JLabel("Delete  Event");
//        l1.setBounds(194, 10, 160, 22);
//        l1.setFont(new Font("Tahoma", Font.BOLD, 22));
//        l1.setForeground(Color.WHITE);
//        panel.add(l1);  // Add the label to the panel
//
//
//
//        //textfild and label
//
//
//
//        //event name  er  jonno
//        JLabel l2=new JLabel("Event no:");
//        l2.setBounds(64,70,152,22);
//        l2.setFont(new Font("Tahoma",Font.BOLD,14));
//        l2.setForeground(Color.WHITE);
//        panel.add(l2);
//
//
//        //text fild of  evewnt name er jonno
//       // JTextField t2=new JTextField();
//        t2=new JTextField();
//        t2.setBounds(200,70,156,20);
//        t2.setFont(new Font("Tahoma",Font.PLAIN,14));
//        t2.setForeground(Color.WHITE);
//        t2.setBackground(new Color(16,108,115));
//        panel.add(t2);
//
//        //delete and back button
//
//        //edit class er
//        //button of add
//        //JButton b1;
//        b1=new JButton("Delete");
//        b1.setBounds(64,321,111,33);
//        b1.setBackground(Color.BLACK);
//        b1.setForeground(Color.WHITE);
//      //  b1.addActionListener(this);//jeno click  e  action perform kore
//        panel.add(b1);//panel  e  add korlam
//
//        //edit class er
//        //button of back
//        b2=new JButton("Back");
//        b2.setBounds(198,321,111,33);
//        b2.setBackground(Color.BLACK);
//        b2.setForeground(Color.WHITE);
//        //b2.addActionListener(this);
//        panel.add(b2);//panel  e  add korlam
//
//
//
//             //edit_event class er
//                //Image    er  jonno
//                ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/delete_event.png"));
//                //SCALING  ER  JONNO
//                Image image=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
//                //PASS KORBO IMAGE
//                ImageIcon imageIcon1=new ImageIcon(image);
//
//                JLabel label=new JLabel(imageIcon1);
//                label.setBounds(500,60,300,300);
//                panel.add(label);
//
//
//
//
//        // frame
//        setUndecorated(false);
//        setLocation(20, 200);
//        setLayout(null);
//        setSize(885, 500);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new Delete_event();
//    }
//}
//
//

//pt---
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//
//public class Edit_employee extends JFrame implements ActionListener {
//    private JTextField t2;
//    private JButton b1, b2;
//
//    public Edit_employee() {
//        JPanel panel = new JPanel();
//        panel.setBounds(5, 5, 875, 490);
//        panel.setBackground(new Color(3, 45, 48));
//        panel.setLayout(null);
//        add(panel);
//
//        JLabel l1 = new JLabel("Remove employee");
//        l1.setBounds(194, 10, 280, 22);
//        l1.setFont(new Font("Tahoma", Font.BOLD, 22));
//        l1.setForeground(Color.WHITE);
//        panel.add(l1);
//
//        JLabel l2 = new JLabel("phone no:");
//        l2.setBounds(64, 70, 152, 22);
//        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
//        l2.setForeground(Color.WHITE);
//        panel.add(l2);
//
//        t2 = new JTextField();
//        t2.setBounds(200, 70, 156, 20);
//        t2.setFont(new Font("Tahoma", Font.PLAIN, 14));
//        t2.setForeground(Color.WHITE);
//        t2.setBackground(new Color(16, 108, 115));
//        panel.add(t2);
//
//        b1 = new JButton("Delete");
//        b1.setBounds(64, 321, 111, 33);
//        b1.setBackground(Color.BLACK);
//        b1.setForeground(Color.WHITE);
//        b1.addActionListener(this);
//        panel.add(b1);
//
//        b2 = new JButton("Back");
//        b2.setBounds(198, 321, 111, 33);
//        b2.setBackground(Color.BLACK);
//        b2.setForeground(Color.WHITE);
//        b2.addActionListener(this);
//        panel.add(b2);
//
//        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/editemployees.png"));
//        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
//        ImageIcon imageIcon1 = new ImageIcon(image);
//
//        JLabel label = new JLabel(imageIcon1);
//        label.setBounds(500, 60, 300, 300);
//        panel.add(label);
//
//        setUndecorated(false);
//        setLocation(20, 200);
//        setLayout(null);
//        setSize(885, 500);
//        setVisible(true);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == b1) {
//            try {
//                connect c = new connect();
//                String mobileno = t2.getText();
//                String deleteQuery = "DELETE FROM add_employee WHERE phone = ?";
//                PreparedStatement preparedStatement = c.connection.prepareStatement(deleteQuery);
//                preparedStatement.setString(1, mobileno);
//                preparedStatement.executeUpdate();
//
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//        } else {
//            setVisible(false);
//        }
//    }
//
//    public static void main(String[] args) {
//        new Edit_employee();
//    }
//}



//pt-2



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

public class Edit_employee extends JFrame implements ActionListener {
    private JTextField t2;
    private JButton b1, b2;

    public Edit_employee() {
        super("Edit Employee");
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 875, 490);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JLabel l1 = new JLabel("Remove employee");
        l1.setBounds(194, 10, 280, 22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 22));
        l1.setForeground(Color.WHITE);
        panel.add(l1);

        JLabel l2 = new JLabel("phone no:");
        l2.setBounds(64, 70, 152, 22);
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setForeground(Color.WHITE);
        panel.add(l2);

        t2 = new JTextField();
        t2.setBounds(200, 70, 156, 20);
        t2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(16, 108, 115));
        panel.add(t2);

        b1 = new JButton("Delete");
        b1.setBounds(64, 321, 111, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(198, 321, 111, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/editemployees.png"));
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);

        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500, 60, 300, 300);
        panel.add(label);

        setUndecorated(false);
        setLocation(20, 200);
        setLayout(null);
        setSize(885, 500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                connect c = new connect();
                String mobileno = t2.getText();
                String deleteQuery = "DELETE FROM add_employee WHERE phone = ?";
                PreparedStatement preparedStatement = c.connection.prepareStatement(deleteQuery);
                preparedStatement.setString(1, mobileno);
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Employee deleted successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "No matching record found for the given phone number.");
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Edit_employee();
    }
}
