/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject.DAO;

import java.util.Objects;

/**
 *
 * @author Acer
 */
public class BookDetail {
   String BookId,AuthorId;

    public String getBookId() {
        return BookId;
    }

    public void setBookId(String BookId) {
        this.BookId = BookId;
    }

    public String getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(String AuthorId) {
        this.AuthorId = AuthorId;
    }
   @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        BookDetail db = (BookDetail) obj;
        return BookId == db.BookId && AuthorId == db.AuthorId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(BookId, AuthorId);
    }
}
