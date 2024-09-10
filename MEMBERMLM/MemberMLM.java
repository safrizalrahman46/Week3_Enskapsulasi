package MEMBERMLM;

public class MemberMLM {
    private String idCardNumber;
    private String name;
    private int limitLoan;
    private int loanAmount;

    // Constructor to initialize member attributes
    public MemberMLM(String idCardNumber, String name, int limitLoan) {
        this.idCardNumber = idCardNumber;
        this.name = name;
        this.limitLoan = limitLoan;
        this.loanAmount = 0; // Initial loan amount is 0
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for loan limit
    public int getLimitLoan() {
        return limitLoan;
    }

    // Getter for loan amount
    public int getLoanAmount() {
        return loanAmount;
    }

    // Method for borrowing money
    public void borrow(int amount) {
        if (amount + loanAmount > limitLoan) {
            System.out.println("Sorry, loan amount exceeds limit.");
        } else {
            loanAmount += amount;
            System.out.println("JUMLAH UTANG: " + loanAmount);
        }
    }

    // Method for paying installments
    public void installment(int amount) {
        // Check if installment is at least 10% of the current loan amount
        if (amount >= 0.1 * loanAmount) {
            loanAmount -= amount;
            if (loanAmount < 0) {
                loanAmount = 0;
            }
            System.out.println("JUMLAH UTANG: " + loanAmount);
        } else {
            System.out.println("Sorry, the installment must be at least 10% of the loan amount.");
        }
    }

}
