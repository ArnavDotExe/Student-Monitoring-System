package sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    Connection c;
    Statement s;
    conn(){
        String username = "";
        String password = "";
        String url = "";
        try{
          c = DriverManager.getConnection(url, username,password);
          s = c.createStatement();
            System.out.println("connetion successful!!");

        }catch (Exception e){
            System.out.println("Connection failed");
        }
    }

}
