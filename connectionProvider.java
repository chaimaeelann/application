
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT;
import java.sql.*;


/**
 *
 * @author DFF
 */
public class connectionProvider {
    public static Connection getCon()
            
    {
         try 
         {          
         
         Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/patrimoine","root","");
                                                                                    
            return con;
         }
         catch(Exception e){
         
         return null;
         
         }
    
    
    }
    
    
            
            
            
}
