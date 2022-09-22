package interfaces;

import classes.Transaction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface TransactionList {
    Transaction getLastTransaction();
    void addTransaction(Transaction transaction);
    List<Transaction> getTransactionsByDate(LocalDate date);
    ArrayList<Transaction> getAllTransactions();

}
