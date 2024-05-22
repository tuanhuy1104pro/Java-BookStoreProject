/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject.DAO;

import java.sql.Statement;
import java.util.ArrayList;
import bookstoreproject.MODAL.Book;
import java.sql.ResultSet;
/**
 *
 * @author Acer
 */
public class BookDAO {
    public static Boolean DeleteBookById(String Id)
    {
        try
        {
             Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();
            String updatequery = "Delete from Book\n"
                        + "\n"
                        + "where BookId = '"
                        + Id
                        + "';";

                int issucceed2 = statement.executeUpdate(updatequery);
                if(issucceed2 != 0)
                    return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return false;
    }
    
}
