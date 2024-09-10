package Jobshit3;

public class Motors {
    // Attributes
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    // Method to display the status of the motor
    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);
        System.out.println("Mesin: " + (this.isMesinOn ? "On" : "Off"));
        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("-----------------------------------------");
        System.out.println("WALAWEWALAWEWALAWEWALAWEWALAWEWALAWEWALAWE");
        System.out.println("AHSIAPPAHSIAPPAHSIAPPAHSIAPPAHSIAPPAHSIAPP");
        System.out.println("-----------------------------------------");
    }

    // Getter untuk isMesinOn
    public boolean getMesinOn() {
        return this.isMesinOn;
    }

    // Setter untuk platNomor
    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    // Setter untuk kecepatan
    public void setKecepatan(int kecepatan) {
        if (this.isMesinOn) {
            this.kecepatan = kecepatan;
        } else {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }
    }

    // Setter untuk isMesinOn
    public void setMesinOn(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }
}

// package Jobshit3;

// public class Motors {
//     // Attributes
//     private String platNomor;
//     private boolean isMesinOn;
//     private int kecepatan;

//     // Method to display the status of the motor
//     public void displayStatus() {
//         System.out.println("Plat Nomor: " + this.platNomor);
//         System.out.println("Mesin: " + (this.isMesinOn ? "On" : "Off"));
//         System.out.println("Kecepatan: " + this.kecepatan);
//         System.out.println("WALAWEWALAWEWALAWEWALAWEWALAWEWALAWEWALAWE");
//         System.out.println("AHSIAPPAHSIAPPAHSIAPPAHSIAPPAHSIAPPAHSIAPP");
//     }

//     // Setter untuk platNomor
//     public void setPlatNomor(String platNomor) {
//         this.platNomor = platNomor;
//     }

//     // Setter untuk kecepatan
//     public void setKecepatan(int kecepatan) {
//         if (this.isMesinOn) {
//             this.kecepatan = kecepatan;
//         } else {
//             System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
//         }
//     }

//     // Setter untuk isMesinOn
//     public void setMesinOn(boolean isMesinOn) {
//         this.isMesinOn = isMesinOn;
//     }
// }


//KEDUA

// package Jobshit3;

// public class Motors {
//     // Attributes
//     private String platNomor;
//     private boolean isMesinOn;
//     private int kecepatan;

//     // Method to display the status of the motor
//     public void displayStatus() {
//         System.out.println("Plat Nomor: " + this.platNomor);
//         System.out.println("Mesin: " + (this.isMesinOn ? "On" : "Off"));
//         System.out.println("Kecepatan: " + this.kecepatan);
//         System.out.println("-----------------------------------------");
//         System.out.println("WALAWEWALAWEWALAWEWALAWEWALAWEWALAWEWALAWE");
//         System.out.println("AHSIAPPAHSIAPPAHSIAPPAHSIAPPAHSIAPPAHSIAPP");
//         System.out.println("-----------------------------------------");

//     }

//     // Setter untuk platNomor
//     public void setPlatNomor(String platNomor) {
//         this.platNomor = platNomor;
//     }

//     // Setter untuk kecepatan
//     public void setKecepatan(int kecepatan) {
//         if (this.isMesinOn) {
//             this.kecepatan = kecepatan;
//         } else {
//             System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
//         }
//     }

//     // Setter untuk isMesinOn
//     public void setMesinOn(boolean isMesinOn) {
//         this.isMesinOn = isMesinOn;
//     }
// }


