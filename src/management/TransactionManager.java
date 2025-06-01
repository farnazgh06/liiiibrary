package management;

import library.Book;
import library.Member;
import library.Transaction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionManager {
    private List<Transaction> Transactions;

    public TransactionManager() {
        this.Transactions = new ArrayList<>(); {
        }
    }

    public Transaction addTransaction(String bookTitle, String memberName, String type) {

        Transaction transaction = new Transaction(
                "TXN-" + new Date().getTime(),
                bookTitle,
                memberName,
                type
        );

        Transactions.add(transaction);
        return transaction;
    }

    public Transaction getTransactionByIndex(int index) {
        if (index >= 0 ) {
            return Transactions.get(index);
        }
        return null;
    }
}
