package human.resource.login;

import human.resoruce.dbconnection.DbConnect;
import human.resoruce.managent.MainFrame;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//acount verify
public class Userverify {

    String sql = null;  
    DbConnect db = null;
    ResultSet ret = null;  
    
    public Userverify(String user,String pass) {
        //select spicific accout
        sql = "select username,password,authority from person where username="+'"'+user+'"';
        db = new DbConnect(sql);
        
        try {  
            //ret will recieve query answers
            ret = db.pst.executeQuery();
            while (ret.next()) {  
                String u = ret.getString(1);  //username in db
                String p = ret.getString(2);  //password in db
                int authority=ret.getInt(3);        
                if(u.equals(user)&&p.equals(pass)&&authority==2) {
                    MainFrame mainFrame = new MainFrame(u,1); //administration
                } 
                else if(u.equals(user)&&p.equals(pass)&&authority==1){
                    MainFrame mainFrame = new MainFrame(u,0); //normal user
                }
                else {
                	JOptionPane.showMessageDialog(null,"Account or password is wrong ！！！","错误",JOptionPane.ERROR_MESSAGE);
                }
            }
            ret.close();  
            db.close();
            } catch (SQLException e) {  
                  e.printStackTrace();  
              }
              catch(Exception e1){
                  e1.printStackTrace();
              }
    }
    public static void main(String[] args) {}
}
