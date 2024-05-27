/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstoreproject.DAO;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Connect {
    String DatabaseName="DbBookStore",User="",Password="",Server="LAPTOP-753E617N\\TUANHUY1104PRO";
    public Connection conn;
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
        try
        {
            String ConnectionString = "jdbc:sqlserver://"
                   +this.Server
                    +":1433;database="
                    +this.DatabaseName+";user="
                    +this.User+";password="
                    +this.Password + ";encrypt=true;"
                    + "trustServerCertificate=true;"
                    +"integratedSecurity=false;";
        
            conn = DriverManager.getConnection(ConnectionString);
            
            
        }catch(SQLException  e)
        {
            e.printStackTrace();
            
        }
    }
    public void closeConnect()
    {
          try
            {
                conn.close();
            }catch(SQLException ex)
            {
                ex.printStackTrace();
            }
    }
      
}
