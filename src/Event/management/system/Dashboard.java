//package Event.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//
//public class Dashboard extends JFrame implements ActionListener {
//    JButton  add,rec,jsonbut;//admin and  recption
//    Dashboard(){
//        super(" EVENT MANAGEMENT SYSTEM ");//sobar upopre
//        //reception
//        rec =new JButton("RECEPTION");
//        rec.setBounds(425,510,140,30);
//        rec.setFont(new Font("Tahoma",Font.BOLD,15));
//        rec.setBackground(new Color(255,98,0));
//        rec.setForeground(Color.WHITE);
//        rec.addActionListener(this);
//
//        add(rec);//frame a add korlam
//
//
//
//
//        //administration
//        add =new JButton("ADMIN");
//        add.setBounds(880,510,140,30); // x chng
//        add.setFont(new Font("Tahoma",Font.BOLD,15));
//        add.setBackground(new Color(255,98,0));
//        add.setForeground(Color.WHITE);
//        add.addActionListener(this);
//        add(add);
//
//
////        //json  er jonno  button
////        jsonbut =new JButton("FOR json");
////        jsonbut.setBounds(652,550,180,30);
////        jsonbut.setFont(new Font("Tahoma",Font.BOLD,15));
////        jsonbut.setBackground(new Color(255,98,0));
////        jsonbut.setForeground(Color.WHITE);
////        jsonbut.addActionListener(this);
//
//        //recepton  image
//        ImageIcon i111=new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));//path
//        Image i22=i111.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
//        ImageIcon  imageIcon11=new ImageIcon(i22);
//        JLabel label11=new JLabel(imageIcon11);
//        label11.setBounds(400,300,200,195);
//        add(label11);
//
//
//        //admin image
//
//        ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));//path
//        Image i2=i11.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
//        ImageIcon  imageIcon111=new ImageIcon(i2);
//        JLabel label1=new JLabel(imageIcon111);
//        label1.setBounds(850,300,200,195);
//        add(label1);
//
//         //background image
//        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/back.jpg"));//path
//        Image i1=imageIcon.getImage().getScaledInstance(1950,1090,Image.SCALE_DEFAULT);
//        ImageIcon  imageIcon1=new ImageIcon(i1);
//        JLabel label=new JLabel(imageIcon1);
//        label.setBounds(0,0,1950,1090);
//        add(label);
//
//
//
//        //frame set
//        setLayout(null);//karon  ami pura  window   niye frame khulbo
//        setSize(1950,1090);
//        setVisible(true);
//      //  setBackground(Color.BLACK);
//
//    }
//    //for implement action of  button
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==rec)
//        {
//            new Reception();
//
//            setVisible(false);
//
//        }
//        else {
//
//      new Login2();
//
//      setVisible(false);
//
//
//        }
//
//    }
//    //main function
//    public  static   void main(String[] args)
//    {
//        new Dashboard();
//    }
//}



//json button add er pore


package Event.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton add, rec, jsonBut; //admin and  reception

    Dashboard() {
        super(" EVENT MANAGEMENT SYSTEM ");//sobar upopre
        //reception
        rec = new JButton("RECEPTION");
        rec.setBounds(425, 510, 140, 30);
        rec.setFont(new Font("Tahoma", Font.BOLD, 15));
        rec.setBackground(new Color(255, 98, 0));
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);

        add(rec);//frame a add korlam

        //administration
        add = new JButton("ADMIN");
        add.setBounds(880, 510, 140, 30); // x chng
        add.setFont(new Font("Tahoma", Font.BOLD, 15));
        add.setBackground(new Color(255, 98, 0));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        //json er jonno button
        jsonBut = new JButton("All Events");
        jsonBut.setBounds(652, 550, 200, 30);
        jsonBut.setFont(new Font("Tahoma", Font.BOLD, 15));
        jsonBut.setBackground(new Color(255, 98, 0));
        jsonBut.setForeground(Color.WHITE);

        jsonBut.addActionListener(this);
        add(jsonBut);

        //reception image
        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));//path
        Image i22 = i111.getImage().getScaledInstance(200, 195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i22);
        JLabel label11 = new JLabel(imageIcon11);
        label11.setBounds(400, 300, 200, 195);
        add(label11);

        //admin image
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));//path
        Image i2 = i11.getImage().getScaledInstance(200, 195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon111 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon111);
        label1.setBounds(850, 300, 200, 195);
        add(label1);

        //background image
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/back.jpg"));//path
        Image i1 = imageIcon.getImage().getScaledInstance(1950, 1090, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(0, 0, 1950, 1090);
        add(label);

        //frame set
        setLayout(null);//karon  ami pura  window   niye frame khulbo
        setSize(1950, 1090);
        setVisible(true);
    }

    //for implement action of  button
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rec) {
            new Reception();
            setVisible(false);
        }
        else if (e.getSource() == jsonBut) {
            EventQueue.invokeLater(() -> {
                new JsonParsing().setVisible(true);
                dispose();
            });
        } else {
            new Login2();
            setVisible(false);
        }
    }

    //main function
    public static void main(String[] args) {
        new Dashboard();
    }
}
