package  Jobshit31;

public class MotorDemo {
    public static void main(String[] args) {
        // Create Motor objects
        Motor motor1 = new Motor();
        motor1.displayStatus();  // Display initial status

        motor1.setPlatNomor("B 0838 XZ");
        int kecepatanBaru1 = 50;

        if (!motor1.isMesinOn() && kecepatanBaru1 > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor1.setKecepatan(kecepatanBaru1);
        }

        motor1.displayStatus();  // Display status after change

        Motor motor2 = new Motor();
        motor2.displayStatus();  // Display initial status

        motor2.setPlatNomor("N 9840 AB");
        motor2.setIsMesinOn(true);
        motor2.setKecepatan(40);
        motor2.displayStatus();  // Display status after change

        Motor motor3 = new Motor();
        motor3.displayStatus();  // Display initial status

        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayStatus();  // Display status after change
    }
}
