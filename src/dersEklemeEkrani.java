
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author fbsel
 */
public class dersEklemeEkrani extends javax.swing.JInternalFrame {

    /**
     * Creates new form dersEklemeEkrani
     */
    public dersEklemeEkrani() {
        initComponents();
    }
    public boolean veriKontrol(){
        //derskodu , dersadi , akts , ortalama  kontrolü
        if(m_dersKodu.getText().equals("") || m_dersAdi.getText().equals("") || m_akts.getText().equals("") || m_ortalama.getText().equals("") ){
            JOptionPane.showMessageDialog(null,"Lutfen tüm alanlarını doldurunuz.");
            return false;
        }
        else if(m_donem.getSelectedItem().toString().equals(".....") || m_harfNotu.getSelectedItem().toString().equals(".....")){
        JOptionPane.showMessageDialog(null,"Lutfen tüm alanları doldurunuz.");
        return false;
        }
        else {
        return true ;        
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
        jButtonIptal = new javax.swing.JButton();
        jButtonEkle = new javax.swing.JButton();
        m_donem = new javax.swing.JComboBox<>();
        m_dersKodu = new javax.swing.JTextField();
        m_dersAdi = new javax.swing.JTextField();
        m_akts = new javax.swing.JTextField();
        m_ortalama = new javax.swing.JTextField();
        m_harfNotu = new javax.swing.JComboBox<>();

        setClosable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Dönem:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Ders Kodu:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("AKTS:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Ders Adı:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Harf Notu:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Ortalama:");

        jButtonIptal.setText("IPTAL");
        jButtonIptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIptalActionPerformed(evt);
            }
        });

        jButtonEkle.setText("EKLE");
        jButtonEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEkleActionPerformed(evt);
            }
        });

        m_donem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".....", "Güz Dönemi", "Bahar Dönemi" }));

        m_akts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_aktsActionPerformed(evt);
            }
        });

        m_harfNotu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".....", "AA=4.0", "BA=3.5", "BB=3.0", "CB=2.5", "CC=2.0", "DC=1.5", "DD=1.0", "FD=0.5", "FF=0.0" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(m_dersKodu)
                    .addComponent(m_donem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m_dersAdi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(m_ortalama, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(m_akts)
                    .addComponent(m_harfNotu, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(jButtonIptal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(m_donem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(m_dersKodu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(m_dersAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(m_akts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(m_ortalama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(m_harfNotu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEkle)
                    .addComponent(jButtonIptal))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEkleActionPerformed
        if(veriKontrol()){
            String donem=m_donem.getSelectedItem().toString();
            String derskod=m_dersKodu.getText();
            String dersAdi=m_dersAdi.getText();
            int akts=Integer.valueOf(m_akts.getText());
            float ortalama=Float.valueOf(m_ortalama.getText());
            String harfNotu=m_harfNotu.getSelectedItem().toString();
            
            //txtfile oluşturma
            String fileYol="C:\\Users\\fbsel\\Downloads\\dersler.txt";
            File file =new File(fileYol);
            
            
            try {
                FileWriter fileYazici = new FileWriter(file,true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileYazici);
                bufferedWriter.write(donem + "," + derskod + "," + dersAdi + "," + akts + "," + ortalama + "," + harfNotu);
                bufferedWriter.newLine();
                bufferedWriter.close();
                fileYazici.close();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(dersEklemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
              
            JOptionPane.showMessageDialog(null,"Dersiniz başarılı bir şekilde eklendi.");
        }
        else{
         JOptionPane.showMessageDialog(null,"Eklemede hata oluştu");
        }
    }//GEN-LAST:event_jButtonEkleActionPerformed

    private void m_aktsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_aktsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m_aktsActionPerformed

    private void jButtonIptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIptalActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonIptalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEkle;
    private javax.swing.JButton jButtonIptal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField m_akts;
    private javax.swing.JTextField m_dersAdi;
    private javax.swing.JTextField m_dersKodu;
    private javax.swing.JComboBox<String> m_donem;
    private javax.swing.JComboBox<String> m_harfNotu;
    private javax.swing.JTextField m_ortalama;
    // End of variables declaration//GEN-END:variables
}
