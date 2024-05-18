/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject.MODAL;

/**
 *
 * @author Acer
 */
public class Coupon {
    String CouponId,CouponName;
    float Discount;

    public Coupon() {
    }

    public Coupon(String CouponId, String CouponName, float Discount) {
        this.CouponId = CouponId;
        this.CouponName = CouponName;
        this.Discount = Discount;
    }

    public String getCouponId() {
        return CouponId;
    }

    public void setCouponId(String CouponId) {
        this.CouponId = CouponId;
    }

    public String getCouponName() {
        return CouponName;
    }

    public void setCouponName(String CouponName) {
        this.CouponName = CouponName;
    }

    public float getDiscount() {
        return Discount;
    }

    public void setDiscount(float Discount) {
        this.Discount = Discount;
    }
    
}
