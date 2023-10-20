/*
 * creates a comparator for sorting books by rating 
 *
 * --Alexander Jessop--
 */

import java.util.Comparator;

public class BookRatingComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int ratingComparison = b1.getRating() - b2.getRating();
        if (ratingComparison == 0) {
            String title1 = (b1.getTitle() == null) ? "" : b1.getTitle();
            String title2 = (b2.getTitle() == null) ? "" : b2.getTitle();
            return title1.compareTo(title2);
        }
        return ratingComparison;
    }
}

