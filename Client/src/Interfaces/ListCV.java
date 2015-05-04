package Interfaces;

import Model.CuVi;
import Model.CuVis;
import MyClient_.MyClient;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBException;



public class ListCV extends javax.swing.JFrame {

  public static CuVis listeDesCv;
  public static int idd ;

    public ListCV() throws IOException, JAXBException {
        setTitle("Liste des CV");
        setLocationByPlatform(true);
        initComponents();
        setLookAndFeel();
       
    listeDesCv = MyClient.RecupAndParseXmlFromServer();
        
        for( CuVi el : listeDesCv.getCuVis()){
       System.out.println( el.getInformationPerso().getAdresse());
        Object[] row ={el.getId(),el.getInformationPerso().getPrenom(),el.getInformationPerso().getNom()};
        DefaultTableModel tb =(DefaultTableModel) monthlyReportTable.getModel();
        tb.addRow(row);
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        monthlyReportTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        monthlyReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nom", "Prenom"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        monthlyReportTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monthlyReportTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(monthlyReportTable);
        if (monthlyReportTable.getColumnModel().getColumnCount() > 0) {
            monthlyReportTable.getColumnModel().getColumn(0).setMinWidth(130);
            monthlyReportTable.getColumnModel().getColumn(0).setPreferredWidth(130);
            monthlyReportTable.getColumnModel().getColumn(1).setMinWidth(100);
            monthlyReportTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        jButton1.setText("formations");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Annuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jButton2)
                .addGap(203, 203, 203)
                .addComponent(jButton1)
                .addContainerGap(265, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(49, 49, 49))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 111, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
DetailCv detailCv = new DetailCv();
         detailCv.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void monthlyReportTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthlyReportTableMouseClicked
idd= (Integer) monthlyReportTable.getValueAt(monthlyReportTable.getSelectedRow(), 0);        // TODO add your handling code here:
    }//GEN-LAST:event_monthlyReportTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void setLookAndFeel() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            
        }
    }
      private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
          dispose();
  System.out.print("test");
       Welcome.w.setVisible(true);
    }   
       private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
       dispose();
          
       Welcome.w.setVisible(true);
    }     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTable monthlyReportTable;
    // End of variables declaration//GEN-END:variables
}
