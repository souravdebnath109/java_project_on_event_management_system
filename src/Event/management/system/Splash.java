package Event.management.system;

//class  run  er  scut  (shift+f10)




//for  splash  screen




//import javax.swing.*;
//
//
//public class Splash extends JFrame {
//    Splash(){
//
//        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/load.gif"));
//        JLabel label=new JLabel(imageIcon);
//        label.setBounds(0,0,858,680 );
//        add(label);
//
//        setLayout(null);
//        setLocation(300,80);
//        setSize(858,680);
//        setVisible(true);
//        try {
//            Thread.sleep(1000);
//        }catch (Exception e)
//        {
//            e.printStackTrace();
//           // setVisible(false);
//        }
//    }
//    public static void main(String[] args) {
//      new Splash();
//
//    }
//}
//----------
//
//import javax.swing.*;
//import java.util.Timer;
//import java.util.TimerTask;
//
//public class Splash extends JFrame {
//
//    Splash() {
//        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/icons8-loading-100.png"));
//        JLabel label = new JLabel(imageIcon);
//        label.setBounds(0, 0, 858, 680);
//        add(label);
//
//        setLayout(null);
//        setLocation(300, 80);
//        setSize(858, 680);
//        setVisible(true);
//
//        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                dispose(); // Close the frame
//                timer.cancel(); // Release the timer resources
//            }
//        }, 5000); // Schedule the task to run after 5 seconds
//    }
//
//    public static void main(String[] args) {
////        new Splash();
////    }
//}

//modified by  try-1


//try 1

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Splash extends JFrame {

    Splash(){



        super("Splash Screen");
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Blk&orng_load.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0, 0, 858, 680);   //size
        add(label);

       // setLayout(null);
        setLocation(300, 00);
        setSize(858, 680);//size
        setVisible(true);
        //5  sec  por  aita  disable hoy
        Timer timer = new Timer(8000, new ActionListener() {//tatal load spalsh  er  kaj  korte 8  sec  lage  tai
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login();//redirect  kore ai Login page e

                setVisible(false);
                dispose();
            }
        });

        timer.setRepeats(false);
        timer.start();
    }

    public static void main(String[] args) {
        new Splash();
    }
}


