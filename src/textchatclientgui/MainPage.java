
package textchatclientgui;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Simba
 */
public class MainPage extends javax.swing.JFrame {

    /* Global variables */
    Socket echoSocket=null;     // socket will be cnstructed from hostName and portNumber
    String userName="";         // username - entered from promt when program starts
    int portNumber = 6999;      
    String hostName="localhost";
    BufferedReader bReader=null;
    PrintWriter pWriter=null;
    Thread serverListener;
    
    public MainPage() 
    {
        initComponents();
        this.setVisible(true);      // changed order of commands, main window loads first, then the user is prompted for username *looks better*
        readSettings();
        connectToServer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfUsers = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Or press Enter to send");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Settings");

        jLabel4.setText("Hostname:");

        jLabel5.setText("Port");

        tf2.setText("localhost");

        tf3.setText("6999");
        tf3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf3KeyTyped(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("Hostname can be localhost or ip adress of a remote server. Server will listen on a port 6999 but it can be changed if you want to try your own server code od some other port. File-Save will save all text from chat to file history.chat. With File-Save As you cah choose name of the save file.");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Connect");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Username:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(tf1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tfUsers.setEditable(false);
        tfUsers.setColumns(20);
        tfUsers.setRows(5);
        jScrollPane3.setViewportView(tfUsers);

        jLabel6.setText("Online users");

        jLabel7.setText("ChatRoom:");

        jMenu1.setText("File");

        jMenuItem1.setText("Save");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Save As");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Quit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jLabel1)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        saveHistory();
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Save as option - not implemented yet
        JFileChooser saveFile = new JFileChooser();
        int returnVal = saveFile.showSaveDialog(this);
        if(returnVal==JFileChooser.APPROVE_OPTION)
        {
            File f = saveFile.getSelectedFile();
            try 
            {
                try (PrintWriter pw = new PrintWriter(new FileWriter(f),true)) 
                {
                    pw.append(jTextArea1.getText());
                }
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        saveHistory();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sendText();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // when user presses Enter method sendText() is called
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            sendText();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // saves hostname and port data to file
        updateGUItextToVariables();
        try 
        {
            File f=new File("settings.set");
            if(f.exists())
                f.delete();
            FileWriter fwrite=new FileWriter(f);
            fwrite.append(userName+"\n");
            fwrite.append(hostName+"\n");
            fwrite.append(portNumber+"");
            fwrite.close();
        } 
        catch (IOException ex) 
        {
            showText("Error while saving PORT number value.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //reconnect sequence
        /*try 
        {
                socketCleanUp();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        updateGUItextToVariables();
        connectToServer();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tf3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf3KeyPressed
        
    }//GEN-LAST:event_tf3KeyPressed

    private void tf3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf3KeyTyped

        
    }//GEN-LAST:event_tf3KeyTyped

    private void tf3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf3KeyReleased
        // TODO add your handling code here:
        if((evt.getKeyCode()>=KeyEvent.VK_A && evt.getKeyCode()<=KeyEvent.VK_Z) || (evt.getKeyCode()>=KeyEvent.VK_SPACE && evt.getKeyCode()<=KeyEvent.VK_SLASH))
        {
            tf3.setText(tf3.getText().substring(0, tf3.getText().length()-1));
        }
    }//GEN-LAST:event_tf3KeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextArea tfUsers;
    // End of variables declaration//GEN-END:variables

    private void sendText() 
    {   // pWriter writes data to socket connection
        pWriter.println(userName+": "+jTextField1.getText());
        jTextField1.setText("");
    }

    private void connectToServer() 
    {
        // connects to server and sets reader and writer for text exchange
        showText("1");
        try { 
            echoSocket=new Socket(hostName,portNumber);
            showText("2");
            bReader=new BufferedReader(new InputStreamReader(this.echoSocket.getInputStream()));
            showText("3");
            pWriter = new PrintWriter(this.echoSocket.getOutputStream(),true);      // autoflush set to true
            showText("4");
            pWriter.println(userName);
            showText("5");
            readOnlineUsers();
            showText("6");
            jTextArea1.append("Connection to: "+hostName+" on port: "+portNumber+" succesfull.\n");
            serverListener = new Thread(new portListener());
            serverListener.start();
            connectionEstablished();
        }
        catch (IOException ex)
        {
            showText("ex1");
            connectionFailed();
            showText("ex2");
            showText("Connection to server not possible. \n");
        }
        catch (Exception e)
        {
            showText("Something is not working in connection. "+e.toString());
        }
    }

    private void getUserName() 
    {
        // promts user for username on program start
        while(true)
        {
            userName = JOptionPane.showInputDialog(this,"Enter username, at least 5 characters");
            if(userName.length()<5)
                showText("Username must be at least 5 characters long!");
            else
            {
                updateVariablesToGUI();
                break;
            }
                
        }
    }

    private void readSettings() 
    {
        // reads username, hostname and port from settings file
        // if file does not exist it will promt user for username, and set hostname=localhost and port=6999 (these are default settings)
        File f=new File("settings.set");

            try (BufferedReader bRead = new BufferedReader(new FileReader(f));)
            {
                userName=bRead.readLine();
                hostName=bRead.readLine();
                portNumber=Integer.parseInt(bRead.readLine());
                updateVariablesToGUI();
            } 
            catch (FileNotFoundException ex) 
            {   // not a big problem, but we still need a username so method getUserName is called
                getUserName();
            } 
            catch (IOException ex) 
            {   // not a big problem, but we still need a username so method getUserName is called
                getUserName();
            }    
    }
    
    private void saveHistory() 
    {
        try 
        {
            try (PrintWriter pw = new PrintWriter(new FileWriter("history.his",true))) {
                pw.append(jTextArea1.getText());
            }
        } 
        catch (IOException ex) 
        {
            showText("Error while saving. "+ex.toString());
        }
    }

    private void readOnlineUsers() 
    {
        try 
        {
            tfUsers.setText("");
            //JOptionPane.showMessageDialog(this, "readOnlineUsers startovao.");
            int usernum = Integer.parseInt(bReader.readLine());
            //JOptionPane.showMessageDialog(null, "usernum"+usernum);
            for(int i=1;i<=usernum;i++)
            {
                String usname = bReader.readLine();
                tfUsers.append(usname+"\n");
                //JOptionPane.showMessageDialog(this, usname);
            }
        } 
        catch (IOException ex) 
        {
            showText("Something bad happened while exchanging user data with server.");
        }
    }

    private void updateGUItextToVariables() 
    {
        userName = tf1.getText();
        hostName = tf2.getText();
        portNumber = Integer.parseInt(tf3.getText());
    }

    private void showText(String string)        // shorter version of ...showMessageDialog...
    {
        JOptionPane.showMessageDialog(this, string);
        
    }

    private void updateVariablesToGUI() 
    {
        tf1.setText(userName);
        tf2.setText(hostName);
        tf3.setText(portNumber+"");
    }

    private void connectionEstablished() 
    {
        jTextArea1.append("Connection established to "+hostName + "\n");
        jTextArea1.setBackground(Color.GREEN);
        jTextArea1.setForeground(Color.BLACK);
    }

    private void connectionFailed() 
    {
        jTextArea1.append("Connection not possible to "+hostName  + "\n");
        jTextArea1.setBackground(Color.RED);
        jTextArea1.setForeground(Color.white);
        /*try 
        {
            socketCleanUp();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

    private void socketCleanUp() throws IOException
    {
        echoSocket.close();
        echoSocket.shutdownInput();
        echoSocket.shutdownOutput();
    }

    private class portListener implements Runnable {    // listens to data that comes over socket connection

        public portListener() 
        {
        }

        @Override
        public void run() 
        {
            String text;
            try 
            {
                while((text=bReader.readLine())!=null)
                {
                    jTextArea1.append(text+"\n");
                }
            } 
            catch (IOException ex) 
            {
                connectionLost();
            }
        }

        private void connectionLost() 
        {
            jTextArea1.append("Connection lost to "+hostName+"\n");
            jTextArea1.setBackground(Color.RED);
            jTextArea1.setForeground(Color.white);
        }
    }
}
