/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.DanhMucBean;
import contrller.ChuyenManHinhController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        ChuyenManHinhController controller = new ChuyenManHinhController(jpn_View);
        controller.setView(jpn_TrangChu, jlb_TrangChu);
        
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("TrangChu",jpn_TrangChu,jlb_TrangChu));
        listItem.add(new DanhMucBean("HocVien", jpn_HocVien,jlb_HocVien));
        listItem.add(new DanhMucBean("KhoaHoc", jpn_KhoaHoc,jlb_khoaHoc));
        listItem.add(new DanhMucBean("LopHoc", jpn_LopHoc,jlb_lopHoc));
        listItem.add(new DanhMucBean("ThongKe", jpn_ThongKe,jlb_thongKe));
        controller.setEven(listItem);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpn_Root = new javax.swing.JPanel();
        jpn_Menu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpn_TrangChu = new javax.swing.JPanel();
        jlb_TrangChu = new javax.swing.JLabel();
        jpn_HocVien = new javax.swing.JPanel();
        jlb_HocVien = new javax.swing.JLabel();
        jpn_KhoaHoc = new javax.swing.JPanel();
        jlb_khoaHoc = new javax.swing.JLabel();
        jpn_LopHoc = new javax.swing.JPanel();
        jlb_lopHoc = new javax.swing.JLabel();
        jpn_ThongKe = new javax.swing.JPanel();
        jlb_thongKe = new javax.swing.JLabel();
        jpn_View = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpn_Root.setBackground(new java.awt.Color(153, 153, 153));

        jpn_Menu.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/account.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ HỌC VIÊN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jpn_TrangChu.setBackground(new java.awt.Color(0, 204, 51));

        jlb_TrangChu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlb_TrangChu.setForeground(new java.awt.Color(255, 255, 255));
        jlb_TrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_TrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trangChu.png"))); // NOI18N
        jlb_TrangChu.setText("Màn hình chính");

        javax.swing.GroupLayout jpn_TrangChuLayout = new javax.swing.GroupLayout(jpn_TrangChu);
        jpn_TrangChu.setLayout(jpn_TrangChuLayout);
        jpn_TrangChuLayout.setHorizontalGroup(
            jpn_TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_TrangChuLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jlb_TrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpn_TrangChuLayout.setVerticalGroup(
            jpn_TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_TrangChuLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlb_TrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jpn_HocVien.setBackground(new java.awt.Color(0, 204, 51));

        jlb_HocVien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlb_HocVien.setForeground(new java.awt.Color(255, 255, 255));
        jlb_HocVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_HocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hocVien.png"))); // NOI18N
        jlb_HocVien.setText("Quản lý học viên");

        javax.swing.GroupLayout jpn_HocVienLayout = new javax.swing.GroupLayout(jpn_HocVien);
        jpn_HocVien.setLayout(jpn_HocVienLayout);
        jpn_HocVienLayout.setHorizontalGroup(
            jpn_HocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_HocVienLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jlb_HocVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpn_HocVienLayout.setVerticalGroup(
            jpn_HocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_HocVienLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlb_HocVien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jpn_KhoaHoc.setBackground(new java.awt.Color(0, 204, 51));

        jlb_khoaHoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlb_khoaHoc.setForeground(new java.awt.Color(255, 255, 255));
        jlb_khoaHoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_khoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/khoaHoc.png"))); // NOI18N
        jlb_khoaHoc.setText("Quản lý khóa học");

        javax.swing.GroupLayout jpn_KhoaHocLayout = new javax.swing.GroupLayout(jpn_KhoaHoc);
        jpn_KhoaHoc.setLayout(jpn_KhoaHocLayout);
        jpn_KhoaHocLayout.setHorizontalGroup(
            jpn_KhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_KhoaHocLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jlb_khoaHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpn_KhoaHocLayout.setVerticalGroup(
            jpn_KhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_KhoaHocLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlb_khoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jpn_LopHoc.setBackground(new java.awt.Color(0, 204, 51));

        jlb_lopHoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlb_lopHoc.setForeground(new java.awt.Color(255, 255, 255));
        jlb_lopHoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_lopHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lopHoc.png"))); // NOI18N
        jlb_lopHoc.setText("Quản lý lớp học");

        javax.swing.GroupLayout jpn_LopHocLayout = new javax.swing.GroupLayout(jpn_LopHoc);
        jpn_LopHoc.setLayout(jpn_LopHocLayout);
        jpn_LopHocLayout.setHorizontalGroup(
            jpn_LopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_LopHocLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jlb_lopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpn_LopHocLayout.setVerticalGroup(
            jpn_LopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_LopHocLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlb_lopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jpn_ThongKe.setBackground(new java.awt.Color(0, 204, 51));

        jlb_thongKe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlb_thongKe.setForeground(new java.awt.Color(255, 255, 255));
        jlb_thongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_thongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/thongKe.png"))); // NOI18N
        jlb_thongKe.setText("Thống kê dữ liệu");

        javax.swing.GroupLayout jpn_ThongKeLayout = new javax.swing.GroupLayout(jpn_ThongKe);
        jpn_ThongKe.setLayout(jpn_ThongKeLayout);
        jpn_ThongKeLayout.setHorizontalGroup(
            jpn_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_ThongKeLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jlb_thongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jpn_ThongKeLayout.setVerticalGroup(
            jpn_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_ThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlb_thongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpn_MenuLayout = new javax.swing.GroupLayout(jpn_Menu);
        jpn_Menu.setLayout(jpn_MenuLayout);
        jpn_MenuLayout.setHorizontalGroup(
            jpn_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpn_MenuLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpn_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpn_TrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpn_HocVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpn_KhoaHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpn_LopHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpn_ThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jpn_MenuLayout.setVerticalGroup(
            jpn_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_MenuLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jpn_TrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jpn_HocVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jpn_KhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jpn_LopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jpn_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jpn_View.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jpn_ViewLayout = new javax.swing.GroupLayout(jpn_View);
        jpn_View.setLayout(jpn_ViewLayout);
        jpn_ViewLayout.setHorizontalGroup(
            jpn_ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
        );
        jpn_ViewLayout.setVerticalGroup(
            jpn_ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpn_RootLayout = new javax.swing.GroupLayout(jpn_Root);
        jpn_Root.setLayout(jpn_RootLayout);
        jpn_RootLayout.setHorizontalGroup(
            jpn_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1083, Short.MAX_VALUE)
            .addGroup(jpn_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpn_RootLayout.createSequentialGroup()
                    .addComponent(jpn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jpn_View, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpn_RootLayout.setVerticalGroup(
            jpn_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
            .addGroup(jpn_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpn_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpn_View, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpn_Root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn_Root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlb_HocVien;
    private javax.swing.JLabel jlb_TrangChu;
    private javax.swing.JLabel jlb_khoaHoc;
    private javax.swing.JLabel jlb_lopHoc;
    private javax.swing.JLabel jlb_thongKe;
    private javax.swing.JPanel jpn_HocVien;
    private javax.swing.JPanel jpn_KhoaHoc;
    private javax.swing.JPanel jpn_LopHoc;
    private javax.swing.JPanel jpn_Menu;
    private javax.swing.JPanel jpn_Root;
    private javax.swing.JPanel jpn_ThongKe;
    private javax.swing.JPanel jpn_TrangChu;
    private javax.swing.JPanel jpn_View;
    // End of variables declaration//GEN-END:variables
}
