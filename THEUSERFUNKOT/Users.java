public class Users {
    // Attributes
    public String username;
    public String nama;
    public String email;
    public String alamat;
    public String pekerjaan;

    // Constructor with username, nama, and email parameters
    public Users(String username, String nama, String email) {
        this.username = username;
        this.nama = nama;
        this.email = email;
    }

    // Method to print user information
    public void cetakInfo() {
        System.out.println("Username: " + username);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Alamat: " + (alamat != null ? alamat : "Belum diisi"));
        System.out.println("Pekerjaan: " + (pekerjaan != null ? pekerjaan : "Belum diisi"));
        System.out.println("==========");
    }
}
