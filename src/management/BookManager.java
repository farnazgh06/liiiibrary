package management;

import library.Book;
import library.Member;
import java.util.HashMap;
import java.util.Map;

public class BookManager {

    private Map<String, Book> books;
    private MemberManager memberManager;

    public BookManager(MemberManager memberManager) {
        this.books = new HashMap<>();
        this.memberManager = memberManager;
    }

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public Book getBookByIsbn(String isbn) {
        return books.get(isbn);
    }

    public boolean isBookAvailable(String isbn) {
        if(books.get(isbn) != null && books.get(isbn).isAvailable()) {
            return true;
        }
        else{
            return false;
        }

    }

    public void setBookAvailability(String isbn, boolean available) {
        books.get(isbn).setAvailable(available);
    }

    public void addToWaitlist(String isbn, String memberId) {
        books.get(isbn).addToWaitlist(memberManager.getMember(memberId));
    }

    public Member getNextFromWaitlist(String isbn) {
        return books.get(isbn).getNextInWaitlist();
    }

    public boolean hasWaitlist(String isbn) {
        return books.get(isbn).hasWaitlist();
    }
}