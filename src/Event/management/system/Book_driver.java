package Event.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

public class Book_driver  extends JFrame implements ActionListener {
    JTextField   locationtext,nametext;
    JButton book,back;

    Book_driver()
    {


        super("Book Driver");











        //panel
        JPanel  panel=new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);




        //panel  e  location    r label  add korlam
        JLabel location=new JLabel("Location");
        location.setBounds( 60,30,150,27);
        location.setFont(new Font("serif",Font.BOLD,17));
        location.setForeground(Color.WHITE);
        panel.add(location);//panel  e  name namer  lebel  add korlam




        //textfild for location
        locationtext=new JTextField();
        locationtext.setBounds(200,30,150,27);
        locationtext.setBackground(new Color(16,108,115));
        locationtext.setFont(new Font("Tahoma",Font.BOLD,14));
        locationtext.setForeground(Color.WHITE);
        panel.add(locationtext);







        //panel  e  PHONE  r label  add korlam
        JLabel name=new JLabel("Name ");
        name.setBounds( 60,80,150,27);//+50
        name.setFont(new Font("serif",Font.BOLD,17));
        name.setForeground(Color.WHITE);
        panel.add(name);//panel  e  name namer  lebel  add korlam



//
        //textfild for   nameText
        nametext=new JTextField();
        nametext.setBounds(200,80,150,27);
        nametext.setBackground(new Color(16,108,115));
        nametext.setFont(new Font("Tahoma",Font.BOLD,14));
        nametext .setForeground(Color.WHITE);
        panel.add(nametext);







        //panel  add employee detai(aed)   r label  add korlam
        JLabel  bookdriver =new JLabel("BOOK DRIVER");
        bookdriver.setBounds( 450,24,445,35);//+50
        bookdriver.setFont(new Font("Tahoma",Font.BOLD,31));
        bookdriver.setForeground(Color.WHITE);

        panel.add(bookdriver);//panel  e  name namer  lebel  add korlam






        //image

        ImageIcon  imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/drvr.png"));
        //scale
        Image image=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        //label e nibo then  oi label ta ke panel e nibo
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(500,100,300,300);
        panel.add(label);



        book = new JButton("Book");
        book.setBounds(64, 321, 111, 33);
        book.setBackground(Color.BLACK);
        book.setForeground(Color.WHITE);
        book.addActionListener(this);
        panel.add(book);

        back = new JButton("Back");
        back.setBounds(198, 321, 111, 33);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);




        //frame
        setUndecorated(false);
        setLocation(20,200);
        setLayout(null);
        setSize(885,500);
        setVisible(true);









    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == book) {
            String name = nametext.getText();
            String location = locationtext.getText();

            try {
                con c = new con();
                String query = "UPDATE add_driver SET available = 'no' WHERE name = ? AND location = ?";
                PreparedStatement pstmt = c.connection.prepareStatement(query);
                pstmt.setString(1, name);
                pstmt.setString(2, location);

                int updatedRows = pstmt.executeUpdate();
                if (updatedRows > 0) {
                    JOptionPane.showMessageDialog(this, "Driver booked successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Driver not found or already booked.");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }
//        else//back  ...AITA FRAME  CLOSE  KORE
//        {
//            setVisible(false);//ai page  cut hoye  jabe
//        }

   // }
    public static void main(String[] args) {

        new Book_driver();
    }
}


