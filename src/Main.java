import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import java.util.List;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mhmmd
 */
public class Main extends javax.swing.JFrame {
    private boolean isEdit = false;
    private int idEdit;
    
    /**
     * Creates new form Main
     */
    public Main() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKontak = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        cbbKategori = new javax.swing.JComboBox<>();
        txtNoTelepon = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        txtKataKunci = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listKategori = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Aplikasi Pengelolaan Kontak");

        tblKontak.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Kategori", "No Telelpon"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKontak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKontakMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKontak);

        jLabel2.setText("Nama:");

        jLabel3.setText("Kategori:");

        jLabel4.setText("Nomor Telepon:");

        cbbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Kategori -", "Keluarga", "Teman", "Teman Dekat", "Rekan Kerja", "Pasangan", "Dosen" }));
        cbbKategori.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbKategoriItemStateChanged(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jButton2.setText("Impor .CSV");

        jButton3.setText("Ekspor .CSV");

        btnHapus.setForeground(new java.awt.Color(255, 51, 51));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel5.setText("Daftar Kontak:");

        listKategori.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Keluarga", "Teman", "Teman Dekat", "Rekan Kerja", "Pasangan", "Dosen" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listKategori.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listKategori);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHapus))
                            .addComponent(txtNoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2)
                            .addGap(392, 392, 392))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(201, 201, 201)
                            .addComponent(cbbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtKataKunci, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCari))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKataKunci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari)
                    .addComponent(jLabel5)
                    .addComponent(cbbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getAllData(null);
    }//GEN-LAST:event_formWindowOpened

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // Deteksi mode sedang insert atau update
        if (!isEdit) {
            // Mode insert
            try (Connection conn = SQLiteConnection.connect()) {
                String sql = "INSERT INTO kontak (nama, kategori, no_telp) VALUES (?, ?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);

                // Set nilai untuk parameter query
                pstmt.setString(1, txtNama.getText());        
                pstmt.setString(2, listKategori.getSelectedValue());
                pstmt.setString(3, txtNoTelepon.getText());

                // Eksekusi query
                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    getAllData(null);
                    JOptionPane.showMessageDialog(null, "Data telah disimpan!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
            }
        } else {
            // Mode Edit
            try (Connection conn = SQLiteConnection.connect()) {
                String sql = "UPDATE kontak SET nama = ?, kategori = ?, no_telp = ? WHERE id = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);

                // Set nilai untuk parameter query
                pstmt.setString(1, txtNama.getText());
                pstmt.setString(2, listKategori.getSelectedValue());
                pstmt.setString(3, txtNoTelepon.getText());
                pstmt.setInt(4, idEdit); // idEdit digunakan untuk menentukan data yang akan diperbarui

                // Eksekusi query
                int rowsUpdated = pstmt.executeUpdate();
                if (rowsUpdated > 0) {
                    getAllData(null); // Memperbarui data pada tampilan
                    JOptionPane.showMessageDialog(null, "Data berhasil diperbarui!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak ada data yang diperbarui.", "Gagal", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
            }
        }
        

    }//GEN-LAST:event_btnSimpanActionPerformed

    private void tblKontakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKontakMouseClicked
        int row = tblKontak.getSelectedRow();
        
        // Ambil record di row yang dipilih
        Integer id = Integer.parseInt(tblKontak.getValueAt(row, 0).toString());
        String nama = tblKontak.getValueAt(row, 1).toString();
        String kategori = tblKontak.getValueAt(row, 2).toString();
        String no_telp = tblKontak.getValueAt(row, 3).toString();
        
        // Parsing data ke form
        txtNama.setText(nama);
        txtNoTelepon.setText(no_telp);
        
        isEdit = true;
        idEdit = id;
    }//GEN-LAST:event_tblKontakMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, 
            "Apakah Anda yakin ingin menghapus data ini?", 
            "Konfirmasi Hapus", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.WARNING_MESSAGE);

        // Jika pengguna memilih "Yes", lanjutkan dengan penghapusan
        if (confirm == JOptionPane.YES_OPTION) {
            if (idEdit != -1) { // Pastikan idEdit sudah valid
                try (Connection conn = SQLiteConnection.connect()) {
                    String sql = "DELETE FROM kontak WHERE id = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setInt(1, idEdit); // Menggunakan idEdit untuk menghapus data yang tepat

                    // Eksekusi query
                    int rowsDeleted = pstmt.executeUpdate();
                    if (rowsDeleted > 0) {
                        getAllData(null); // Memperbarui tampilan data setelah penghapusan
                        JOptionPane.showMessageDialog(null, "Data berhasil dihapus!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data tidak ditemukan untuk dihapus.", "Gagal", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Tidak ada data yang dipilih untuk dihapus.", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            // Jika pengguna memilih "No", batalkan penghapusan
            JOptionPane.showMessageDialog(this, "Penghapusan dibatalkan.", "Dibatalkan", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void cbbKategoriItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbKategoriItemStateChanged
        if (cbbKategori.getSelectedItem() != "- Pilih Kategori -") {
            Map<String, Object> searchParams = new HashMap<>();
            searchParams.put("kategori", cbbKategori.getSelectedItem().toString());
            searchParams.put("nama", txtKataKunci.getText());
            
            getAllData(searchParams);
        } else {
            getAllData(null);
        }
    }//GEN-LAST:event_cbbKategoriItemStateChanged

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        if (cbbKategori.getSelectedItem() != "- Pilih Kategori -") {
            Map<String, Object> searchParams = new HashMap<>();
            searchParams.put("kategori", cbbKategori.getSelectedItem().toString());
            searchParams.put("nama", txtKataKunci.getText());
            
            getAllData(searchParams);
        } else {
            Map<String, Object> searchParams = new HashMap<>();
            searchParams.put("nama", txtKataKunci.getText());
            
            getAllData(searchParams);
        }
    }//GEN-LAST:event_btnCariActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbbKategori;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listKategori;
    private javax.swing.JTable tblKontak;
    private javax.swing.JTextField txtKataKunci;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoTelepon;
    // End of variables declaration//GEN-END:variables

    private void getAllData(Map<String, Object> searchParams) {
        try (Connection conn = SQLiteConnection.connect()) {
            if (conn != null) {
                // Query dasar
                StringBuilder sql = new StringBuilder("SELECT * FROM kontak");

                // Menyusun query berdasarkan parameter pencarian
                if (searchParams != null && !searchParams.isEmpty()) {
                    sql.append(" WHERE ");
                    boolean first = true;

                    // Iterasi melalui searchParams untuk menambahkan kondisi WHERE
                    for (Map.Entry<String, Object> entry : searchParams.entrySet()) {
                        String column = entry.getKey();
                        Object value = entry.getValue();

                        if (!first) {
                            sql.append(" AND ");
                        }
                        first = false;

                        // Tentukan query LIKE untuk pencarian teks
                        if (value instanceof String) {
                            sql.append(column).append(" LIKE ?");
                        }
                        // Tentukan query untuk pencarian angka atau jenis lain
                        else if (value instanceof Integer) {
                            sql.append(column).append(" = ?");
                        }
                        // Tambahkan kondisi untuk tipe lain sesuai kebutuhan
                    }
                }

                // Siapkan PreparedStatement
                PreparedStatement pstmt = conn.prepareStatement(sql.toString());

                // Jika ada parameter pencarian, set parameter untuk PreparedStatement
                if (searchParams != null && !searchParams.isEmpty()) {
                    int index = 1;
                    for (Map.Entry<String, Object> entry : searchParams.entrySet()) {
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            pstmt.setString(index++, "%" + value + "%");
                        } else if (value instanceof Integer) {
                            pstmt.setInt(index++, (Integer) value);
                        }
                        // Tentukan penanganan tipe lain sesuai kebutuhan
                    }
                }

                ResultSet rs = pstmt.executeQuery();

                // Uraikan data ke tabel
                DefaultTableModel model = (DefaultTableModel) tblKontak.getModel();
                model.setRowCount(0);  // Bersihkan tabel sebelumnya

                while (rs.next()) {
                    Object[] row = new Object[4];
                    row[0] = rs.getInt("id");
                    row[1] = rs.getString("nama");
                    row[2] = rs.getString("kategori");
                    row[3] = rs.getString("no_telp");
                    model.addRow(row);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
        }
    }
}
