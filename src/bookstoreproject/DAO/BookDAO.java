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
    public static void updateDbAfterBuyBook(String BookId,int SOluongMua)
       {
           try
           {
                Connect sqlinstance = new Connect();
                sqlinstance.Connect();
                Statement state = sqlinstance.conn.createStatement();
                String GetOldTonKho = "Select TonKho from Book where BookId = '"
                   + BookId
                   +"';";
                ResultSet oldTonKho = state.executeQuery(GetOldTonKho);
                oldTonKho.next();
                int NewTonKho = Integer.parseInt(oldTonKho.getString("TonKho")) - SOluongMua;
                
                String updateString = "update  Book\n"
                +"set TonKho = " + NewTonKho
                + " where BookId = '" + BookId
                + "'";
                
                int isUpdated = state.executeUpdate(updateString);
                sqlinstance.conn.close();
           }
           
          catch(Exception e)
          {
              
          }
       }
    public static int getSoLuongSachConBan()
    {
        try
        {
            Connect conn = new Connect();
            conn.Connect();
            Statement state = conn.conn.createStatement();
            String select = "select COUNT(BookId) as soLuongSach from Book where TonKho > 0";
            ResultSet rs = state.executeQuery(select);
            while(  rs.next())
            {
                  return Integer.parseInt(rs.getString("soLuongSach"));
            }
          
          
        }
        catch(Exception e)
        {
            
        }
        return 0;
    }
    
    public static int GetSoSachDaBanById(String BookId)
    {
        try
        {
            Connect con = new Connect();
            con.Connect();
            Statement state = con.conn.createStatement();
            
            String select = "select SUM(SoLuong) as TongSachDaBan from Book,ChiTietHoaDon where Book.BookId = ChiTietHoaDon.BookId and Book.BookId = '"
                    + BookId
                    + "';";
            ResultSet rs = state.executeQuery(select);
            while(rs.next())
            {
                return Integer.parseInt(rs.getString("TongSachDaBan"));
            }
            
        }catch(Exception e)
        {
            
        }
        return 0;
    }
     public static int GetGiaSachById(String BookId)
    {
        try
        {
            Connect con = new Connect();
            con.Connect();
            Statement state = con.conn.createStatement();
            
            String select = "select Price from Book where BookId = '"
                    + BookId
                    + "';";
            ResultSet rs = state.executeQuery(select);
            while(rs.next())
            {
                return Integer.parseInt(rs.getString("Price"));
            }
            
        }catch(Exception e)
        {
            
        }
        return 0;
    }
}
