package classes;

public abstract class Account {
    private int accountNumber;
    private String customerName;
    private double balance;

    public Account( String customerName, double balance) {
        setAccountNumber(accountNumber);
        setCustomerName(customerName);
        setBalance(balance);
    }

    abstract void processPayment(double paymentAmount);
    abstract void depositPayment(double debitAmount);
    abstract String showCustomerDetails();

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean hasFunds() {
        return getBalance() > 0;
    }
}
