package library;
import datastructures.queues.CustomQueue;
import datastructures.interfaces.Queue;


public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private Queue<Member> wailList;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
        this.wailList = new CustomQueue<>();
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    public void addToWaitlist(Member member) {
        wailList.add(member);
    }

    public Member getNextInWaitlist() {
        return wailList.poll();
    }

    public boolean hasWaitlist() {
        if (wailList.isEmpty()) return false;
        else return true;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", available=" + isAvailable +
                '}';
    }
}