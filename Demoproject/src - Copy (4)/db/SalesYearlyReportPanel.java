/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agile
 */
public class SalesYearlyReportPanel extends javax.swing.JPanel {

    /**
     * Creates new form SalesYearlyReport
     */
    DefaultTableModel m = new DefaultTableModel();
    public SalesYearlyReportPanel() {
        initComponents();
        report();
    }
    void report()
    {
        if (m.getRowCount() > 0) {
          for (int i = m.getRowCount() - 1; i >=0; i--) 
            m.removeRow(i);
        }       
        m.setColumnCount(0);
        try
        {
            String str = year.getText();
            if(str.startsWith("MM")) str = "";
            ResultSet rs = Admin.getSalesReport(str);
            ResultSetMetaData mt = rs.getMetaData();
            for(int i=1;i<=mt.getColumnCount();i++)
                m.addColumn(mt.getColumnName(i));
            String ar[];
            while(rs.next())
            {
               ar = new String[mt.getColumnCount()];
               for(int i=0;i<mt.getColumnCount();i++)
                   ar[i] = rs.getString(i+1);
               m.addRow(ar);
            }
        }catch(Exception ex){}    
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        year = new javax.swing.JTextField();
        view = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();

        year.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        year.setText("MM-YYYY");
        year.setToolTipText("MM-YYYY");
        year.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                yearFocusGained(evt);
            }
        });

        view.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        view.setText("View Report");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(226, 210, 137));

        tab.setBackground(new java.awt.Color(229, 214, 157));
        tab.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tab.setModel(m);
        jScrollPane1.setViewportView(tab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(416, Short.MAX_VALUE)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(view))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void yearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearFocusGained
        year.setText("");
    }//GEN-LAST:event_yearFocusGained

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        report();
    }//GEN-LAST:event_viewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tab;
    private javax.swing.JButton view;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
