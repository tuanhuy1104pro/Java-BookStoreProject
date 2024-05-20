/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject.DAO;

import bookstoreproject.MODAL.Coupon;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class CouponDAO {
    public static String ValidationString(String CouponName, String CouponPercen)
    {
        String validation ="";
        if (CouponName.isEmpty() || CouponPercen.isEmpty()) {
            if (CouponName.isEmpty()) {
                validation += "Name Coupon must be fill ";
            }
            if (CouponPercen.isEmpty()) {
                validation += "- Discount value must be fill ";
            }
        }

        ////////////////////Discount validation - float
        if (!CouponPercen.matches("\\d+\\.\\d+")) {
           validation+= "- CouponPercent must only digit and float type";
        }
        
        return validation;
    }
    
    public static Boolean CreateCoupon(Coupon cp)
    {
         try {
            Connect ConnectInstance = new Connect();
            ConnectInstance.Connect();
            Statement statement = ConnectInstance.conn.createStatement();

            //////////////////////Exist validation
            String FindUser = "Select * from Coupon where CouponName ='"
                    + cp.getCouponName()
                    + "'; ";

            ResultSet FindResult = statement.executeQuery(FindUser);
            if (FindResult.next()) {
                JOptionPane.showMessageDialog(null, "Coupon đã tồn tại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
            //////////////////////Exist validation

            /////////////////// add Coupon stage
            // Get all existing IDs
            String IdQuery = "select CouponId from Coupon order by CouponId;";
            ResultSet idResult = statement.executeQuery(IdQuery);

            // Find the first missing ID
            int expectedId = 1;
            while (idResult.next()) {
                String currentId = idResult.getString("CouponId").substring(1); // Remove 'C' prefix
                int currentIdNumber = Integer.parseInt(currentId);
                if (currentIdNumber != expectedId) {
                    break;
                }
                expectedId++;
            }
            ///Begin add coupon
            String InsertQuery = "insert into Coupon(CouponId,CouponName,Discount) values('"
                    + "C" + expectedId
                    + "','"
                    + cp.getCouponName()
                    + "',"
                    + cp.getDiscount()
                    + ");";

            Statement state = ConnectInstance.conn.createStatement();
            int row = state.executeUpdate(InsertQuery);
            if (row != 0) {
                
                /////
                ConnectInstance.conn.close();
                return true;
            }
                ConnectInstance.conn.close();
                
        } catch (Exception e) {
            e.printStackTrace();
        }
         return false;
    }
    public static Boolean EditCoupon(Coupon cp)
    {
        try {
            Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();

             //////////////////////Exist validation
            String FindUser = "Select * from Coupon where CouponName ='"
                    + cp.getCouponName()
                    + "'; ";

            ResultSet FindResult = statement.executeQuery(FindUser);

            if (FindResult.next()) {

                if (FindResult.getString("CouponName").equals(cp.getCouponName()) && !FindResult.getString("CouponId").equals(cp.getCouponId())) {
                    JOptionPane.showMessageDialog(null, "Coupon đã tồn tại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    return false;
                }
            }
            //////////////////////Exist validation
            ///////////////////////update stage

            String updatequery = "update Coupon\n"
                    + "set CouponName = '"
                    + cp.getCouponName()
                    + "',Discount = "
                    + cp.getDiscount()
                    + "\n"
                    + "where CouponId = '"
                    + cp.getCouponId()
                    + "';";

            int issucceed = statement.executeUpdate(updatequery);
            if (issucceed != 0) {

                
                sqlinstance.conn.close();
                return true;
            }
            sqlinstance.conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static Boolean DeleteCoupon(String CouponId)
    {
        try
        {
            Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement statement = sqlinstance.conn.createStatement();
            String updatequery = "Delete from Coupon\n"
                    + "\n"
                    + "where CouponId = '"
                    + CouponId
                    + "';";

            int issucceed = statement.executeUpdate(updatequery);
            if (issucceed != 0) {
                
                sqlinstance.conn.close();
                return true;
            }
            sqlinstance.conn.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return false;
    }
    public static ArrayList<Coupon> SearchCoupon(String Search)
    {
        ArrayList<Coupon> temp = new ArrayList<>();
        try {
            Connect sqlinstance = new Connect();
            sqlinstance.Connect();
            Statement stateget = sqlinstance.conn.createStatement();
            String SelectQueryAll = "Select * from Coupon \n"
                    + "Where "
                    + "CouponName = '"
                    + Search
                    + "' or CouponId = '"
                    + Search
                    + "';";

            ResultSet couponResult = stateget.executeQuery(SelectQueryAll);
            while (couponResult.next()) {
                Coupon cp = new Coupon();
                cp.setCouponId(couponResult.getString("CouponId"));
                cp.setCouponName(couponResult.getString("CouponName"));
                cp.setDiscount(Float.parseFloat(couponResult.getString("Discount")));
                temp.add(cp);
            }
            sqlinstance.conn.close();
        } catch (Exception e) {

            e.printStackTrace();
        }
        return temp;
    }
}
