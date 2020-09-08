package human.resoruce.managent;

import human.resoruce.dbconnection.DbConnect;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InfoShow1 extends JFrame{

    String username;
    JTable table;
    DefaultTableModel model;
    
    public InfoShow1(String user) {
        
        this.username=user;
        this.setSize(800,550);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((dim.width - this.getWidth()) / 2, (dim.height - this.getHeight()) / 2);
        this.setTitle("Info Show");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
	
         table=new JTable();
         table.setBounds(10,100,900,400);
	model=new DefaultTableModel();
         this.showInfo();
	table.setModel(model);
	JScrollPane sp=new JScrollPane(table);
	sp.setBounds(50,100,900,400);
	
	this.add(sp);
             
         this.setVisible(true);
    }     

    public void showInfo() {
        String sql=null;
        DbConnect db=null;
        ResultSet ret=null;
        sql="select name,salary,skill,workyear,experience from person";
        db=new DbConnect(sql);
        try {
            ret=db.pst.executeQuery();
            ResultSetMetaData rsmd=ret.getMetaData();
            int count =rsmd.getColumnCount();
            Vector t=new Vector();
            for(int i=1;i<=count;i++) {
                //table head
                 t.add(rsmd.getColumnName(i));
            }
            
            Vector data=new Vector();//one row 
            while(ret.next()) {
                Vector v1=new Vector();
                for(int i=0;i<count;i++) {
                        v1.add(ret.getString(i+1));
                }
                data.add(v1);
            }
            model=new DefaultTableModel(data, t);
            ret.close();
            db.close();
	} catch (SQLException e) {
            e.printStackTrace();
            }
	}
    
    public static void main(String user) {
        InfoShow1 infoShow1 = new InfoShow1(user);
    }
}
