/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject.MODAL;

/**
 *
 * @author Acer
 */
public class Author {
    String AuthorId,Name,GioiThieu,DateOfBirth;

    public Author() {
    }

    public Author(String AuthorId, String Name, String GioiThieu, String DateOfBirth) {
        this.AuthorId = AuthorId;
        this.Name = Name;
        this.GioiThieu = GioiThieu;
        this.DateOfBirth = DateOfBirth;
    }

    public String getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(String AuthorId) {
        this.AuthorId = AuthorId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGioiThieu() {
        return GioiThieu;
    }

    public void setGioiThieu(String GioiThieu) {
        this.GioiThieu = GioiThieu;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }
    
}
