package  Jobshit31;
public class Motor {
    // Private attributes
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    // Method to display the status of the motor
    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);
        System.out.println("Mesin: " + (this.isMesinOn ? "On" : "Off"));
        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("-----------------------------------------");
    }

    // Getter and Setter for platNomor
    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    // Getter and Setter for isMesinOn
    public boolean isMesinOn() {
        return isMesinOn;
    }

    public void setIsMesinOn(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }

    // Getter and Setter for kecepatan
    public int getKecepatan() {
        return kecepatan;
    }

    // THESAFRIZAL ANJAY
    public void setKecepatan(int kecepatan) {
        // Validate speed based on engine status, max speed, and non-negative value
        if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh negatif");
            this.kecepatan = 0;  // Set to 0 if a negative value is given
        } else if (kecepatan > 100) {
            System.out.println("Kecepatan maksimum adalah 100");
            this.kecepatan = 100;
        } else {
            this.kecepatan = kecepatan;
        }
    }
    

    // the saf
    // public void setKecepatan(int kecepatan) {
    //     // Validate speed based on engine status and max speed
    //     if (!this.isMesinOn && kecepatan > 0) {
    //         System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
    //     } else if (kecepatan > 100) {
    //         System.out.println("Kecepatan maksimum adalah 100");
    //         this.kecepatan = 100;
    //     } else {
    //         this.kecepatan = kecepatan;
    //     }
    // }
    
    // SEBELUM MODIFIKASI TRAIL HANDAL
    // public void setKecepatan(int kecepatan) {
    //     // Validate speed based on engine status
    //     if (!this.isMesinOn && kecepatan > 0) {
    //         System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
    //     } else {
    //         this.kecepatan = kecepatan;
    //     }
    // }
}
