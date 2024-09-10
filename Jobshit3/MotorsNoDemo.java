package Jobshit3;

public class MotorsNoDemo {

    public static void main(String[] args) {
        // Buat objek motors1 dari kelas Motors
        Motors motors1 = new Motors();
        motors1.displayStatus();  // Menampilkan status awal

        int kecepatanBaru1 = 50;
        
        // Gunakan getter untuk mengakses isMesinOn
        if (!motors1.getMesinOn() && kecepatanBaru1 > 0) {
            System.err.println("Kecepatan tidak boleh lebih dari 0 karena mesin mati");
        } else {
            // Gunakan setter untuk mengubah kecepatan
            motors1.setKecepatan(kecepatanBaru1);
        }

        motors1.displayStatus();  // Menampilkan status setelah perubahan


        // Buat objek motors2 dari kelas Motors
        Motors motors2 = new Motors();
        motors2.displayStatus();  // Menampilkan status awal

        int kecepatanBaru2 = 60;

        if (!motors2.getMesinOn() && kecepatanBaru2 > 0) {
            System.err.println("Kecepatan tidak boleh lebih dari 0 karena mesin mati");
        } else {
            motors2.setKecepatan(kecepatanBaru2);
        }

        motors2.displayStatus();  // Menampilkan status setelah perubahan


        // Buat objek motors3 dari kelas Motors (mesin menyala)
        Motors motors3 = new Motors();
        motors3.setMesinOn(true);  // Mesin dihidupkan
        motors3.setPlatNomor("B 1234 XYZ");
        motors3.displayStatus();  // Menampilkan status awal

        int kecepatanBaru3 = 40;

        if (!motors3.getMesinOn() && kecepatanBaru3 > 0) {
            System.err.println("Kecepatan tidak boleh lebih dari 0 karena mesin mati");
        } else {
            motors3.setKecepatan(kecepatanBaru3);
        }

        motors3.displayStatus();  // Menampilkan status setelah perubahan
    }
}



// package Jobshit3;

// public class MotorsNoDemo {

//     public static void main(String[] args) {
//         // Buat objek motors1 dari kelas Motors
//         Motors motors1 = new Motors();

//         // Set status mesin (default-nya mesin mati)
//         motors1.setMesinOn(false);

//         // Tampilkan status awal motors1
//         motors1.displayStatus();

//         // Set atribut motors1
//         motors1.setPlatNomor("B 0838 XZ");
//         motors1.setKecepatan(50);  // This should trigger the validation message
//         motors1.setMesinOn(true);  // Set mesin menyala

//         // Tampilkan status setelah perubahan
//         motors1.displayStatus();

//         // Buat objek motors2 dari kelas Motors
//         Motors motors2 = new Motors();

//         // Set status mesin (default-nya mesin mati)
//         motors2.setMesinOn(false);

//         // Tampilkan status awal motors2
//         motors2.displayStatus();

//         // Set atribut motors2
//         motors2.setPlatNomor("B NN888 XZ");
//         motors2.setKecepatan(100);  // This should trigger the validation message
//         motors2.setMesinOn(false);  // Set mesin mati

//         // Tampilkan status setelah perubahan
//         motors2.displayStatus();
//     }
// }

//kedua

// package Jobshit3;

// public class MotorsNoDemo {

//     public static void main(String[] args) {
//         // Buat objek motors1 dari kelas Motors
//         Motors motors1 = new Motors();
//         motors1.displayStatus();  // Hanya satu kali panggil

//         int kecepatanbaru = 50;
//         if (!motors1.isMesinOn && kecepatanbaru > 0) {
//             System.err.println("Kecepatan tidak boleh lebih dari 0 ");
//         }
//         else{
//             motors1.kecepatan =kecepatanbaru
//         }
//         motors1.displayStatus();  // Hanya satu kali panggil

   
    
//         // Buat objek motors2 dari kelas Motors
//         Motors motors2 = new Motors();
//         motors2.setMesinOn(false);
//         motors2.setPlatNomor("B NN888 XZ");
//         motors2.setKecepatan(100);
//         motors2.displayStatus();  // Hanya satu kali panggil
    
//         // Buat objek motors3 dari kelas Motors
//         Motors motors3 = new Motors();
//         motors3.setMesinOn(true);
//         motors3.setPlatNomor("B FRANK OCEAN XZ");
//         motors3.setKecepatan(100);
//         motors3.displayStatus();  // Hanya satu kali panggil
//     }
// }

//     public static void main(String[] args) {

//         // Buat objek motors1 dari kelas Motors
//         Motors motors1 = new Motors();

//         // Set status mesin (default-nya mesin mati)
//         motors1.setMesinOn(false);

//         // Tampilkan status awal motors1
//         motors1.displayStatus();

//         // Set atribut motors1
//         motors1.setPlatNomor("B 0838 XZ");
//         motors1.setKecepatan(50);  // This should trigger the validation message
//         motors1.setMesinOn(true);  // Set mesin menyala

//         // Tampilkan status setelah perubahan
//         motors1.displayStatus();



// // MOTOR KEDUASS 


//         // Buat objek motors2 dari kelas Motors
//         Motors motors2 = new Motors();

//         // Set status mesin (default-nya mesin mati)
//         motors2.setMesinOn(false);

//         // Tampilkan status awal motors2
//         motors2.displayStatus();

//         // Set atribut motors2
//         motors2.setPlatNomor("B NN888 XZ");
//         motors2.setKecepatan(100);  // This should trigger the validation message
//         motors2.setMesinOn(false);  // Set mesin mati

//         // Tampilkan status setelah perubahan
//         motors2.displayStatus();


// // MOTOR KETIGA

//         // Buat objek motors2 dari kelas Motors
//         Motors motors3 = new Motors();


//         // Set status mesin (default-nya mesin mati)
//         motors3.setMesinOn(false);

//         // Tampilkan status awal motors3
//         motors3.displayStatus();

//         // Set atribut motors3
//         motors3.setPlatNomor("B FRANK OCEAN XZ");
//         motors3.setKecepatan(100);  // This should trigger the validation message
//         motors3.setMesinOn(true);  // Set mesin mati

//         // Tampilkan status setelah perubahan
//         motors3.displayStatus();



//     }

