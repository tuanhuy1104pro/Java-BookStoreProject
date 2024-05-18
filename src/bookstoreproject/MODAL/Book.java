/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject.MODAL;

/**
 *
 * @author Acer
 */
public class Book {
    String BookId,BookName,GioiThieu;
    int CateggoryId,Price,TonKho;

    public Book() {
    }

    public Book(String BookId, String BookName, String GioiThieu, int CateggoryId, int Price,int TonKho) {
        this.BookId = BookId;
        this.BookName = BookName;
        this.GioiThieu = GioiThieu;
        this.CateggoryId = CateggoryId;
        this.Price = Price;
        this.TonKho = TonKho;
    }

    public String getBookId() {
        return BookId;
    }

    public void setBookId(String BookId) {
        this.BookId = BookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public String getGioiThieu() {
        return GioiThieu;
    }

    public void setGioiThieu(String GioiThieu) {
        this.GioiThieu = GioiThieu;
    }

    public int getCateggoryId() {
        return CateggoryId;
    }

    public void setCateggoryId(int CateggoryId) {
        this.CateggoryId = CateggoryId;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getTonKho() {
        return TonKho;
    }

    public void setTonKho(int TonKho) {
        this.TonKho = TonKho;
    }
    
}
