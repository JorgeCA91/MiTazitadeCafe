package cocinapaty;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Estacion extends javax.swing.JFrame {
    Cocina coc;
    MenuGral menu;
    public bebidcalien bebc;
    String mesero,mesa;
    BufferedWriter bw;
    Comanda com;
    public Estacion(Cocina coc) 
    {
        initComponents();
        menu = new MenuGral(this);
        com = new Comanda();
        com.generaCompImp();
        this.coc = coc;
        try
            
  {
  	         
  BufferedWriter bwT = new BufferedWriter(new FileWriter(com.ruta1));
  bw = bwT;
  }
 catch(Exception ioex) 
 {System.out.println("I/O Error");
  System.exit(0);
 }
        jButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                com.escribe(mesa, bw);
                
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estación");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        jLabel2.setText("Mesa");
        jLabel2.setBounds(50, 150, 50, 14);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mesa 1", "mesa 2", "mesa 3", "mesa 4", "mesa 5", "mesa 6", "mesa 7", "mesa 8" }));
        jComboBox2.setBounds(110, 150, 70, 22);
        jLayeredPane1.add(jComboBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        jButton1.setText("Menú");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(260, 70, 120, 120);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setText("Generar comanda");
        jButton2.setBounds(237, 530, 150, 23);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setText("ingresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(110, 180, 100, 23);
        jLayeredPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Luis Fonseca", "Maria Santos", "Alberto Luciano", "Edgar Quintero" }));
        jComboBox1.setBounds(110, 120, 120, 22);
        jLayeredPane1.add(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText("Mesero");
        jLabel1.setBounds(50, 120, 50, 14);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setText("Comanda:");
        jLabel5.setBounds(40, 200, 80, 14);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setText("Comentarios:");
        jLabel6.setBounds(40, 400, 110, 14);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jScrollPane2.setBounds(40, 420, 340, 100);
        jLayeredPane1.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane1.setBounds(40, 220, 340, 180);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton5.setText("Limpiar comanda");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.setBounds(90, 530, 140, 23);
        jLayeredPane1.add(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logochico.png"))); // NOI18N
        jLabel7.setBounds(50, 30, 150, 70);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.png"))); // NOI18N
        jLabel4.setBounds(0, -10, 410, 580);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setText("jButton3");
        jButton3.setBounds(110, 180, 75, 23);
        jLayeredPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       mesero=(String) jComboBox1.getSelectedItem();
       mesa=(String) jComboBox2.getSelectedItem();
       
       jTextArea1.append("Mesero: "+mesero+"\n"+"mesa: "+mesa+"\n");
            
            
            
    }//GEN-LAST:event_jButton4ActionPerformed
    
    
    
    public void addProductoEst(String cafame)
    {
        jTextArea1.append(cafame);
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextArea1.setText(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
