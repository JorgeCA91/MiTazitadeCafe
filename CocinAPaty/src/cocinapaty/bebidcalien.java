/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cocinapaty;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hebert
 */
public class bebidcalien extends javax.swing.JFrame {
    
    
    Estacion est;
    String cafame;
    Productos prod;
    
    public bebidcalien(Estacion est) 
    {
        initComponents();
        this.est = est;
        prod = new Productos();
        prod.generaProd();
        System.out.println(prod.getValorComp(0, 0));
        
        for (int i =0 ; i<8;i++)
            for (int j=0;j<2;j++)
            System.out.println(prod.getValorComp(i,j));
    
    ManejadorBebidasC botonesCafeCal =new ManejadorBebidasC();
    jButton1.addActionListener(botonesCafeCal);
    jButton2.addActionListener(botonesCafeCal);
    jButton3.addActionListener(botonesCafeCal);
    jButton4.addActionListener(botonesCafeCal);
    jButton5.addActionListener(botonesCafeCal);
    jButton6.addActionListener(botonesCafeCal);
    jButton7.addActionListener(botonesCafeCal);
    jButton8.addActionListener(botonesCafeCal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        jSpinner10 = new javax.swing.JSpinner();
        jSpinner11 = new javax.swing.JSpinner();
        jSpinner12 = new javax.swing.JSpinner();
        jSpinner13 = new javax.swing.JSpinner();
        jSpinner14 = new javax.swing.JSpinner();
        jSpinner15 = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bebidas calientes");
        setBounds(new java.awt.Rectangle(0, 0, 335, 400));
        setResizable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(357, 1365));
        jPanel1.setRequestFocusEnabled(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logochico.png"))); // NOI18N
        jLabel2.setBounds(10, 10, 150, 70);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bebidas calientes/cafeamericano.png"))); // NOI18N
        jButton1.setText("Café americano");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(20, 110, 110, 140);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText("Precio ");
        jLabel1.setBounds(140, 130, 40, 14);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jSpinner1.setBounds(200, 450, 40, 20);
        jLayeredPane1.add(jSpinner1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setText("Cantidad");
        jLabel3.setBounds(140, 150, 50, 14);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bebidas calientes/cafelatte.png"))); // NOI18N
        jButton2.setText("Café latte");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.setBounds(20, 260, 110, 140);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setText("Precio   ");
        jLabel4.setBounds(140, 280, 40, 14);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setText("Cantidad");
        jLabel5.setBounds(140, 300, 50, 14);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bebidas calientes/capuchino.png"))); // NOI18N
        jButton3.setText("Capuchino");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.setBounds(20, 410, 110, 140);
        jLayeredPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setText("Precio  ");
        jLabel6.setBounds(150, 430, 40, 14);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setText("Cantidad");
        jLabel7.setBounds(150, 450, 50, 14);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bebidas calientes/chocoexpresso.png"))); // NOI18N
        jButton4.setText("choco expresso");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(20, 560, 110, 140);
        jLayeredPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setText("Precio   ");
        jLabel8.setBounds(150, 1220, 40, 14);
        jLayeredPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setText("Cantidad");
        jLabel9.setBounds(150, 600, 50, 14);
        jLayeredPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bebidas calientes/tedecanela.png"))); // NOI18N
        jButton5.setText("Té de canela");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.setBounds(20, 720, 110, 140);
        jLayeredPane1.add(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bebidas calientes/tedehiervabuena.png"))); // NOI18N
        jButton6.setText("Té de hierbabuena");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.setBounds(20, 880, 110, 140);
        jLayeredPane1.add(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bebidas calientes/tedemanzanilla.png"))); // NOI18N
        jButton7.setText("Té manzanilla");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.setBounds(20, 1040, 110, 140);
        jLayeredPane1.add(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bebidas calientes/tedementa.png"))); // NOI18N
        jButton8.setText("Té de menta");
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.setBounds(20, 1200, 110, 140);
        jLayeredPane1.add(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setText("Precio  ");
        jLabel10.setBounds(150, 580, 40, 14);
        jLayeredPane1.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setText("Precio");
        jLabel11.setBounds(150, 740, 40, 14);
        jLayeredPane1.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setText("Precio  ");
        jLabel12.setBounds(150, 900, 40, 14);
        jLayeredPane1.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setText("Precio  ");
        jLabel13.setBounds(150, 1060, 40, 14);
        jLayeredPane1.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setText("Cantidad");
        jLabel14.setBounds(150, 760, 50, 14);
        jLayeredPane1.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setText("Cantidad");
        jLabel15.setBounds(150, 920, 50, 14);
        jLayeredPane1.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel16.setText("Cantidad");
        jLabel16.setBounds(150, 1080, 50, 14);
        jLayeredPane1.add(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setText("Cantidad");
        jLabel17.setBounds(150, 1240, 50, 14);
        jLayeredPane1.add(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel19.setText("$ 15.00");
        jLabel19.setBounds(190, 130, 60, 14);
        jLayeredPane1.add(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel20.setText("$ 15.00");
        jLabel20.setBounds(200, 900, 60, 14);
        jLayeredPane1.add(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel21.setText("$ 15.00");
        jLabel21.setBounds(200, 740, 60, 14);
        jLayeredPane1.add(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel22.setText("$ 15.00");
        jLabel22.setBounds(200, 1220, 60, 14);
        jLayeredPane1.add(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel23.setText("$ 15.00");
        jLabel23.setBounds(200, 1060, 60, 14);
        jLayeredPane1.add(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel24.setText("$  20.00");
        jLabel24.setBounds(180, 280, 70, 14);
        jLayeredPane1.add(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel25.setText("$ 25.00");
        jLabel25.setBounds(200, 430, 60, 14);
        jLayeredPane1.add(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel26.setText("$ 30.00");
        jLabel26.setBounds(200, 580, 60, 14);
        jLayeredPane1.add(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jSpinner9.setBounds(190, 150, 40, 20);
        jLayeredPane1.add(jSpinner9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jSpinner10.setBounds(190, 300, 40, 20);
        jLayeredPane1.add(jSpinner10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jSpinner11.setBounds(200, 1240, 40, 20);
        jLayeredPane1.add(jSpinner11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jSpinner12.setBounds(200, 600, 40, 20);
        jLayeredPane1.add(jSpinner12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jSpinner13.setBounds(200, 760, 40, 20);
        jLayeredPane1.add(jSpinner13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSpinner14.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jSpinner14.setBounds(200, 920, 40, 20);
        jLayeredPane1.add(jSpinner14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSpinner15.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jSpinner15.setBounds(200, 1080, 40, 20);
        jLayeredPane1.add(jSpinner15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondolargo.png"))); // NOI18N
        jLabel18.setBounds(0, 0, 357, 1365);
        jLayeredPane1.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1365, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void addProducto(Estacion est,String linea)
    {
        est.addProductoEst(linea);
    }
    
    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner9;
    // End of variables declaration//GEN-END:variables

    private class ManejadorBebidasC implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent botonProducto)
        {
            if(botonProducto.getSource()==jButton1)
            {
                cafame = jSpinner9.getValue().toString();
                String linea1 = cafame +" Cafe americano";
                addProducto(est,linea1);
            }
            if(botonProducto.getSource()==jButton2)
            {
                cafame = jSpinner10.getValue().toString();
                String linea1 = cafame + " "+ prod.getValorComp(1, 0);
                addProducto(est,linea1);
            }
            if(botonProducto.getSource()==jButton3)
            {
                cafame = jSpinner1.getValue().toString();
                String linea1 = cafame + " "+ prod.getValorComp(2, 0);
                addProducto(est,linea1);
            }
            if(botonProducto.getSource()==jButton4)
            {
                cafame = jSpinner12.getValue().toString();
                String linea1 = cafame + " "+ prod.getValorComp(5, 0);
                addProducto(est,linea1);
            }
            if(botonProducto.getSource()==jButton5)
            {
                cafame = jSpinner13.getValue().toString();
                String linea1 = cafame + " "+ prod.getValorComp(4, 0);
                addProducto(est,linea1);
            }
            if(botonProducto.getSource()==jButton6)
            {
                cafame = jSpinner14.getValue().toString();
                String linea1 = cafame + " "+ prod.getValorComp(5, 0);
                addProducto(est,linea1);
            }
            if(botonProducto.getSource()==jButton7)
            {
                cafame = jSpinner15.getValue().toString();
                String linea1 = cafame + " "+ prod.getValorComp(6, 0);
                addProducto(est,linea1);
            }
            if(botonProducto.getSource()==jButton8)
            {
                cafame = jSpinner11.getValue().toString();
                String linea1 = cafame +" "+ prod.getValorComp(7, 0);
                addProducto(est,linea1);
            }
            
        }
    }
}

