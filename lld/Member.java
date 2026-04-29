import java.util.*;

public class Member
 {
      private String name;
    private String pass;
    private int fine_amt;
     List<Book> borrowedbook = new ArrayList<>();

    public Member(String name, String pass) {
      this.name = name;
         this.pass = pass;
      this.fine_amt = 0;
    }

    public String getmember_name() 
{
        return name;
    }
    public String getPassword() 
{
        return pass;
    }

  public int getFine() 
{         return fine_amt;
    }

    public void setFine(int amount) 
{ 
            this.fine_amt = amount;
      }

    public void add_borrowedBooks(Book book)    {
         book.setBorrowed(true);
        borrowedbook.add(book);
    }

    public void remove_borrowedBook(Book book) {
           book.setBorrowed(false);
        borrowedbook.remove(book);
    }
    public List<Book> getBorrowedBooks() {
        return borrowedbook;
    }

    @Override
    public String toString() {
        return "Name     : " + name + "\n" +
               "Password : " + pass;
    }
}
