package Interface;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author Faculdade
 */
public class GUI_Servidor extends javax.swing.JFrame {

    ServerSocket serverSocket;
    HashMap clientColl = new HashMap();

    /**
     * Creates new form GUI_Servidor
     */
    public GUI_Servidor() {
        try {
            initComponents();
            serverSocket = new ServerSocket(4000);
            this.lblStatus.setText("Online");
            this.lblStatus.setForeground(Color.GREEN);

            new ClientAccept().start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class ClientAccept extends Thread {

        public void run() {
            while (true) {
                try {
                    Socket s = serverSocket.accept();
                    String i = new DataInputStream(s.getInputStream()).readUTF();
                    if (clientColl.containsKey(i)) {
                        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
                        dout.writeUTF("Você já está logado!");
                    } else {
                        clientColl.put(i, s);
                        msgBox.append(i + " conectou!\n");
                        updateMsgBox();
                        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
                        dout.writeUTF("");
                        new LerMensagens(s, i).start();
                        new ListaClientes().start();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    class LerMensagens extends Thread{

        Socket s;
        String ID;

        LerMensagens(Socket s, String ID) {
            this.s = s;
            this.ID = ID;
        }

        public void run() {
            while(!clientColl.isEmpty()){
                try{
                    String i = new DataInputStream(s.getInputStream()).readUTF();
                    if(i.equals("mkoihgteazdcvgyhujb096785542AXTY")){
                        clientColl.remove(ID);
                        msgBox.append(ID + " foi removido! \n");
                        updateMsgBox();
                        new ListaClientes().start();
                        
                        Set k = clientColl.keySet();
                        Iterator itr = k.iterator();
                        while(itr.hasNext()){
                            String key = (String) itr.next();
                            if(!key.equalsIgnoreCase(ID)){
                                try{
                                    new DataOutputStream(((Socket)clientColl.get(key)).getOutputStream()).writeUTF(ID + " saiu do Chat!");                                    
                                }catch(Exception e){
                                    clientColl.remove(key);
                                    msgBox.append(key + " foi removido! \n");
                                    updateMsgBox();
                                    new ListaClientes().start();
                                }finally{
                                    this.s.close();
                                }
                            }
                        }
                    }else if(i.contains("@#$ddd@#$")){
                        Set k = clientColl.keySet();
                        Iterator itr = k.iterator();
                        while(itr.hasNext()){
                            String key = (String) itr.next();
                            if(!key.equalsIgnoreCase(ID)){
                                try {
                                    new DataOutputStream(((Socket) clientColl.get(key)).getOutputStream()).writeUTF("@#$ddd@#$" + ID + " está digitando!");
                                    /*try {
                                        Thread.sleep(sleep);
                                    } catch (InterruptedException e) {
          
                                    } finally {
                                        new DataOutputStream(((Socket) clientColl.get(key)).getOutputStream()).writeUTF("@#$ddd@#$" + "...");
                                    }*/
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }else if(i.contains("#4344554@@@@@67667@@")){
                        i = i.substring(20);
                        StringTokenizer st = new StringTokenizer(i, ":");
                        String id = st.nextToken();
                        i = st.nextToken();
                        try{
                            new DataOutputStream(((Socket)clientColl.get(id)).getOutputStream()).writeUTF("(PRIVADO de " + ID + " ): " + i);
                        }catch(Exception e){
                            clientColl.remove(id);
                            msgBox.append(id + " foi removido! \n");
                            updateMsgBox();
                            new ListaClientes().start();
                        }
                    }else{
                        Set k = clientColl.keySet();
                        Iterator itr = k.iterator();
                        while(itr.hasNext()){
                            String key = (String) itr.next();
                            if(!key.equalsIgnoreCase(ID)){
                                try{
                                    new DataOutputStream(((Socket)clientColl.get(key)).getOutputStream()).writeUTF(ID + ": "  + i);
                                }catch(Exception e){
                                    clientColl.remove(key);
                                    msgBox.append(key + " foi removido! \n");
                                    updateMsgBox();
                                    new ListaClientes().start();
                                }
                            }
                        }
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    class ListaClientes extends Thread {

        public void run() {
            try{
                String ids = "";
                Set k = clientColl.keySet();
                Iterator itr = k.iterator();
                while(itr.hasNext()){
                    String key = (String) itr.next();
                    ids += key + ",";
                }
                if(ids.length() != 0)
                    ids = ids.substring(0, ids.length()-1);
                
                itr = k.iterator();
                while(itr.hasNext()){
                    String key = (String) itr.next();
                    try{
                        new DataOutputStream(((Socket)clientColl.get(key)).getOutputStream()).writeUTF(":;.,/=" + ids);
                    }catch(Exception e){
                        clientColl.remove(key);
                        msgBox.append(key + " foi removido! \n");
                        updateMsgBox();
                    }
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    private void updateMsgBox() {
        msgBox.setCaretPosition(msgBox.getDocument().getLength());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        msgBox = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Servidor");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        msgBox.setColumns(20);
        msgBox.setRows(5);
        msgBox.setEnabled(false);
        jScrollPane1.setViewportView(msgBox);

        jLabel1.setText("Status do Servidor:");

        lblStatus.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStatus))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUI_Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Servidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextArea msgBox;
    // End of variables declaration//GEN-END:variables
}
