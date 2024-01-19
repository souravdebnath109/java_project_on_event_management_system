package Event.management.system;
import net.proteanit.sql.DbUtils;

import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Allemployee extends JFrame {
    Allemployee()
    {

        //panel .
        JPanel panel=new JPanel();
        panel.setBounds(5,5,990,590);//-10
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        //table
        JTable table=new JTable();
        table.setBounds(10,34,980,450);
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(3,45,48));
        panel.add(table);
        //data  ber korbo
        try{
            connect c =new connect();
            String Employeesql="select * from  add_employee";//ber korrlam
            ResultSet resultSet=c.statement.executeQuery(Employeesql);//data ber kore store korlma
            table.setModel(DbUtils.resultSetToTableModel(resultSet));//pass hoy to tavble





        }catch (Exception e)
        {
            e.printStackTrace();
        }


     //button
        JButton back=new JButton("BACK");
        back.setBounds(350,500,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        //back er kaj
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              setVisible(false);
            }
        });
        //heading
        JLabel  name=new JLabel("Name");
        name.setBounds(43,11,70,19);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(name);

  //heading age
        JLabel  age=new JLabel("Age");
        age.setBounds(161,11,70,19);
        age.setForeground(Color.WHITE);
        age.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(age);


  //heading gender
        JLabel  gender=new JLabel("Gender");
        gender.setBounds(287,11,70,19);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(gender);

  //heading job
        JLabel  job=new JLabel("Job");
        job.setBounds(428,11,70,19);
        job.setForeground(Color.WHITE);
        job.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(job);

  //heading salary
        JLabel  salary=new JLabel("Salary");
        salary.setBounds(571,11,70,19);
        salary.setForeground(Color.WHITE);
        salary.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(salary);
        //phn
        JLabel phone=new JLabel("phone");
        phone.setBounds(709,11,70,19);
        phone.setForeground(Color.WHITE);
        phone.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(phone);

        //gmail
        JLabel gmail=new JLabel("Gmail");
        gmail.setBounds(849,11,70,19);
        gmail.setForeground(Color.WHITE);
        gmail.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(gmail);










        //frame
        setUndecorated(true);//border ase
        setLayout(null);
        setLocation(300,90);
        setSize(1000,600);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Allemployee();


    }
}
