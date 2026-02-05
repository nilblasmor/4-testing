package testing.level1.exercise1;

import java.util.ArrayList;
import java.util.Collections;

public class Library {

    private ArrayList<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title) {
        books.add(title);
    }

    public ArrayList<String> getBookList() {
        return new ArrayList<>(books);
    }

    public String getBookAtPosition(int position) {
        if (position < 0 || position >= books.size()) {
            throw new IndexOutOfBoundsException("Position is out of bounds.");
        }
        return books.get(position);
    }

    public void addBookAtPosition(String book, int position) {
        if (position < 0 || position > books.size()) {
            throw new IndexOutOfBoundsException("Position is out of bounds.");
        }
        books.add(position, book);
    }

    public boolean removeBook(String book) {
        return books.remove(book);
    }

    public ArrayList<String> getOrderedBookList() {
        ArrayList<String> orderedList = new ArrayList<>(books);
        Collections.sort(orderedList);
        return orderedList;
    }

}