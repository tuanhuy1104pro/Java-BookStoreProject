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
public class HoaDonDAO {
    public static Boolean DeleteHdByUSerId(String UserId)
    {
        try
        {
             Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();
            String DeleteHoaDonQ = "Delete from HoaDon\n"
                    + "\n"
                    + "where UserId = '"
                    + UserId
                    + "';";

           int result = statement.executeUpdate(DeleteHoaDonQ);
           if(result !=0)
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
    public static Boolean DeleteHdById(String IdHd)
    {
        try
        {
            Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();
            String DeleteHoaDonQ = "Delete from HoaDon\n"
                    + "\n"
                    + "where CouponId = '"
                    + IdHd
                    + "';";

            statement.executeUpdate(DeleteHoaDonQ);
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
}
