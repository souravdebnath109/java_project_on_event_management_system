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






//try-1


//
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//
//public class Delete_event extends JFrame implements ActionListener {
//    private JTextField t2;
//    private JButton b1, b2;
//
//    public Delete_event() {
//        JPanel panel = new JPanel();
//        panel.setBounds(5, 5, 875, 490);
//        panel.setBackground(new Color(3, 45, 48));
//        panel.setLayout(null);
//        add(panel);
//
//        JLabel l1 = new JLabel("Delete Event");
//        l1.setBounds(194, 10, 160, 22);
//        l1.setFont(new Font("Tahoma", Font.BOLD, 22));
//        l1.setForeground(Color.WHITE);
//        panel.add(l1);
//
//        JLabel l2 = new JLabel("Event no:");
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
//        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/delete_event.png"));
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
//                con c = new con();
//                String eventno = t2.getText();
//                String deleteQuery = "DELETE FROM eeeventtt WHERE event_no = ?";
//                PreparedStatement preparedStatement = c.connection.prepareStatement(deleteQuery);
//                preparedStatement.setString(1, eventno);
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
//        new Delete_event();
//    }
//}




//try-2



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Delete_event extends JFrame implements ActionListener {
    private JTextField t2;
    private JButton b1, b2;

    public Delete_event() {
        super("Delete Event");
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 875, 490);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JLabel l1 = new JLabel("Delete Event");
        l1.setBounds(194, 10, 160, 22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 22));
        l1.setForeground(Color.WHITE);
        panel.add(l1);

        JLabel l2 = new JLabel("Event no:");
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

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/delete_event.png"));
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
                con c = new con();
                String eventno = t2.getText();
                String deleteQuery = "DELETE FROM eeeventtt WHERE event_no = ?";
                PreparedStatement preparedStatement = c.connection.prepareStatement(deleteQuery);
                preparedStatement.setString(1, eventno);
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Event deleted successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "No matching record found for the given event number.");
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Back button clicked");
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Delete_event();
    }
}
