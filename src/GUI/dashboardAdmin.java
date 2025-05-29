
package GUI;

import GUI.login;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Container;

/**
 *
 * @author HP 14S
 */
public class dashboardAdmin extends javax.swing.JFrame  {
  
     private CardLayout cardLayout;
    
  public dashboardAdmin() {
    initComponents();
    setupPanelListeners();
    cardLayout = new CardLayout();
    wadah.setLayout(cardLayout);
    initializePanels();
}

   private void initializePanels() {
        // Buat dan tambahkan panel-panel ke CardLayout
        try {
        
            // Panel Produk
            ManageProduk produkFrame = new ManageProduk();
            Container produkContent = produkFrame.getContentPane();
            JPanel produkPanel = new JPanel(new BorderLayout());
            produkPanel.add(produkContent, BorderLayout.CENTER);
            wadah.add(produkPanel, "produk");
            
            
            // Panel Laporan
            LaporanPenjualan laporanFrame = new LaporanPenjualan();
            Container laporanContent = laporanFrame.getContentPane();
            JPanel laporanPanel = new JPanel(new BorderLayout());
            laporanPanel.add(laporanContent, BorderLayout.CENTER);
            wadah.add(laporanPanel, "laporan");
            
        } catch (Exception e) {
            System.out.println("Error initializing panels: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Method-method show panel yang sudah diperbaiki
    private void showTransaksiPanel() {
        cardLayout.show(wadah, "transaksi");
    }

    private void showProdukPanel() {
        cardLayout.show(wadah, "produk");
    }

    private void showUserPanel() {
        cardLayout.show(wadah, "user");
    }

    private void showLaporanPenjualanPanel() {
        cardLayout.show(wadah, "laporan");
    }

    private void handleLogout() {
        int response = javax.swing.JOptionPane.showConfirmDialog(
            this, 
            "Apakah Anda yakin ingin logout?", 
            "Konfirmasi Logout", 
            javax.swing.JOptionPane.YES_NO_OPTION
        );
        
        if (response == javax.swing.JOptionPane.YES_OPTION) {
            this.dispose(); // Tutup dashboard
            new login().setVisible(true);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelmanajemenProduk = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        panelPenjualan = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        wadah = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(102, 0, 102));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/auth/favicon-32x32.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ruka Dashboard Admin");

        panelmanajemenProduk.setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Manajemen Produk");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/auth/box.png"))); // NOI18N

        javax.swing.GroupLayout panelmanajemenProdukLayout = new javax.swing.GroupLayout(panelmanajemenProduk);
        panelmanajemenProduk.setLayout(panelmanajemenProdukLayout);
        panelmanajemenProdukLayout.setHorizontalGroup(
            panelmanajemenProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmanajemenProdukLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelmanajemenProdukLayout.setVerticalGroup(
            panelmanajemenProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmanajemenProdukLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelmanajemenProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logout.setBackground(new java.awt.Color(51, 51, 51));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("LOGOUT");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/auth/logout.png"))); // NOI18N

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPenjualan.setBackground(new java.awt.Color(51, 51, 51));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Laporan Penjualan");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/auth/report.png"))); // NOI18N

        javax.swing.GroupLayout panelPenjualanLayout = new javax.swing.GroupLayout(panelPenjualan);
        panelPenjualan.setLayout(panelPenjualanLayout);
        panelPenjualanLayout.setHorizontalGroup(
            panelPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPenjualanLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPenjualanLayout.setVerticalGroup(
            panelPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPenjualanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelmanajemenProduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(panelmanajemenProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(panelPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout wadahLayout = new javax.swing.GroupLayout(wadah);
        wadah.setLayout(wadahLayout);
        wadahLayout.setHorizontalGroup(
            wadahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );
        wadahLayout.setVerticalGroup(
            wadahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wadah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(wadah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(dashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboardAdmin().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logout;
    private javax.swing.JPanel panelPenjualan;
    private javax.swing.JPanel panelmanajemenProduk;
    private javax.swing.JPanel wadah;
    // End of variables declaration//GEN-END:variables

      

    private void setupPanelListeners() {
      

        // Event listener untuk panel Manajemen Produk
        panelmanajemenProduk.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showProdukPanel();
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                panelmanajemenProduk.setBackground(new java.awt.Color(70, 70, 70));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                panelmanajemenProduk.setBackground(new java.awt.Color(51, 51, 51));
            }
        });

        // Event listener untuk panel Laporan Penjualan
        panelPenjualan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                showLaporanPenjualanPanel();
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                panelPenjualan.setBackground(new java.awt.Color(70, 70, 70));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                panelPenjualan.setBackground(new java.awt.Color(51, 51, 51));
            }
        });

        // Event listener untuk logout
        logout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                handleLogout();
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                logout.setBackground(new java.awt.Color(70, 70, 70));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                logout.setBackground(new java.awt.Color(51, 51, 51));
            }
        });
    }
}

