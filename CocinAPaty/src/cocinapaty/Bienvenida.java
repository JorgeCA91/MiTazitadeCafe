package cocinapaty;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bienvenida extends javax.swing.JFrame 
{
    Cocina coci = new Cocina();
    Estacion esta = new Estacion(coci);
    public Bienvenida() 
    {
        Toolkit dimensiones = Toolkit.getDefaultToolkit();
        Dimension d = dimensiones.getScreenSize();
        this.setLocation( (d.width/8),(d.height/6));
        initComponents();   
        
        manejadores();
    }

    public void manejadores()
    {
        cocinero.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent evento)
                {
                    coci.setVisible(true);
                }
    });
        jButton2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent evento)
                {
                    esta.setVisible(true);
                }
    });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        cocinero = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi tacita de café");

        cocinero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chef.png"))); // NOI18N
        cocinero.setBounds(20, 310, 160, 110);
        jLayeredPane2.add(cocinero, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/meserucho1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(190, 310, 150, 110);
        jLayeredPane2.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.png"))); // NOI18N
        jLabel2.setBounds(0, 0, 698, 450);
        jLayeredPane2.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cocinero;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane2;
    // End of variables declaration//GEN-END:variables
}
