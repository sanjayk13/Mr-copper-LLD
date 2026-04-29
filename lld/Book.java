public class Book {
    private String title;
     private String ISBN;
    private boolean is_borrowed;

    public Book(String title, String ISBN) {
        this.title = title;
        this.ISBN = ISBN;
        this.is_borrowed = false;
    }

    public String getTitle()
 {
        return title;
    }

    public String getISBN() 
{
        return ISBN;
    }

    public boolean isIs_borrowed() {
        return is_borrowed;
    }

    public void setBorrowed(boolean status) 
{
        this.is_borrowed = status;
    }

    @Override
    public String toString() {
        return "Book Title   : " + title + "\n" +
               "ISBN         : " + ISBN + "\n" +
               "Availability : " + (is_borrowed ? "No" : "Yes");
    }
}
