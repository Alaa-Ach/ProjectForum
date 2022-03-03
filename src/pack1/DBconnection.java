package pack1;



import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ghost
 */
public class DBconnection {
    
    
    
    
    
    private static Connection connection;

    public static  Connection getConnection (){

            try {
                connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/forum","root","");
                
            } catch (SQLException se) {
            se.printStackTrace();
       
        
    }
            
    return connection;
}

}
