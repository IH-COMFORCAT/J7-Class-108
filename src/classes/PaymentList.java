package classes;

import interfaces.TransactionList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PaymentList implements TransactionList {

    private ArrayList<Transaction> transactions;

    public PaymentList() {
        this.transactions = new ArrayList<>();
    }

    public Transaction getLastTransaction() {
        return transactions.get(transactions.size() - 1);
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);

    }

    public List<Transaction> getTransactionsByDate(LocalDate date) {
        List<Transaction> result = new ArrayList<>();
        for (Transaction t : transactions) {
            if (t.getDate().equals(date)) result.add(t);
        }
        return result;
    }

    public ArrayList<Transaction> getAllTransactions() {
        return transactions;
    }
}
