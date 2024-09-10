package MEMBERMLM;

public class TestCooperative {
    public static void main(String[] args) {
        // Create a member object
        MemberMLM member1 = new MemberMLM("111333444", "Donny", 5000000);
        
        // Display member info
        System.out.println("Member Name: " + member1.getName());
        System.out.println("Loan Limit: " + member1.getLimitLoan());
        
        // Test borrowing more than the loan limit
        System.out.println("\nBorrowing 10,000,000...");
        member1.borrow(10000000);
        System.out.println("JUMLAH UTANG: " + member1.getLoanAmount());
        
        // Test borrowing within the limit
        System.out.println("\nBorrowing 4,000,000...");
        member1.borrow(4000000);
        System.out.println("JUMLAH UTANG: " + member1.getLoanAmount());
        
        // Test paying installments
        System.out.println("\nPaying 1,000,000 installments...");
        member1.installment(1000000);
        System.out.println("JUMLAH UTANG: " + member1.getLoanAmount());
        
        // Test paying larger installments
        System.out.println("\nPaying 3,000,000 installments...");
        member1.installment(3000000);
        System.out.println("JUMLAH UTANG: " + member1.getLoanAmount());
    }
}
