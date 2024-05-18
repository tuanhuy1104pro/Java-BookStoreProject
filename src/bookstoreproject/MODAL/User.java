/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject.MODAL;

/**
 *
 * @author Acer
 */
public class User {
    String UserId,UserName,UserPass,FullName,UserAddress,PhoneNumber,UserRole;

    public User() {
    }

    public User(String UserId, String UserName, String UserPass, String FullName, String UserAddress, String PhoneNumber, String UserRole) {
        this.UserId = UserId;
        this.UserName = UserName;
        this.UserPass = UserPass;
        this.FullName = FullName;
        this.UserAddress = UserAddress;
        this.PhoneNumber = PhoneNumber;
        this.UserRole = UserRole;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserPass() {
        return UserPass;
    }

    public void setUserPass(String UserPass) {
        this.UserPass = UserPass;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getUserAddress() {
        return UserAddress;
    }

    public void setUserAddress(String UserAddress) {
        this.UserAddress = UserAddress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getUserRole() {
        return UserRole;
    }

    public void setUserRole(String UserRole) {
        this.UserRole = UserRole;
    }
    
}
