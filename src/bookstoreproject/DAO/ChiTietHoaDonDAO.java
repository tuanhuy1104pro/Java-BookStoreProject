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
public class ChiTietHoaDonDAO {

    public static Boolean DeleteChiTietHDByUserId(String UserId) {
        try {
            Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();

            //////////////////Delete chitiet Hoadon
            String SelectHoadonQ = "select IdHoaDon from HoaDon where UserId = '"
                    + UserId
                    + "';";
            ResultSet rs = statement.executeQuery(SelectHoadonQ);

            while (rs.next()) {
                String GetIdHoaDon = rs.getString("IdHoaDon");
                String DeleteChiTietHoaDonQ = "Delete from ChiTietHoaDon\n"
                        + "\n"
                        + "where IdHoaDon = '"
                        + GetIdHoaDon
                        + "';";

                int result = statement.executeUpdate(DeleteChiTietHoaDonQ);
                if (result != 0) {
                    statement.close();
                    return true;
                }

                statement.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static Boolean DeleteChiTietHdByCouponId(String CpId) {
        try {
            Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();

            //////////////////Delete chitiet Hoadon
            String SelectHoadonQ = "select IdHoaDon from HoaDon where CouponId = '"
                    + CpId
                    + "';";
            ResultSet rs = statement.executeQuery(SelectHoadonQ);

            while (rs.next()) {
                String IdHoaDon = rs.getString("IdHoaDon");
                String DeleteChiTietHoaDonC = "Delete from ChiTietHoaDon\n"
                        + "\n"
                        + "where IdHoaDon = '"
                        + IdHoaDon
                        + "';";

                Statement deleteStatement = sqlinstance.conn.createStatement();
                deleteStatement.executeUpdate(DeleteChiTietHoaDonC);
                deleteStatement.close();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
