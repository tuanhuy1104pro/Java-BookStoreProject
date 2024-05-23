/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject.DAO;

import java.sql.Statement;

/**
 *
 * @author Acer
 */
public class BookDetailDAO {
    public static Boolean DeleteBookDetailById(String Id)
    {
        try
        {
             Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();

            ///////////////////////Delete stage
            //Delete Book Detail
            String Delete = "Delete from BookDetail"
                    + "\n"
                    + "where BookId = '"
                    + Id
                    + "';";

            int issucceed = statement.executeUpdate(Delete);
            if(issucceed != 0)
                return true;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
   
}
