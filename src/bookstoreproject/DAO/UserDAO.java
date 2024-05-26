/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject.DAO;

import bookstoreproject.MODAL.User;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class UserDAO {

    public static User GetUser(String Email, String Password) {
        try {
            Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();
            String select = "Select * from Users where UserName ='"
                    + Email
                    + "'"
                    + " and"
                    + " UserPass = '"
                    + Password
                    + "'";

            ResultSet resultSet = statement.executeQuery(select);
            if (resultSet.next()) {
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
            sqlinstance.conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String ValidationRegister(String Username, String Password, String ConfirmPassword) {

        String validation = "";
        //
        if (Username.isEmpty() || Password.isEmpty() || ConfirmPassword.isEmpty()) {
            if (Username.isEmpty()) {
                validation += "Username must be fill ";
            }
            if (Password.isEmpty()) {
                validation += "- Password must be fill ";
            }
            if (ConfirmPassword.isEmpty()) {
                validation += "- Confirm password must be fill ";
            }

        }
        if (!Password.equals(ConfirmPassword)) {
            validation += "- Confirm password phải đúng với pasword đã nhập";

        }

        return validation;
    }

    public static User UserIsExist(String UserName, String Password) {
        User user = new User();
        try {
            Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();
            String FindUser = "Select * from Users where UserName ='"
                    + UserName
                    + "' "
                    + " and"
                    + " UserPass = '"
                    + Password
                    + "'";
            ResultSet resultSet = statement.executeQuery(FindUser);
            if (resultSet.next()) {
                user.setUserId(resultSet.getString("UserId"));
                user.setUserName(resultSet.getString("UserName"));
                user.setUserPass(resultSet.getString("UserPass"));
                user.setFullName(resultSet.getString("FullName"));
                user.setUserRole(resultSet.getString("UserRole"));
                user.setUserAddress(resultSet.getString("UserAddress"));
                user.setPhoneNumber(resultSet.getString("PhoneNumber"));

                sqlinstance.conn.close();
                return user;
            }
            sqlinstance.conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Boolean Register(User user) {
        try {
            Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();

            String IdQuery = "select UserId from Users order by UserId;";
            ResultSet idResult = statement.executeQuery(IdQuery);
            // Find the first missing ID
            int expectedId = 1;
            while (idResult.next()) {
                String currentId = idResult.getString("UserId").substring(1); // Remove 'C' prefix
                int currentIdNumber = Integer.parseInt(currentId);
                if (currentIdNumber != expectedId) {
                    break;
                }
                expectedId++;
            }
            String InsertQuery = "insert into Users(UserId,UserName,UserPass,FullName,UserRole) values('"
                    + "U" + expectedId
                    + "','"
                    + user.getUserName()
                    + "','"
                    + user.getUserPass()
                    + "','"
                    + "','User');";
            int result = statement.executeUpdate(InsertQuery);
            if (result != 0) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static Boolean EditProfile(User Current, User New)
    {
        try
        {
            Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();
            String updatequery = "update Users\n" 
            +"set FullName = '"
            + New.getFullName()
            + "',UserAddress = '"
            + New.getUserAddress()
            +"',PhoneNumber = '"
            + New.getPhoneNumber()
            +"'\n" +
            "where UserName = '"
            + Current.getUserName()
            + "' and UserPass ='"
            + Current.getUserPass()
            +"';";

            int issucceed = statement.executeUpdate(updatequery);
            
            if(issucceed != 0)
            {
                sqlinstance.closeConnect();
                return true;
            }
            sqlinstance.closeConnect();
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return false;
    }
   public static Boolean AddUser(User user) {
        try {
            Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();

            String IdQuery = "select UserId from Users order by UserId;";
            ResultSet idResult = statement.executeQuery(IdQuery);
            // Find the first missing ID
            int expectedId = 1;
            while (idResult.next()) {
                String currentId = idResult.getString("UserId").substring(1); // Remove 'C' prefix
                int currentIdNumber = Integer.parseInt(currentId);
                if (currentIdNumber != expectedId) {
                    break;
                }
                expectedId++;
            }
            String InsertQuery = "insert into Users(UserId,UserName,UserPass,FullName,UserRole) values('"
                    + "U" + expectedId
                    + "','"
                    + user.getUserName()
                    + "','"
                    + user.getUserPass()
                    + "','"
                    + "','"
                    +user.getUserRole()
                    + "');";
            int result = statement.executeUpdate(InsertQuery);
            if (result != 0) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
   
   public static Boolean ExistUserName(String Username)
   {
       try{
            Connect ConnectInstance = new Connect();
            ConnectInstance.Connect();
            Statement statement = ConnectInstance.conn.createStatement();

            //////////////////////Exist validation
            String FindUser = "Select * from Users where UserName ='"
                    + Username
                    + "';";

            ResultSet FindResult = statement.executeQuery(FindUser);
            if (FindResult.next()) {
               ConnectInstance.closeConnect();
                return true;
            }
            //////////////////////Exist validation
             ConnectInstance.closeConnect();
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       return false;
   }
   public static String GetPasswordByUserName(String Username)
   {
       try{
            Connect ConnectInstance = new Connect();
            ConnectInstance.Connect();
            Statement statement = ConnectInstance.conn.createStatement();

            //////////////////////Exist validation
            String FindUser = "Select * from Users where UserName ='"
                    + Username
                    + "';";

            ResultSet FindResult = statement.executeQuery(FindUser);
            if (FindResult.next()) {
               
                
               
               ConnectInstance.closeConnect();
                return FindResult.getString("UserPass");
            }
            //////////////////////Exist validation
             ConnectInstance.closeConnect();
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       return null;
   }
   public static Boolean DeleteUserById(String UserId)
   {
       try
       {
            Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();
             String updatequery = "Delete from Users\n"
                    + "\n"
                    + "where UserId = '"
                    + UserId
                    + "';";

            int issucceed = statement.executeUpdate(updatequery);
            if(issucceed != 0)
            {
                sqlinstance.closeConnect();
                return true;
            }
            sqlinstance.closeConnect();
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       return false;
   }
   public static Boolean UpdateUserRole(String Role,String UserId)
   {
       try{
           Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();

            ///////////////////////update stage
            String updatequery = "update Users\n"
                    + "set UserRole = '"
                    + Role
                    + "' where UserId = '"
                    + UserId
                    + "';";
            int result = statement.executeUpdate(updatequery);
            if(result != 0)
            {
                sqlinstance.closeConnect();
                return true;
            }
            sqlinstance.closeConnect();
       }catch(Exception e)
       {
           e.printStackTrace();
       }
       return false;
   }
   
   public static ArrayList<User> SearchUser(String SearchString)
   {
       ArrayList<User> temp = new ArrayList<>();
       try {
            Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement stateget = sqlinstance.conn.createStatement();
            String SelectQueryAll = "Select * from Users \n"
                    + "Where "
                    + "UserName = '"
                    + SearchString
                    + "' or UserId = '"
                    + SearchString
                    + "' or UserRole = '"
                    + SearchString
                    +"';";

            ResultSet resultSet = stateget.executeQuery(SelectQueryAll);
            while (resultSet.next()) {
                User user = new User();
                user.setUserId(resultSet.getString("UserId"));
                user.setUserName(resultSet.getString("UserName"));
                user.setFullName(resultSet.getString("FullName"));
                user.setUserRole(resultSet.getString("UserRole"));
                user.setPhoneNumber(resultSet.getString("PhoneNumber"));
                temp.add(user);
            }
            sqlinstance.conn.close();
            return temp;
        } catch (Exception e) {

            e.printStackTrace();
        }
       return null;
   }
}
