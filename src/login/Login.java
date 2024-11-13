/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login;

/**
 *
 * @author Lenovo
 */
public class Login {
private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
    // Ambil username dan password dari text field
    String username = txtUsername.getText();
    String password = new String(txtPassword.getPassword());

    // Cek kredensial (ganti dengan username dan password yang diinginkan)
    if (username.equals("admin") && password.equals("admin")) {
        JOptionPane.showMessageDialog(this, "Login Berhasil!");
        // Pindah ke form utama atau halaman berikutnya
        new MainFrame().setVisible(true);
        this.dispose(); // Menutup form login
    } else {
        JOptionPane.showMessageDialog(this, "Username atau Password salah!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
