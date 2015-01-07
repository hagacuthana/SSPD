

package sspd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class SSPD extends javax.swing.JFrame {

   
    public SSPD() {
        initComponents();
        
        
        try{
            ResultSet rss;
            QueryData query=new QueryData();
            String sql;
            sql="SELECT SYS_VAL FROM tbm_system WHERE SYS_CAT='Jenis_Surat'";
            rss=query.Search(sql);
            while(rss.next())
        {
            JenisSurat.addItem(rss.getString(1));
        }
           sql="SELECT SYS_VAL FROM tbm_system WHERE SYS_CAT='Status_Surat'";
           rss=query.Search(sql);
           while(rss.next())
           {
               StatusSurat.addItem(rss.getString(1));
           }
            
        }catch(Exception e)
        {
        }
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTabbedPanel = new javax.swing.JTabbedPane();
        MasterPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        DosenPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDosen = new javax.swing.JTable();
        NIP = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SearchDosen = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        AddDosen = new javax.swing.JButton();
        DeleteDosen = new javax.swing.JButton();
        JabatanPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        IdJabatan = new javax.swing.JTextField();
        Jabatan = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableJbtn = new javax.swing.JTable();
        SearchJabatan = new javax.swing.JButton();
        ClearJabatan = new javax.swing.JButton();
        AddJabatan = new javax.swing.JButton();
        DeleteJabatan = new javax.swing.JButton();
        PangGolPanel = new javax.swing.JPanel();
        IdPangkat = new javax.swing.JTextField();
        Pangkat = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablePangGol = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SearchPangkat = new javax.swing.JButton();
        ClearPangkat = new javax.swing.JButton();
        AddPangkat = new javax.swing.JButton();
        Kumin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        DeletePangGol = new javax.swing.JButton();
        EditPangkat = new javax.swing.JButton();
        UnKegPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        SuratTugasPanel = new javax.swing.JPanel();
        Main = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        JenisSurat = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        StatusSurat = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableSuratTugas = new javax.swing.JTable();
        SearchSuratTugas = new javax.swing.JButton();
        AddSuratTugas = new javax.swing.JButton();
        Upload = new javax.swing.JButton();
        Send = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        TableDosen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIP", "Nama", "Pangkat", "Jabatan"
            }
        ));
        jScrollPane1.setViewportView(TableDosen);
        if (TableDosen.getColumnModel().getColumnCount() > 0) {
            TableDosen.getColumnModel().getColumn(0).setResizable(false);
        }

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });

        jLabel1.setText("NIP:");

        jLabel2.setText("Nama:");

        SearchDosen.setText("Search");
        SearchDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchDosenActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");

        AddDosen.setText("Add New");
        AddDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDosenActionPerformed(evt);
            }
        });

        DeleteDosen.setText("Delete");
        DeleteDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteDosenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DosenPanelLayout = new javax.swing.GroupLayout(DosenPanel);
        DosenPanel.setLayout(DosenPanelLayout);
        DosenPanelLayout.setHorizontalGroup(
            DosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DosenPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(DosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(DosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NIP, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(Nama))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(DosenPanelLayout.createSequentialGroup()
                .addGroup(DosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DosenPanelLayout.createSequentialGroup()
                        .addContainerGap(580, Short.MAX_VALUE)
                        .addComponent(DeleteDosen)
                        .addGap(18, 18, 18)
                        .addComponent(AddDosen))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DosenPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DosenPanelLayout.createSequentialGroup()
                                .addComponent(SearchDosen)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        DosenPanelLayout.setVerticalGroup(
            DosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DosenPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(DosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(DosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(DosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(SearchDosen))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteDosen)
                    .addComponent(AddDosen))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dosen", DosenPanel);

        jLabel6.setText("ID:");

        jLabel7.setText("Jabatan:");

        TableJbtn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID ", "Jabatan Dosen"
            }
        ));
        jScrollPane3.setViewportView(TableJbtn);

        SearchJabatan.setText("Search");
        SearchJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchJabatanActionPerformed(evt);
            }
        });

        ClearJabatan.setText("Clear");

        AddJabatan.setText("Add New");
        AddJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddJabatanActionPerformed(evt);
            }
        });

        DeleteJabatan.setText("Delete");
        DeleteJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteJabatanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JabatanPanelLayout = new javax.swing.GroupLayout(JabatanPanel);
        JabatanPanel.setLayout(JabatanPanelLayout);
        JabatanPanelLayout.setHorizontalGroup(
            JabatanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JabatanPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DeleteJabatan)
                .addGap(18, 18, 18)
                .addComponent(AddJabatan)
                .addGap(24, 24, 24))
            .addGroup(JabatanPanelLayout.createSequentialGroup()
                .addGroup(JabatanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JabatanPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SearchJabatan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ClearJabatan))
                    .addGroup(JabatanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JabatanPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JabatanPanelLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(JabatanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(JabatanPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(Jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(JabatanPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(IdJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        JabatanPanelLayout.setVerticalGroup(
            JabatanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JabatanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JabatanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(IdJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(JabatanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(JabatanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchJabatan)
                    .addComponent(ClearJabatan))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(JabatanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteJabatan)
                    .addComponent(AddJabatan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Jabatan", JabatanPanel);

        IdPangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdPangkatActionPerformed(evt);
            }
        });

        TablePangGol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Pangkat Golongan", "Kumulatif Minimal"
            }
        ));
        TablePangGol.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TablePangGolAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(TablePangGol);

        jLabel3.setText("ID:");

        jLabel4.setText("Pangkat:");

        SearchPangkat.setText("Search");
        SearchPangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchPangkatActionPerformed(evt);
            }
        });

        ClearPangkat.setText("Clear");
        ClearPangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearPangkatActionPerformed(evt);
            }
        });

        AddPangkat.setText("Add New");
        AddPangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPangkatActionPerformed(evt);
            }
        });

        jLabel5.setText("KUM Minimal");

        DeletePangGol.setText("Delete");
        DeletePangGol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePangGolActionPerformed(evt);
            }
        });

        EditPangkat.setText("Edit");
        EditPangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPangkatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PangGolPanelLayout = new javax.swing.GroupLayout(PangGolPanel);
        PangGolPanel.setLayout(PangGolPanelLayout);
        PangGolPanelLayout.setHorizontalGroup(
            PangGolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PangGolPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PangGolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PangGolPanelLayout.createSequentialGroup()
                        .addComponent(EditPangkat)
                        .addGap(18, 18, 18)
                        .addComponent(DeletePangGol)
                        .addGap(18, 18, 18)
                        .addComponent(AddPangkat))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PangGolPanelLayout.createSequentialGroup()
                        .addGroup(PangGolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(PangGolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IdPangkat, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(Kumin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Pangkat, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(366, 366, 366)
                        .addComponent(SearchPangkat)
                        .addGap(18, 18, 18)
                        .addComponent(ClearPangkat)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        PangGolPanelLayout.setVerticalGroup(
            PangGolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PangGolPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PangGolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(IdPangkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PangGolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Pangkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PangGolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PangGolPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(PangGolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Kumin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE))
                    .addGroup(PangGolPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PangGolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchPangkat)
                            .addComponent(ClearPangkat))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PangGolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddPangkat)
                    .addComponent(DeletePangGol)
                    .addComponent(EditPangkat))
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("Pangkat Golongan", PangGolPanel);

        javax.swing.GroupLayout UnKegPanelLayout = new javax.swing.GroupLayout(UnKegPanel);
        UnKegPanel.setLayout(UnKegPanelLayout);
        UnKegPanelLayout.setHorizontalGroup(
            UnKegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        UnKegPanelLayout.setVerticalGroup(
            UnKegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Unsur Kegiatan", UnKegPanel);

        jPanel2.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sub-Unsur", jPanel2);

        jPanel3.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Butir Kegiatan", jPanel3);

        javax.swing.GroupLayout MasterPanelLayout = new javax.swing.GroupLayout(MasterPanel);
        MasterPanel.setLayout(MasterPanelLayout);
        MasterPanelLayout.setHorizontalGroup(
            MasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MasterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        MasterPanelLayout.setVerticalGroup(
            MasterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MasterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        JTabbedPanel.addTab("Master", MasterPanel);

        Main.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel8.setText("No.Surat");

        jLabel9.setText("Perihal");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        JenisSurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JenisSuratActionPerformed(evt);
            }
        });

        jLabel10.setText("Jenis Surat");

        jLabel11.setText("Status");

        TableSuratTugas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.Surat", "Perihal", "Tanggal Pembuatan", "Tanggal Surat Masuk", "Jenis Surat", "Status"
            }
        ));
        jScrollPane4.setViewportView(TableSuratTugas);

        SearchSuratTugas.setText("Search");
        SearchSuratTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchSuratTugasActionPerformed(evt);
            }
        });

        AddSuratTugas.setText("Add New");
        AddSuratTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSuratTugasActionPerformed(evt);
            }
        });

        Upload.setText("Upload");

        Send.setText("Send");

        jLabel12.setText("Tgl Pembuatan Surat");

        jLabel13.setText("Tgl Surat Masuk");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JenisSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatusSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(SearchSuratTugas)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Send)
                        .addGap(18, 18, 18)
                        .addComponent(Upload)
                        .addGap(18, 18, 18)
                        .addComponent(AddSuratTugas)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JenisSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(StatusSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(SearchSuratTugas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddSuratTugas)
                    .addComponent(Upload)
                    .addComponent(Send))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Main.addTab("Main", jPanel1);

        javax.swing.GroupLayout SuratTugasPanelLayout = new javax.swing.GroupLayout(SuratTugasPanel);
        SuratTugasPanel.setLayout(SuratTugasPanelLayout);
        SuratTugasPanelLayout.setHorizontalGroup(
            SuratTugasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SuratTugasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Main)
                .addContainerGap())
        );
        SuratTugasPanelLayout.setVerticalGroup(
            SuratTugasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SuratTugasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Main)
                .addContainerGap())
        );

        JTabbedPanel.addTab("Surat Tugas", SuratTugasPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTabbedPanel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTabbedPanel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void AddPangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPangkatActionPerformed
        AddPangkat add=new AddPangkat();
        add.setVisible(true);
        
        
    }//GEN-LAST:event_AddPangkatActionPerformed

    private void IdPangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdPangkatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdPangkatActionPerformed

    private void SearchPangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchPangkatActionPerformed
               ResultSet rss;
               
             
                        String sql="SELECT * FROM tbm_pangkat_gol WHERE KUM_MIN>="+Kumin.getText();
                         //TODO Memperbaiki query di atas karena belum full 

                         QueryData query=new QueryData();
                         rss=query.Search(sql);
        try {      
            if(!rss.next() )
            {
                JOptionPane.showMessageDialog(null,"Data Tidak Ditemukan");
                
            }else
            {
                rss.beforeFirst();
                TablePangGol.setModel(DbUtils.resultSetToTableModel(rss));
                JOptionPane.showMessageDialog(null, "Data Ditemukan");
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(SSPD.class.getName()).log(Level.SEVERE, null, ex);
        }
       
               
    }//GEN-LAST:event_SearchPangkatActionPerformed

    private void TablePangGolAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TablePangGolAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TablePangGolAncestorAdded

    private void DeletePangGolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePangGolActionPerformed
       
        String row=(String)TablePangGol.getValueAt(TablePangGol.getSelectedRow(), 0);
        String sql="DELETE FROM tbm_pangkat_gol WHERE ID_PANGKAT_GOL='"+row+"'";
        QueryData query=new QueryData();
        query.Delete(sql);
      
    }//GEN-LAST:event_DeletePangGolActionPerformed

    private void ClearPangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearPangkatActionPerformed
        
    }//GEN-LAST:event_ClearPangkatActionPerformed

    private void AddJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddJabatanActionPerformed
       AddJabatan add=new AddJabatan();
       add.setVisible(true);
    }//GEN-LAST:event_AddJabatanActionPerformed

    private void SearchJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchJabatanActionPerformed
        ResultSet rss;
              
               String sql="SELECT * FROM tbm_jbtn_fungsional WHERE ID_JABATAN='"+IdJabatan.getText().toString()+"'";
               //TODO Memperbaiki query di atas karena belum full 
               
               QueryData query=new QueryData();
               rss=query.Search(sql);
               TableJbtn.setModel(DbUtils.resultSetToTableModel(rss));
    }//GEN-LAST:event_SearchJabatanActionPerformed

    private void DeleteJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteJabatanActionPerformed
        String row=(String)TableJbtn.getValueAt(TableJbtn.getSelectedRow(), 0);
        String sql="DELETE FROM tbm_pangkat_gol WHERE ID_PANGKAT_GOL='"+row+"'";
        QueryData query=new QueryData();
        query.Delete(sql);
    }//GEN-LAST:event_DeleteJabatanActionPerformed

    private void SearchDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchDosenActionPerformed
               ResultSet rss;
              
               String sql="SELECT NIP,NM_DOSEN,NM_PANGKAT_GOL,NAMA_JABATAN FROM tbm_dosen,tbm_pangkat_gol, tbm_jbtn_fungsional  where tbm_dosen.ID_PANGKAT_GOL=tbm_pangkat_gol.ID_PANGKAT_GOl and tbm_dosen.ID_JABATAN=tbm_jbtn_fungsional.ID_JABATAN and NIP='"+NIP.getText().toString()+"' order by NIP ";
              
               
               QueryData query=new QueryData();
               rss=query.Search(sql);
               TableDosen.setModel(DbUtils.resultSetToTableModel(rss));
    }//GEN-LAST:event_SearchDosenActionPerformed

    private void DeleteDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteDosenActionPerformed
          String row=(String)TableDosen.getValueAt(TableDosen.getSelectedRow(), 0);
        String sql="DELETE FROM tbm_pangkat_gol WHERE NIP='"+row+"'";
        QueryData query=new QueryData();
        query.Delete(sql);
    }//GEN-LAST:event_DeleteDosenActionPerformed

    private void EditPangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPangkatActionPerformed
        String row=(String)TablePangGol.getValueAt(TablePangGol.getSelectedRow(), 0);   
        try {
            EditPangkat edit=new EditPangkat(row);
            edit.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SSPD.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_EditPangkatActionPerformed

    private void SearchSuratTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchSuratTugasActionPerformed
        try{
            ResultSet rss;
              
               String sql=" SELECT NO_SURAT,TGL_BUAT,TGL_MASUK_STE,SYS_VAL,STATUS_SURAT FROM tb_surat_tugas,tbm_system where tb_surat_tugas.JENIS_SURAT=tbm_system.SYS_STAT and SYS_CAT='Jenis_Surat'"
                       + "" ;
              
               
               QueryData query=new QueryData();
               rss=query.Search(sql);
               TableSuratTugas.setModel(DbUtils.resultSetToTableModel(rss));
        
        }catch(Exception e)
        {
            
        }
        
    }//GEN-LAST:event_SearchSuratTugasActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void AddDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDosenActionPerformed
        try {
            AddDosen add=new AddDosen();
            add.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SSPD.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_AddDosenActionPerformed

    private void AddSuratTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSuratTugasActionPerformed
        FormAddST add=new FormAddST();
        add.setVisible(true);
    }//GEN-LAST:event_AddSuratTugasActionPerformed

    private void JenisSuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JenisSuratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JenisSuratActionPerformed

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
            java.util.logging.Logger.getLogger(SSPD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SSPD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SSPD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SSPD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SSPD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDosen;
    private javax.swing.JButton AddJabatan;
    private javax.swing.JButton AddPangkat;
    private javax.swing.JButton AddSuratTugas;
    private javax.swing.JButton ClearJabatan;
    private javax.swing.JButton ClearPangkat;
    private javax.swing.JButton DeleteDosen;
    private javax.swing.JButton DeleteJabatan;
    private javax.swing.JButton DeletePangGol;
    private javax.swing.JPanel DosenPanel;
    private javax.swing.JButton EditPangkat;
    private javax.swing.JTextField IdJabatan;
    private javax.swing.JTextField IdPangkat;
    private javax.swing.JTabbedPane JTabbedPanel;
    private javax.swing.JTextField Jabatan;
    private javax.swing.JPanel JabatanPanel;
    private javax.swing.JComboBox JenisSurat;
    private javax.swing.JTextField Kumin;
    private javax.swing.JTabbedPane Main;
    private javax.swing.JPanel MasterPanel;
    private javax.swing.JTextField NIP;
    private javax.swing.JTextField Nama;
    private javax.swing.JPanel PangGolPanel;
    private javax.swing.JTextField Pangkat;
    private javax.swing.JButton SearchDosen;
    private javax.swing.JButton SearchJabatan;
    private javax.swing.JButton SearchPangkat;
    private javax.swing.JButton SearchSuratTugas;
    private javax.swing.JButton Send;
    private javax.swing.JComboBox StatusSurat;
    private javax.swing.JPanel SuratTugasPanel;
    private javax.swing.JTable TableDosen;
    private javax.swing.JTable TableJbtn;
    private javax.swing.JTable TablePangGol;
    private javax.swing.JTable TableSuratTugas;
    private javax.swing.JPanel UnKegPanel;
    private javax.swing.JButton Upload;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
