package VidyutVitaranVibhag;
import java.sql.*;

import static java.lang.Class.forName;

public class config {
    Connection c;
     Statement s;

    public config(){
        try{

             c = DriverManager.getConnection("jdbc:mysql:/localhost:3306//ebs","root","0000");
          s = c.createStatement();
        } catch (Exception e ){
            System.out.println(e);
        }

    }
}
