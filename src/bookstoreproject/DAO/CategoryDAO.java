/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject.DAO;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class CategoryDAO {
    public static Boolean AddCate(String TheLoai)
    {
          try{
                Connect ConnectInstance  = new Connect();
            ConnectInstance.Connect();
            Statement statement = ConnectInstance.conn.createStatement();
            
             //////////////////////Exist validation
            String FindCate = "Select * from Category where CategoryName =N'"
                    +TheLoai
                    +"';";
                    
             ResultSet FindResult  = statement.executeQuery(FindCate);
            if(FindResult.next()){
                 JOptionPane.showMessageDialog(null, "Category đã tồn tại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                 return false;
            }
            //////////////////////Exist validation
            
            /////////////////// add User stage
            // Get all existing IDs
            String IdQuery = "select CategoryId from Category order by CategoryId;";
            ResultSet idResult = statement.executeQuery(IdQuery);

            // Find the first missing ID
            int expectedId = 1;
            while(idResult.next()){
                    String currentId = idResult.getString("CategoryId"); // Remove 'C' prefix
                    int currentIdNumber = Integer.parseInt(currentId);
                    if(currentIdNumber != expectedId){
                        break;
                     }
                    expectedId++;
            }
            ///Begin add User
            String InsertQuery = "insert into Category(CategoryId,CategoryName) values("
                    +expectedId
                    +",N'"
                    +TheLoai
                     + "');";
                    
            
            Statement state = ConnectInstance.conn.createStatement();
            int row = state.executeUpdate(InsertQuery);
            if(row != 0)
            {
               
                /////
                ConnectInstance.conn.close();
                return true;
            }
            ConnectInstance.conn.close();  
           }catch(Exception e)
           {
               e.printStackTrace();
           }
          return false;
    }
    
    public static Boolean DelCateByName(String NameCate)
    {
        
        try
        {
            
            Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();
            
            
            String FindCate = "Select * from Category where CategoryName =N'"
                    +NameCate
                    +"';";
                    
             ResultSet FindResult  = statement.executeQuery(FindCate);
            if(!FindResult.next()){
                 JOptionPane.showMessageDialog(null, "Category Không tồn tại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                 return false;
            }
            
            ///////////////////////Delete stage
            String updatequery = "Delete from Category\n"
                    + "\n"
                    + "where CategoryName = N'"
                    + NameCate
                    + "';";
            Statement statement2 = sqlinstance.conn.createStatement();
            int issucceed = statement2.executeUpdate(updatequery);
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
}
