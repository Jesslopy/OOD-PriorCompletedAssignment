/*
 * creates a non-fiction subclass for books
 *
 * --Alexander Jessop--
 */

 public class NonFiction extends Book {
    private int callNumber;

    public NonFiction() {
        this.title = "Designing with Objects";
        this.pages = 512;
        this.color = "burgundy";
        this.callNumber = 005;
    }

    public NonFiction(String title, int pages, String color, int callNumber) {
        this.title = title;
        this.pages = pages;
        this.color = color;
        this.callNumber = callNumber;
    }

    public int getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(int callNumber) {
        this.callNumber = callNumber;
    }

    public boolean hasSameCallNumber(NonFiction other) {
        return this.callNumber == other.callNumber;
    }

    @Override
    public int randomRating() {
        if (callNumber <= 333) {
            return (int) (Math.random() * 3 + 3);
        } else if (callNumber <= 666) {
            return (int) (Math.random() * 3 + 1);
        } else {
            return (int) (Math.random() * 3 + 2);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nnumber " + callNumber;
    }
    
    
    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }    
}
