/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject.DAO;
import bookstoreproject.MODAL.User;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Acer
 */
public class UserDAO {
    
    public static User Login(String Email, String Password)
    {
        try{
            Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();
            String select = "Select * from Users where UserName ='"
                    +Email
                    +"'" 
                    +" and"
                    + " UserPass = '"
                    +Password
                    +"'" ;
                    
            ResultSet resultSet  = statement.executeQuery(select);
            if(resultSet.next())
            {
                 User user = new User();
            user.setUserId(resultSet.getString("UserId"));
            user.setUserName(resultSet.getString("UserName"));
            user.setUserPass(resultSet.getString("UserPass"));
            user.setFullName(resultSet.getString("FullName"));
            user.setUserRole(resultSet.getString("UserRole"));
            user.setUserAddress(resultSet.getString("UserAddress"));
            user.setPhoneNumber(resultSet.getString("PhoneNumber"));
             //CLsoe instance sql
                 sqlinstance.conn.close();
            return user;
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    public static String ValidationRegister(String Username, String Password, String ConfirmPassword)
    {
        
        String validation ="";
            //
            if(Username.isEmpty() || Password.isEmpty() ||ConfirmPassword.isEmpty())
            {
                if(Username.isEmpty())
                    validation += "Username must be fill ";
                if(Password.isEmpty())
                    validation += "- Password must be fill ";
                if(ConfirmPassword.isEmpty())
                    validation += "- Confirm password must be fill ";
       
            }
            if(!Password.equals(ConfirmPassword))
            {
                validation += "- Confirm password phải đúng với pasword đã nhập";
      
            }
        
        return validation;
    }
    public static boolean UserIsExist(String UserName, String Password)
    {
        
        try{
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return false;
    }
}
