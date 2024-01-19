package Event.management.system;

//  for  connect.java



import java.sql.Connection;//mysql  er  jonno
import java.sql.DriverManager;
import java.sql.Statement;


//CON MANE CONNECTION WITH DATABASE MAINLY
public class connect {
    Connection  connection;
    Statement statement;

   // public static void main(String[] args) {

    public connect()
        {
            try{
                connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/eventMS","root","aitaami");
                //aikahne  ami  root/username  :root  e  rakhsi
                //password:aitaami
                statement=connection.createStatement();//conct kore



            }catch (Exception e)
            {
                e.printStackTrace();
            }

        }

    public static void main(String[] args) {

    }



}

