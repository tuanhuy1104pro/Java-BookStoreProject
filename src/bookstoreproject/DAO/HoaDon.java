/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject.DAO;

/**
 *
 * @author Acer
 */
public class HoaDon {
    String IdHoaDon,UserId,NgayXuat;
    long TongTien;

    public HoaDon() {
    }

    public HoaDon(String IdHoaDon, String UserId, String NgayXuat, long TongTien) {
        this.IdHoaDon = IdHoaDon;
        this.UserId = UserId;
        this.NgayXuat = NgayXuat;
        this.TongTien = TongTien;
    }

    public String getIdHoaDon() {
        return IdHoaDon;
    }

    public void setIdHoaDon(String IdHoaDon) {
        this.IdHoaDon = IdHoaDon;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getNgayXuat() {
        return NgayXuat;
    }

    public void setNgayXuat(String NgayXuat) {
        this.NgayXuat = NgayXuat;
    }

    public long getTongTien() {
        return TongTien;
    }

    public void setTongTien(long TongTien) {
        this.TongTien = TongTien;
    }
    
}
