/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import javax.swing.JPanel;

/**
 *
 * @author trant
 */
public class addProperties extends javax.swing.JPanel {
    /**
     * Creates new form addProperties
     */
    public addProperties() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel13 = new javax.swing.JPanel();
        rdoChatlieu12 = new javax.swing.JRadioButton();
        rdodanhmuc12 = new javax.swing.JRadioButton();
        rdoMausac12 = new javax.swing.JRadioButton();
        rdoSize12 = new javax.swing.JRadioButton();
        rdoThuonghieu12 = new javax.swing.JRadioButton();
        rdoNSX12 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        txtThem = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbx_FilterCategory = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setMaximumSize(new java.awt.Dimension(930, 580));
        setMinimumSize(new java.awt.Dimension(930, 580));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        rdoChatlieu12.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoChatlieu12);
        rdoChatlieu12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoChatlieu12.setText("Chất liệu");
        rdoChatlieu12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChatlieu12rdoChatlieuActionPerformed(evt);
            }
        });

        rdodanhmuc12.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdodanhmuc12);
        rdodanhmuc12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdodanhmuc12.setText("Danh mục");
        rdodanhmuc12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdodanhmuc12rdodanhmucActionPerformed(evt);
            }
        });

        rdoMausac12.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoMausac12);
        rdoMausac12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoMausac12.setText("Màu sắc");
        rdoMausac12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMausac12rdoMausacActionPerformed(evt);
            }
        });

        rdoSize12.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoSize12);
        rdoSize12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoSize12.setText("Size");
        rdoSize12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoSize12rdoSizeActionPerformed(evt);
            }
        });

        rdoThuonghieu12.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoThuonghieu12);
        rdoThuonghieu12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoThuonghieu12.setText("Thương hiệu");
        rdoThuonghieu12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoThuonghieu12rdoThuonghieuActionPerformed(evt);
            }
        });

        rdoNSX12.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNSX12);
        rdoNSX12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoNSX12.setText("Nhà sản xuất");
        rdoNSX12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNSX12rdoNSXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoChatlieu12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoSize12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(rdoThuonghieu12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdoNSX12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(rdodanhmuc12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(rdoMausac12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoChatlieu12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdodanhmuc12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoMausac12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoSize12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoThuonghieu12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoNSX12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jButton1.setBackground(new java.awt.Color(125, 224, 237));
        jButton1.setText("Add");

        jButton4.setBackground(new java.awt.Color(125, 224, 237));
        jButton4.setText("Delete");

        jButton5.setBackground(new java.awt.Color(125, 224, 237));
        jButton5.setText("Update");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Property Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Property Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Filter Property");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbx_FilterCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtThem, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_FilterCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdoChatlieu12rdoChatlieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChatlieu12rdoChatlieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoChatlieu12rdoChatlieuActionPerformed

    private void rdodanhmuc12rdodanhmucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdodanhmuc12rdodanhmucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdodanhmuc12rdodanhmucActionPerformed

    private void rdoMausac12rdoMausacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMausac12rdoMausacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoMausac12rdoMausacActionPerformed

    private void rdoSize12rdoSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoSize12rdoSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoSize12rdoSizeActionPerformed

    private void rdoThuonghieu12rdoThuonghieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoThuonghieu12rdoThuonghieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoThuonghieu12rdoThuonghieuActionPerformed

    private void rdoNSX12rdoNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNSX12rdoNSXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNSX12rdoNSXActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_FilterCategory;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rdoChatlieu12;
    private javax.swing.JRadioButton rdoMausac12;
    private javax.swing.JRadioButton rdoNSX12;
    private javax.swing.JRadioButton rdoSize12;
    private javax.swing.JRadioButton rdoThuonghieu12;
    private javax.swing.JRadioButton rdodanhmuc12;
    private javax.swing.JTextField txtThem;
    // End of variables declaration//GEN-END:variables
}
