package human.resoruce.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//数据库连接
public class DbConnect {
    static final String DB_URL = "jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC";  
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    
//  Mysql version lower than 8.0
//    static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
//    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    
    static final String user = "root";  
    static final String password = "root";  
  
    public Connection conn = null;  
    public PreparedStatement pst = null;  
  
    public DbConnect(String sql) {  
        try {  
            //注册JDBC驱动
            Class.forName(JDBC_DRIVER);
            //打开链接
            conn = DriverManager.getConnection(DB_URL,user,password);  
            pst = conn.prepareStatement(sql);
        } catch(SQLException e){            
            JOptionPane.showMessageDialog(null, "Connection is not Opened ! " + e.getMessage());      
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Class not found ! " + ex.getMessage());     
        }
    }  
  
    public void close() {  
        try {  
            this.conn.close();  
            this.pst.close();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    } 
    public static void main(String[] args) {
    	
    }
}
