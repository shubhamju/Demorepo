/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.ResultSet;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Agile
 */
public class SalesManPanel extends javax.swing.JPanel {

    /**
     * Creates new form SalesManPanel
     */
    JInternalFrame fr;
    public SalesManPanel(int x,JInternalFrame fr) {
        initComponents();
        this.fr = fr;
        if(x==0)
        {
            sid.setVisible(false);
            lblid.setVisible(false);
            del.setVisible(false);
        }
        else
        {
            ed.setText("Update");
            sve.setEnabled(false);
            try
            {
                ResultSet rs = Admin.getSalesmanId();
                sid.removeAllItems();
                sid.addItem("Select Id");
                while(rs.next())
                    sid.addItem(rs.getString(1));
            }catch(Exception ex) {}
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        mob = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        company = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addr = new javax.swing.JTextArea();
        sve = new javax.swing.JButton();
        clr = new javax.swing.JButton();
        ed = new javax.swing.JButton();
        del = new javax.swing.JButton();
        lblid = new javax.swing.JLabel();
        sid = new javax.swing.JComboBox<>();
        del1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 232, 200));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salesman Registration Form ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Mobile");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("MailId");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel4.setText("D.O.B.");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setText("Company");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setText("Address");

        name.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        mob.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        mail.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        dob.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        company.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        addr.setColumns(20);
        addr.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        addr.setRows(5);
        jScrollPane1.setViewportView(addr);

        sve.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        sve.setText("Save");
        sve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sveActionPerformed(evt);
            }
        });

        clr.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        clr.setText("Cancel");
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });

        ed.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        ed.setText("Edit");
        ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edActionPerformed(evt);
            }
        });

        del.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        lblid.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblid.setText("Id");

        sid.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        sid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sidItemStateChanged(evt);
            }
        });

        del1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        del1.setMnemonic('x');
        del1.setText("Exit");
        del1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblid, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(name))))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(dob))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(mob, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(sve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(del1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(del)))
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblid)
                    .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clr)
                    .addComponent(sve)
                    .addComponent(ed)
                    .addComponent(del)
                    .addComponent(del1))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sveActionPerformed
       String msg = Admin.addSalesman(name.getText(), mob.getText(),mail.getText(),dob.getText(),company.getText(),addr.getText());
        JOptionPane.showMessageDialog(this, msg);
        clear();
    }//GEN-LAST:event_sveActionPerformed

    private void sidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sidItemStateChanged
      try
      {
          ResultSet rs = Admin.getSalesman(sid.getSelectedItem().toString());
          if(rs.next())
          {
              name.setText(rs.getString(2));
              mob.setText(rs.getString(3));
              dob.setText(rs.getString(4));
              mail.setText(rs.getString(5));
              company.setText(rs.getString(6));
              addr.setText(rs.getString(7));
              
          }
      }catch(Exception ex) {}
    }//GEN-LAST:event_sidItemStateChanged

    private void edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edActionPerformed
       if(ed.getText().equals("Edit"))
       {
            sid.setVisible(true);
            lblid.setVisible(true);
            del.setVisible(true);
            sve.setEnabled(false);
            ed.setText("Update");
            try
            {
                ResultSet rs = Admin.getSalesmanId();
                sid.removeAllItems();
                sid.addItem("Select Id");
                while(rs.next())
                    sid.addItem(rs.getString(1));
            }catch(Exception ex) {}
       }
       else
       {
         String msg = Admin.updSalesman(sid.getSelectedItem().toString(),name.getText(), mob.getText(),mail.getText(),dob.getText(),company.getText(),addr.getText());
         JOptionPane.showMessageDialog(this, msg);
         clear();
          sid.setVisible(false);
          lblid.setVisible(false);
          del.setVisible(false);
          sve.setEnabled(true);
          ed.setText("Edit");
                  
       }
    }//GEN-LAST:event_edActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
         String msg = Admin.delSalesman(sid.getSelectedItem().toString());
         JOptionPane.showMessageDialog(this, msg);
         clear();
          sid.setVisible(false);
          lblid.setVisible(false);
          del.setVisible(false);
          sve.setEnabled(true);
          ed.setText("Edit");

    }//GEN-LAST:event_delActionPerformed

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
       clear();
    }//GEN-LAST:event_clrActionPerformed

    private void del1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del1ActionPerformed
        fr.dispose();
    }//GEN-LAST:event_del1ActionPerformed
    void clear()
    {
        name.setText("");
        mail.setText("");
        dob.setText("");
        addr.setText("");
        mob.setText("");
        company.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addr;
    private javax.swing.JButton clr;
    private javax.swing.JTextField company;
    private javax.swing.JButton del;
    private javax.swing.JButton del1;
    private javax.swing.JTextField dob;
    private javax.swing.JButton ed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblid;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField mob;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> sid;
    private javax.swing.JButton sve;
    // End of variables declaration//GEN-END:variables
}
