package library;
import java.util.Stack;

public class Member {
    private String memberId;
    private String name;
    private Stack<Transaction> transactions;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.transactions = new Stack<>();
    }

    public String getMemberId() { return memberId; }
    public String getName() { return name; }

    public void addTransaction(Transaction transaction) {
        transactions.push(transaction);
    }

    public Transaction getLastTransaction() {
        if (transactions.isEmpty()) {
            return null;
        }
        return transactions.peek();
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
