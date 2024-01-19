package Event.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

//frame  k  visible korar jonno extend kora hoise
public class Department  extends JFrame {
    Department()
    {
        //panel
        JPanel panel =new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setBounds(5,5,690,490);//10 kom
        panel.setLayout(null);
        add(panel);

        //panel  e  table  nibo
        JTable  table=new JTable();
        table.setBounds(0,40,700,350);
        table.setBackground(new Color(4,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

     //workbench er data  oikhane department name j table ase  oitar  data  aikhane  ante  hbe

try{
    connect c=new connect();//conection banailam
   //query
    String departmentinfo="select * from department";
    ResultSet  resultSet=c.statement.executeQuery(departmentinfo);//resultset  e  data  store hoy
    table.setModel(DbUtils.resultSetToTableModel(resultSet));//data aisa aikhaner  table  e  store hobe


}
catch (Exception e)
{
    e.printStackTrace();


}

//aiukhane globally declare  korbo na
        //button
        JButton back=new JButton("BACK");
back.setBounds(400,410,120,30);
back.setBackground(Color.BLACK);
back.setForeground(Color.WHITE);
panel.add(back);
//button er kaj
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });



 //table  er  heading  deoya
        JLabel label1=new JLabel("Department");
        label1.setBounds(145,11,105,20);
        label1.setForeground(Color.WHITE);//text
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
panel.add(label1);



 //table  er  heading  deoya
        JLabel label2=new JLabel("Budget");
        label2.setBounds(431,11,105,20);
        label2.setForeground(Color.WHITE);//text
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
panel.add(label2);








        //frame
        setUndecorated(true);//frame ta  k  perfectly visible kore
        setLayout(null);
        setLocation(550,150);
        setSize(700,500);
        setVisible(true);






    }
    public static void main(String[] args) {
        new Department();

    }
}
