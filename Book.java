/*
 * creates a book class
 *
 * --Alexander Jessop--
 */

import java.util.Set;
import java.util.LinkedHashSet;

public abstract class Book implements Comparable<Book> {
    protected String title;
    protected int pages;
    protected String color;

    // Getter and Setter for pages
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
    // ... other instance variables ...

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    private int rating;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "title " + title + "\npages " + pages + "\ncolor " + color + "\nrating " + rating;
    }
    
    

    public abstract int randomRating(); // New abstract method
}

