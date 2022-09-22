package classes;

public class SavingsAccount extends Account{
    
    private double interestFee;

    public SavingsAccount(String customerName, double balance, double interestFee) {
        super(customerName, balance);
        this.interestFee = interestFee;
    }

    @Override
    void processPayment(double paymentAmount) {
        super.setBalance(super.getBalance() - paymentAmount);
        
    }

    @Override
    void depositPayment(double debitAmount) {
        super.setBalance(super.getBalance() + (debitAmount * interestFee));

    }

    @Override
    String showCustomerDetails() {
        return "Name: " + getCustomerName() + ", Balance: " + getBalance();
    }
}
