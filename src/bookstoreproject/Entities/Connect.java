/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject.Entities;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Connect {
    String DatabaseName,User,Password,Server;

    public Connect() {
    }

    public Connect(String DatabaseName, String User, String Password, String Server) {
        this.DatabaseName = DatabaseName;
        this.User = User;
        this.Password = Password;
        this.Server = Server;
    }

    
    public String getDatabaseName() {
        return DatabaseName;
    }

    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public void Connect()
    {
        Scanner sc = new Scanner(System.in);
        if(DatabaseName == null || User == null || Password == null)
        {
            System.out.printf("Server: ");
            this.Server = sc.next();
            System.out.printf("DatabaseName: ");
            this.DatabaseName= sc.next();
            System.out.printf("User: ");
            this.User = sc.next();
            System.out.printf("Password: ");
            this.Password = sc.next();
        }
        String ConnectionString = "jdbc:sqlserver://"+this.Server+":1433;databaseName="+this.DatabaseName+";user="+this.User+";password=" +this.Password;
        
        

    }
}
