/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject.DAO;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Acer
 */
public class AuthorDAO {

    public static int getSoLuongAuthor() {
        try {
            Connect conn = new Connect();
            conn.Connect();
            Statement state = conn.conn.createStatement();
            String select = "select COUNT(AuthorId) as soLuong from Author";
            ResultSet rs = state.executeQuery(select);
            rs.next();
            return Integer.parseInt(rs.getString("soLuong"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int GetSoSachDaBanByAuthor(String AuthorName) {
        try {
            Connect con = new Connect();
            con.Connect();
            Statement state = con.conn.createStatement();

           String select = "select SUM(SoLuong) as SoLuong from Book,ChiTietHoaDon,Author,BookDetail where Book.BookId = ChiTietHoaDon.BookId and Book.BookId = BookDetail.BookId and BookDetail.AuthorId = Author.AuthorId\n"
                    + "and Author.Name = N'"
                    + AuthorName
                    + "'";
            ResultSet rs = state.executeQuery(select);
            while (rs.next()) {
                return Integer.parseInt(rs.getString("SoLuong"));
            }

        } catch (Exception e) {

        }
        return 0;
    }

    public static int TongDoanhThuTheoAuthor(String AuthorName) {
        int sum = 0;
        try {
            Connect con = new Connect();
            con.Connect();
            Statement state = con.conn.createStatement();

            String select = "select * from Book,ChiTietHoaDon,Author,BookDetail where Book.BookId = ChiTietHoaDon.BookId and Book.BookId = BookDetail.BookId and BookDetail.AuthorId = Author.AuthorId\n"
                    + "and Author.Name = N'"
                    + AuthorName
                    + "'";
            ResultSet rs = state.executeQuery(select);
            while (rs.next()) {
                int giatien = Integer.parseInt(rs.getString("Price"));
                int soluong = Integer.parseInt(rs.getString("SoLuong"));
                sum += giatien * soluong;
            }

        } catch (Exception e) {

        }
        return sum;
    }
}
