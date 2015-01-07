/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sspd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public final class FormAddST extends javax.swing.JFrame {

    Koneksi koneksiDatabase = new Koneksi();
    
    public FormAddST() {
        initComponents();
        tampilComboJenisSurat();
        tampilComboLingkupSurat();
        tampilComboUnsurKegiatan();
        tampilComboSubUnsurKegiatan();
        tampilComboButirKegiatan();
        tampilComboDosenTujuan();
            
    }
    
    public void tampilComboJenisSurat(){
        
       String JenisSurat;
        
        try {
            Connection koneksiTabelSuratTugas = koneksiDatabase.getConnection();
            Statement statementComboSuratTugas = (Statement) koneksiTabelSuratTugas.createStatement(); 
                String sql = "SELECT SYS_VAL FROM tbm_system where SYS_CAT='Jenis_Surat' ";
                ResultSet resultSetComboSuratTugas = statementComboSuratTugas.executeQuery(sql);
                
                while(resultSetComboSuratTugas.next()){
                    ComboJenisSurat.addItem(resultSetComboSuratTugas.getString(1));
                    
                }
                
                resultSetComboSuratTugas.close();
            
            
            System.out.println("Tampil Berhasil");
        } catch (SQLException ex) {
            System.out.println("Tampil Gagal \n Pesan :" + ex.toString());
        }
        
    }
    
    public void tampilComboLingkupSurat(){
        try{
            Connection koneksiTabelSuratTugas = koneksiDatabase.getConnection();
            try (Statement statementComboSuratTugas = (Statement) koneksiTabelSuratTugas.createStatement()) {
                String sql = "SELECT SYS_VAL FROM tbm_system where SYS_CAT='Lingkup_Surat'";
                ResultSet resultSetComboSuratTugas = statementComboSuratTugas.executeQuery(sql);
                
                while(resultSetComboSuratTugas.next()){
                    ComboLingkupSurat.addItem(resultSetComboSuratTugas.getString(1));                
                }
                
                resultSetComboSuratTugas.close();
            }
            
            System.out.println("Tampil Berhasil");
        } catch (SQLException ex) {
            System.out.println("Tampil Gagal \n Pesan :" + ex.toString());
        }
    }
    
     public void tampilComboUnsurKegiatan(){
        try{
            Connection koneksiTabelSuratTugas = koneksiDatabase.getConnection();
            try (Statement statementComboSuratTugas = (Statement) koneksiTabelSuratTugas.createStatement()) {
                String sql = "SELECT * FROM tbm_unsur";
                ResultSet resultSetComboSuratTugas = statementComboSuratTugas.executeQuery(sql);
                
                while(resultSetComboSuratTugas.next()){
                    ComboUnsurKegiatan.addItem(resultSetComboSuratTugas.getString("NM_UNSUR"));                
                }
                
                resultSetComboSuratTugas.close();
            }
            
            System.out.println("Tampil Berhasil");
        } catch (SQLException ex) {
            System.out.println("Tampil Gagal \n Pesan :" + ex.toString());
        }
    }
     
     public void tampilComboSubUnsurKegiatan(){
        try{
            Connection koneksiTabelSuratTugas = koneksiDatabase.getConnection();
            try (Statement statementComboSuratTugas = (Statement) koneksiTabelSuratTugas.createStatement()) {
                String sql = "SELECT * FROM tbm_sub_unsur";
                ResultSet resultSetComboSuratTugas = statementComboSuratTugas.executeQuery(sql);
                
                while(resultSetComboSuratTugas.next()){
                    ComboSubUnsur.addItem(resultSetComboSuratTugas.getString("NM_SUB_UNSUR"));                
                }
                
                resultSetComboSuratTugas.close();
            }
            
            System.out.println("Tampil Berhasil");
        } catch (SQLException ex) {
            System.out.println("Tampil Gagal \n Pesan :" + ex.toString());
        }
    }
     
     public void tampilComboButirKegiatan(){
        try{
            Connection koneksiTabelSuratTugas = koneksiDatabase.getConnection();
            try (Statement statementComboSuratTugas = (Statement) koneksiTabelSuratTugas.createStatement()) {
                String sql = "SELECT * FROM tbm_butir_kegiatan";
                ResultSet resultSetComboSuratTugas = statementComboSuratTugas.executeQuery(sql);
                
                while(resultSetComboSuratTugas.next()){
                    ComboButirKegiatan.addItem(resultSetComboSuratTugas.getString("NM_BUTIR_KEGIATAN"));                
                }
                
                resultSetComboSuratTugas.close();
            }
            
            System.out.println("Tampil Berhasil");
        } catch (SQLException ex) {
            System.out.println("Tampil Gagal \n Pesan :" + ex.toString());
        }
    }
     
     public void tampilComboDosenTujuan()
     {
         try{
            Connection koneksiTabelSuratTugas = koneksiDatabase.getConnection();
            try (Statement statementComboSuratTugas = (Statement) koneksiTabelSuratTugas.createStatement()) {
                String sql = "SELECT NM_DOSEN FROM tbm_dosen";
                ResultSet resultSetComboSuratTugas = statementComboSuratTugas.executeQuery(sql);
                
                while(resultSetComboSuratTugas.next()){
                    ComboDosen.addItem(resultSetComboSuratTugas.getString(1));                
                }
                
                resultSetComboSuratTugas.close();
            }
            
            System.out.println("Tampil Berhasil");
        } catch (SQLException ex) {
            System.out.println("Tampil Gagal \n Pesan :" + ex.toString());
        }
     }
     
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        JenisSurat = new java.awt.Label();
        LingkupSurat = new java.awt.Label();
        UnsurKegiatan = new java.awt.Label();
        ComboJenisSurat = new javax.swing.JComboBox();
        ComboLingkupSurat = new javax.swing.JComboBox();
        ComboUnsurKegiatan = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        SubUnsurKegiatan = new javax.swing.JLabel();
        ButirKegiatan = new javax.swing.JLabel();
        Field_Ket_Butir = new javax.swing.JTextField();
        ComboSubUnsur = new javax.swing.JComboBox();
        ComboButirKegiatan = new javax.swing.JComboBox();
        NoSurat = new javax.swing.JLabel();
        Field_No_Surat = new javax.swing.JTextField();
        TanggalPembuatan = new javax.swing.JLabel();
        UploadSuratTugas = new javax.swing.JLabel();
        Button_Upload = new javax.swing.JButton();
        Field_Upload = new javax.swing.JTextField();
        Field_Tanggal_Pembuatan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ButtonSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Field_Tanggal_Mulai = new javax.swing.JTextField();
        Field_Tanggal_Akhir = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Field_Lokasi = new javax.swing.JTextField();
        ComboDosen = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        JenisSurat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JenisSurat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JenisSurat.setText("Jenis Surat");

        LingkupSurat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LingkupSurat.setText("Lingkup Surat");

        UnsurKegiatan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UnsurKegiatan.setText("Unsur Kegiatan");

        ComboJenisSurat.setBorder(null);
        ComboJenisSurat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ComboJenisSurat.setName(""); // NOI18N
        ComboJenisSurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboJenisSuratActionPerformed(evt);
            }
        });

        ComboLingkupSurat.setBorder(null);

        ComboUnsurKegiatan.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("ADD SURAT TUGAS");

        SubUnsurKegiatan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SubUnsurKegiatan.setText("Sub Unsur Kegiatan");

        ButirKegiatan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ButirKegiatan.setText("Butir Kegiatan");

        ComboSubUnsur.setBorder(null);

        ComboButirKegiatan.setBorder(null);

        NoSurat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NoSurat.setText("No Surat");

        Field_No_Surat.setToolTipText("");
        Field_No_Surat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field_No_SuratActionPerformed(evt);
            }
        });

        TanggalPembuatan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TanggalPembuatan.setText("Tanggal Pembuatan Surat");

        UploadSuratTugas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UploadSuratTugas.setText("Upload Surat Tugas");

        Button_Upload.setText("UPLOAD");
        Button_Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_UploadActionPerformed(evt);
            }
        });

        Field_Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field_UploadActionPerformed(evt);
            }
        });
        Field_Upload.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Field_UploadInputMethodTextChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Dosen Tujuan");

        ButtonSave.setText("SAVE");
        ButtonSave.setMaximumSize(new java.awt.Dimension(71, 23));
        ButtonSave.setMinimumSize(new java.awt.Dimension(71, 23));
        ButtonSave.setPreferredSize(new java.awt.Dimension(71, 23));
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Tanggal Mulai / Tanggal Akhir");

        Field_Tanggal_Mulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field_Tanggal_MulaiActionPerformed(evt);
            }
        });

        jLabel3.setText("/");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Lokasi");

        ComboDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboDosenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UploadSuratTugas)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JenisSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UnsurKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LingkupSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SubUnsurKegiatan)
                                    .addComponent(ButirKegiatan)
                                    .addComponent(NoSurat)
                                    .addComponent(TanggalPembuatan)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(220, 220, 220)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboLingkupSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboJenisSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboUnsurKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ComboButirKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Field_Ket_Butir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Field_No_Surat, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Field_Tanggal_Mulai, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Field_Tanggal_Akhir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Field_Upload, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(Button_Upload)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Field_Lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ComboDosen, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Field_Tanggal_Pembuatan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                                    .addComponent(ComboSubUnsur, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboJenisSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JenisSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LingkupSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UnsurKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ComboLingkupSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboUnsurKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(SubUnsurKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboSubUnsur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Field_Ket_Butir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboButirKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ButirKegiatan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NoSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field_No_Surat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TanggalPembuatan)
                    .addComponent(Field_Tanggal_Pembuatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UploadSuratTugas)
                    .addComponent(Button_Upload)
                    .addComponent(Field_Upload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(ComboDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Field_Tanggal_Mulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field_Tanggal_Akhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Field_Lokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Field_UploadInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Field_UploadInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Field_UploadInputMethodTextChanged

    private void Field_UploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field_UploadActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_Field_UploadActionPerformed

    private void Button_UploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_UploadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_UploadActionPerformed

    private void Field_No_SuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field_No_SuratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field_No_SuratActionPerformed

    private void ComboJenisSuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboJenisSuratActionPerformed
        
    }//GEN-LAST:event_ComboJenisSuratActionPerformed

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
        Connection koneksiTabelSuratTugas = koneksiDatabase.getConnection();
        try {      
            QueryData query=new QueryData();
            ResultSet rss;String sql;
            sql="SELECT SYS_STAT FROM tbm_system where SYS_VAL='"+ComboJenisSurat.getSelectedItem().toString()+"'";
            rss=query.Search(sql);
            String Jenis=rss.getString(1);
            sql="SELECT SYS_STAT FROM tbm_system where SYS_VAL='"+ComboLingkupSurat.getSelectedItem().toString()+"'";
            rss=query.Search(sql);
            String Lingkup=rss.getString(1);
            
             sql = "insert into tb_surat_tugas (ID_BUTIR_KEGIATAN, NO_SURAT, TGL_BUAT, FILE_SURAT, JENIS_SURAT, LINGKUP_SURAT, TANGGAL_MULAI, TANGGAL_AKHIR, LOKASI, KTRGN_BTR_KEGIATAN, STATUS_SURAT) "
                    + "values ('" + ComboButirKegiatan.getSelectedItem()+ "','" + Field_No_Surat.getText() + "','" + Field_Tanggal_Pembuatan.getText() + "',"
                    + "'" + Field_Upload.getText() + "','" + Jenis + "','" + Lingkup + "','"
                    + Field_Tanggal_Mulai.getText() + "','" + Field_Tanggal_Akhir.getText() + "','" + Field_Lokasi.getText() + "','" + Field_Ket_Butir.getText() + "',' ' )";
            Statement statementSaveST = koneksiTabelSuratTugas.createStatement();
            int resultSaveST = statementSaveST.executeUpdate(sql);                    
            JOptionPane.showMessageDialog(null, "SAVE SUCCESS");
            FormAddST clear = new FormAddST();
            clear.setVisible(true);
            this.dispose();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_ButtonSaveActionPerformed

    private void ComboDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboDosenActionPerformed
        
    }//GEN-LAST:event_ComboDosenActionPerformed

    private void Field_Tanggal_MulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field_Tanggal_MulaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field_Tanggal_MulaiActionPerformed

    public void CreateFile(){
        String JenSur;
        String LinSur;
        String UnKeg;
        String SubUnKeg;
        String ButKeg, KetBut;
        String NoSur;
        String TglPem;
        String DosTu;
        String TglMul,TglAkh;
        String Lok;
        
        
        JenSur = TextIO.getln();
        
        LinSur = TextIO.getln();
        
        UnKeg = TextIO.getln();
        
        SubUnKeg = TextIO.getln();
        
        ButKeg = TextIO.getln();
        
        KetBut = TextIO.getln();
        
        NoSur = TextIO.getln();
        
        TglPem = TextIO.getln();
        
        DosTu = TextIO.getln();
        
        TglMul = TextIO.getln();
        
        TglAkh = TextIO.getln();
        
        Lok = TextIO.getln();
    }
    
    
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
            java.util.logging.Logger.getLogger(FormAddST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAddST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAddST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAddST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormAddST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButirKegiatan;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JButton Button_Upload;
    private javax.swing.JComboBox ComboButirKegiatan;
    private javax.swing.JComboBox ComboDosen;
    private javax.swing.JComboBox ComboJenisSurat;
    private javax.swing.JComboBox ComboLingkupSurat;
    private javax.swing.JComboBox ComboSubUnsur;
    private javax.swing.JComboBox ComboUnsurKegiatan;
    private javax.swing.JTextField Field_Ket_Butir;
    private javax.swing.JTextField Field_Lokasi;
    private javax.swing.JTextField Field_No_Surat;
    private javax.swing.JTextField Field_Tanggal_Akhir;
    private javax.swing.JTextField Field_Tanggal_Mulai;
    private javax.swing.JTextField Field_Tanggal_Pembuatan;
    private javax.swing.JTextField Field_Upload;
    private java.awt.Label JenisSurat;
    private java.awt.Label LingkupSurat;
    private javax.swing.JLabel NoSurat;
    private javax.swing.JLabel SubUnsurKegiatan;
    private javax.swing.JLabel TanggalPembuatan;
    private java.awt.Label UnsurKegiatan;
    private javax.swing.JLabel UploadSuratTugas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}