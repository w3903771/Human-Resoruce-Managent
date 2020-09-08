package human.resource.login;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//Login Frame
public class Login extends JFrame {       
    
    private JLayeredPane pane=new JLayeredPane();//最底层层级面板
    private JPanel backPanel=new JPanel();//背景图片
    private JPanel headPanel=new JPanel();//标题 
    private JPanel panel1 =new JPanel();//帐号
    private JPanel panel2 =new JPanel();//密码
    private JPanel panel3 =new JPanel();//按钮
    private JLabel back;//背景图片
    private JLabel headLight=new JLabel("Human Resource Management");//标题
    private JLabel userLabel =new JLabel("username:");
    private JLabel passwordLabel = new JLabel("password:");
    private JTextField userText = new JTextField();
    private JPasswordField passwordText = new JPasswordField();
    private JButton but1 = new JButton("Login");
    ImageIcon image;
    
    @SuppressWarnings("unchecked")
    public Login() {
        image=new ImageIcon(getClass().getResource("/Photos/1.jpg"));
        headLight.setOpaque(false);
        userLabel.setOpaque(false);
        userText.setOpaque(false);
        passwordLabel.setOpaque(false);
        passwordText.setOpaque(false);
        backPanel.setOpaque(false);
        headPanel.setOpaque(false);
        panel1.setOpaque(false);
        panel2.setOpaque(false);
        panel3.setOpaque(false);
        
        //background photo
        back=new JLabel(image);
        backPanel.setBounds(0, 0, image.getIconWidth(), image.getIconHeight());
        backPanel = (JPanel)this.getContentPane(); 
        backPanel.add(back);
        
        //title
        headLight.setFont(new Font("黑体",Font.BOLD,35));
        headPanel.setLayout(new GridLayout(1,1));
        headPanel.setBounds(10,40,500,200);
        headPanel.add(headLight);
        
        //user
        userLabel.setFont(new Font("黑体",Font.BOLD,40));
        userText.setFont(new Font("黑体",Font.BOLD,40));
        panel1.setLayout(new GridLayout(2,1));		
        panel1.setBounds(130, 240, 220, 70);						
        panel1.add(userLabel);		
        panel1.add(userText);	

        //password
        passwordLabel.setFont(new Font("黑体",Font.BOLD,40));
        passwordText.setFont(new java.awt.Font("Yu Gothic Medium", 0, 30));
        panel2.setLayout(new GridLayout(2,1));		
        panel2.setBounds(130, 330, 220, 70);						
        panel2.add(passwordLabel);		
        panel2.add(passwordText);	
        
        //buttion
        but1.setSize(300,60);
        but1.setFont(new Font("黑体",Font.BOLD,20));
        panel3.setLayout(new GridLayout(1,2));		
        panel3.setBounds(50, 500, 400, 50);						
        panel3.add(but1);		
        
        pane.add(backPanel,JLayeredPane.DEFAULT_LAYER);
        pane.add(headPanel, JLayeredPane.MODAL_LAYER);
        pane.add(panel1,JLayeredPane.MODAL_LAYER);
        pane.add(panel2,JLayeredPane.POPUP_LAYER);
        pane.add(panel3,JLayeredPane.DRAG_LAYER);
        
        //Login event
        but1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                new Userverify(userText.getText(),new String(passwordText.getPassword()));
                userText.setText("");
                passwordText.setText("");
            }
        });
    
        this.setSize(image.getIconWidth(),image.getIconHeight());
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((dim.width - this.getWidth()) / 2, (dim.height - this.getHeight()) / 2);
        this.setTitle("Human Resource Management");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setLayeredPane(pane);
        this.setResizable(false);
        this.setVisible(true);
        
        
    }
    public static void main(String[] args) {Login login = new Login();}
    
}