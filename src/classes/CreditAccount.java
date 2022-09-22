package classes;

public class CreditAccount extends Account{

    private final double maxCredit;
    private double interestRate;

    public CreditAccount(String customerName, double balance, double maxCredit, double interestRate) {
        super(customerName, balance);
        this.maxCredit = maxCredit;
        this.interestRate = interestRate;
    }

    public double getMaxCredit() {
        return maxCredit;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    void processPayment(double paymentAmount) {
        if(getBalance() - paymentAmount > maxCredit - getBalance()) {
            System.out.println("Error");
        } else {
            setBalance(getBalance() - (paymentAmount * interestRate));

        }

    }

    void depositPayment(double debitAmount) {
        setBalance(getBalance() + debitAmount);
    }

    String showCustomerDetails() {
        return "Credit card owner: " + getCustomerName() +
                " , balance:  " + getBalance();
    }
}
