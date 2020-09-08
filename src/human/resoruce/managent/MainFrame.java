package human.resoruce.managent;

import human.resoruce.dbconnection.DbConnect;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainFrame extends javax.swing.JFrame {
    String user;
    int right;
    
   //right=1 admin    right =0 normal
    public MainFrame(String user,int right) {
        this.user=user;
        this.right=right;
        initComponents();
        showInfo(user);
        //normal users could only check and change their own info
        if(right==0){
            userManageButton.setEnabled(false);
        }
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((dim.width - this.getWidth()) / 2, (dim.height - this.getHeight()) / 2);
        this.setTitle("HRM");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        userText = new javax.swing.JLabel();
        nameText = new javax.swing.JLabel();
        positText = new javax.swing.JLabel();
        passwordText = new javax.swing.JLabel();
        phoneText = new javax.swing.JLabel();
        skillText = new javax.swing.JLabel();
        authorityText = new javax.swing.JLabel();
        salaryText = new javax.swing.JLabel();
        cityText = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        passChangeButtion = new javax.swing.JMenuItem();
        changeInfoButton = new javax.swing.JMenuItem();
        infoSearchButton = new javax.swing.JMenu();
        userManageButton = new javax.swing.JMenu();
        exitButton = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Personal Information");

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setText("Username");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setMaximumSize(new java.awt.Dimension(86, 28));
        jLabel2.setMinimumSize(new java.awt.Dimension(86, 28));
        jLabel2.setPreferredSize(new java.awt.Dimension(86, 28));

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel5.setText("Password");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        jLabel5.setMaximumSize(new java.awt.Dimension(86, 28));
        jLabel5.setMinimumSize(new java.awt.Dimension(86, 28));
        jLabel5.setPreferredSize(new java.awt.Dimension(86, 28));

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel6.setText("Authority");
        jLabel6.setToolTipText("");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        jLabel6.setMaximumSize(new java.awt.Dimension(86, 28));
        jLabel6.setMinimumSize(new java.awt.Dimension(86, 28));
        jLabel6.setPreferredSize(new java.awt.Dimension(86, 28));

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel7.setText("Phone");
        jLabel7.setToolTipText("");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel8.setText("Salary");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        jLabel9.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel9.setText("Position");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        jLabel10.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel10.setText("Skill");
        jLabel10.setToolTipText("");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        jLabel10.setMaximumSize(new java.awt.Dimension(86, 28));
        jLabel10.setMinimumSize(new java.awt.Dimension(86, 28));

        jLabel11.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel11.setText("City");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        userText.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        userText.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        userText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        userText.setInheritsPopupMenu(false);
        userText.setPreferredSize(new java.awt.Dimension(7, 21));

        nameText.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        nameText.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nameText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nameText.setInheritsPopupMenu(false);
        nameText.setPreferredSize(new java.awt.Dimension(7, 21));

        positText.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        positText.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        positText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        positText.setInheritsPopupMenu(false);
        positText.setPreferredSize(new java.awt.Dimension(7, 21));

        passwordText.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        passwordText.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        passwordText.setInheritsPopupMenu(false);
        passwordText.setPreferredSize(new java.awt.Dimension(7, 21));

        phoneText.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        phoneText.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        phoneText.setInheritsPopupMenu(false);
        phoneText.setPreferredSize(new java.awt.Dimension(7, 21));

        skillText.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        skillText.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        skillText.setInheritsPopupMenu(false);
        skillText.setPreferredSize(new java.awt.Dimension(7, 21));

        authorityText.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        authorityText.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        authorityText.setInheritsPopupMenu(false);
        authorityText.setPreferredSize(new java.awt.Dimension(7, 21));

        salaryText.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        salaryText.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        salaryText.setInheritsPopupMenu(false);
        salaryText.setPreferredSize(new java.awt.Dimension(7, 21));

        cityText.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        cityText.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cityText.setInheritsPopupMenu(false);
        cityText.setPreferredSize(new java.awt.Dimension(7, 21));

        jToolBar1.setRollover(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(positText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(skillText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorityText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaryText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(authorityText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(salaryText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(skillText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(positText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jMenu1.setText("Info Manage");

        passChangeButtion.setText("Password Change");
        passChangeButtion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passChangeButtionActionPerformed(evt);
            }
        });
        jMenu1.add(passChangeButtion);

        changeInfoButton.setText("Change Information");
        changeInfoButton.setToolTipText("");
        changeInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeInfoButtonActionPerformed(evt);
            }
        });
        jMenu1.add(changeInfoButton);

        jMenuBar1.add(jMenu1);

        infoSearchButton.setText("Info Search");
        infoSearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoSearchButtonMouseClicked(evt);
            }
        });
        jMenuBar1.add(infoSearchButton);

        userManageButton.setText("User Manage");
        userManageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userManageButtonMouseClicked(evt);
            }
        });
        jMenuBar1.add(userManageButton);

        exitButton.setText("Exit");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        jMenuBar1.add(exitButton);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passChangeButtionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passChangeButtionActionPerformed
        new PassChange(user,right);
        this.dispose();
    }//GEN-LAST:event_passChangeButtionActionPerformed

    private void changeInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeInfoButtonActionPerformed
        new InfoChange(user,right);
        this.dispose();
    }//GEN-LAST:event_changeInfoButtonActionPerformed

    private void userManageButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userManageButtonMouseClicked
        if(right==1)new UserManage();
    }//GEN-LAST:event_userManageButtonMouseClicked

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void infoSearchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoSearchButtonMouseClicked
        InfoShow1 infoShow = new InfoShow1(user);
    }//GEN-LAST:event_infoSearchButtonMouseClicked

    private void showInfo(String u){
        String sql=null;
        DbConnect db=null;
        ResultSet ret=null;
        sql="select * from person where username="+'"'+u+'"';
        db=new DbConnect(sql);
        
        try {
            ret=db.pst.executeQuery();
            while(ret.next()) {
                userText.setText(u);
                passwordText.setText(ret.getString("password"));
                int au=Integer.parseInt(ret.getString("authority"));
                if(au==2){
                    authorityText.setText("Administration");
                }
                else if(au==1){
                    authorityText.setText("Normal User");
                }
                nameText.setText(ret.getString("name"));
                phoneText.setText(ret.getString("phone"));
                positText.setText(ret.getString("position"));
                salaryText.setText(ret.getString("salary"));
                skillText.setText(ret.getString("skill"));
                cityText.setText(ret.getString("city"));
            }
            ret.close();
            db.close();
            }catch (SQLException e1) {
                 e1.printStackTrace();
             }
             catch(Exception e2){
                 e2.printStackTrace();
             }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorityText;
    private javax.swing.JMenuItem changeInfoButton;
    private javax.swing.JLabel cityText;
    private javax.swing.JMenu exitButton;
    private javax.swing.JMenu infoSearchButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel nameText;
    private javax.swing.JMenuItem passChangeButtion;
    private javax.swing.JLabel passwordText;
    private javax.swing.JLabel phoneText;
    private javax.swing.JLabel positText;
    private javax.swing.JLabel salaryText;
    private javax.swing.JLabel skillText;
    private javax.swing.JMenu userManageButton;
    private javax.swing.JLabel userText;
    // End of variables declaration//GEN-END:variables
}
