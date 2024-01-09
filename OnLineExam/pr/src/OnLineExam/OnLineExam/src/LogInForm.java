package OnLineExam.OnLineExam.src;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.*;


public class LogInForm extends javax.swing.JFrame {

    Connection con;
    Statement st;
    ResultSet rs,rs1;
    PreparedStatement cs,cs1;
    public static String uname,un;
    String pwd,p;
    String cpwd,cpwd1;
    String cuname,cuname1;
    Integer i;


    public LogInForm() throws ClassNotFoundException, SQLException, IOException {
        initComponents();
        Connection();
        
     // jLabel4.setVisible(false);
       i=0;
    }
    
    
    
 public void Connection()
   {
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost/onlineexam","root","");
         
             
             
            
             
        } catch (ClassNotFoundException ex) {
           
        } catch (SQLException ex) {
           
        }
            
       
       
   }
    
    
    
    
    
    
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Log = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Log_In = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setBackground(new java.awt.Color(102, 102, 255));
        setForeground(new java.awt.Color(153, 153, 255));
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        Log.setBackground(new java.awt.Color(0, 0, 153));
        Log.setForeground(new java.awt.Color(153, 0, 255));
        Log.setName("Log In"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Name");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        Log_In.setText("Log In");
        Log_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log_InActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Forgot Password??");
        jLabel4.setToolTipText("For Administrator Only");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sign Up");
        jLabel5.setToolTipText("For Administrator Only");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("User Type");

        jRadioButton1.setBackground(new java.awt.Color(153, 153, 255));
        jRadioButton1.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("As Student");

        jRadioButton2.setBackground(new java.awt.Color(153, 153, 255));
        jRadioButton2.setFont(new java.awt.Font("Calibri", 2, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("As Administrator");

        javax.swing.GroupLayout LogLayout = new javax.swing.GroupLayout(Log);
        Log.setLayout(LogLayout);
        LogLayout.setHorizontalGroup(
            LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(LogLayout.createSequentialGroup()
                        .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(44, 44, 44)
                        .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jPasswordField1)
                            .addGroup(LogLayout.createSequentialGroup()
                                .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(LogLayout.createSequentialGroup()
                                        .addComponent(Log_In)
                                        .addGap(94, 94, 94)
                                        .addComponent(cancel))
                                    .addGroup(LogLayout.createSequentialGroup()
                                        .addComponent(jRadioButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton1)))
                                .addGap(0, 5, Short.MAX_VALUE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        LogLayout.setVerticalGroup(
            LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(14, 14, 14)
                .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Log_In)
                    .addComponent(cancel))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Log, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Log, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("login");
        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
    }//GEN-LAST:event_formComponentResized

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
}//GEN-LAST:event_cancelActionPerformed

    private void Log_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log_InActionPerformed
        if(i<=2)
        {
            cpwd = "Null";
            cuname = "Null";
            uname = jTextField1.getText();
            pwd = jPasswordField1.getText();
            if((jRadioButton1.isSelected()) || (jRadioButton2.isSelected()))
            {
                if(jRadioButton2.isSelected())
                {
                    try {
                        cs = con.prepareStatement("Select * from user_detail where user_name=?");
                        cs.setString(1, uname);
                        rs = cs.executeQuery();
                        while (rs.next()) {
                            cuname = rs.getString(1);
                            cpwd = rs.getString(2);
                            if (cpwd.equals(pwd) && cuname.equals(uname)) {
                                JOptionPane.showMessageDialog(this, "Welcome" + "  " + cuname);
                                new AdministratorMain().setVisible(true);
                                this.setVisible(false);
                                break;
                            }

                        }
                        if((!cpwd.equals(pwd)) && (!cuname.equals(uname)))
                            {
                            JOptionPane.showMessageDialog(this,"Invalid Username & Password!","Error",1);
                            }
                        else if(!cpwd.equals(pwd))
                            {
                            JOptionPane.showMessageDialog(this,"Invalid Password!","Error",1);
                            }
                        else if(!cuname.equals(uname))
                            {
                            JOptionPane.showMessageDialog(this,"Invalid Username!","Error",1);
                            }
                        else{}
                        i++;
                        if (uname.equals(cuname)) {
                            jLabel4.setVisible(true);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(LogInForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(jRadioButton1.isSelected())
                {
                    try {
                        cs1 = con.prepareStatement("Select * from result where st_name=?");
                        cs1.setString(1, uname);
                        rs1 = cs1.executeQuery();
                        if(rs1.next())
                        {
                            JOptionPane.showMessageDialog(this,"You have already attempted the Test. Press OK to check your Result", "Information",1);
                            new LoginResult().setVisible(true);
                            this.setVisible(false);
                        }
                        else
                        {
                            cs = con.prepareStatement("Select * from student_detail where st_name=?");
                            cs.setString(1, uname);
                            rs = cs.executeQuery();
                            if(rs.next()) {
                            	//System.out.println("ss");
                                cuname = rs.getString(2);
                                cpwd = rs.getString(6);
                               // System.out.println(cuname+" "+cpwd);
                                if (uname.equals(cuname) && pwd.equals(cpwd))
                                {
                                    JOptionPane.showMessageDialog(this, "Welcome" + "  " + cuname);
                                    new InstrustionForm(cuname).setVisible(true);
                                    this.setVisible(false);
                                }
                                
                            }
                            if((!cpwd.equals(pwd)) && (!cuname.equals(uname)))
                                {
                                JOptionPane.showMessageDialog(this,"Invalid Username & Password!","Error",1);
                                }
                            else if(!cpwd.equals(pwd))
                                {
                                JOptionPane.showMessageDialog(this,"Invalid Password!","Error",1);
                                }
                            else if(!cuname.equals(uname))
                                {
                                JOptionPane.showMessageDialog(this,"Invalid Username!","Error",1);
                                }
                            else{}
                        i++;
                        }
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(LogInForm.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(LogInForm.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Please select User type","Information",2);
            }
        }
            else
            {
            JOptionPane.showMessageDialog(this,"You have entered Invalid Username & Password Many Times");
            this.dispose();
            }
    }//GEN-LAST:event_Log_InActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        try {
            new ForgotPassword().setVisible(true);
           // this.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogInForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LogInForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       new SignupForm().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new LogInForm().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    System.out.println("hi");
                    Logger.getLogger(LogInForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    System.out.println("hi1");
                    Logger.getLogger(LogInForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    System.out.println("hi2");
                    Logger.getLogger(LogInForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Log;
    private javax.swing.JButton Log_In;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
