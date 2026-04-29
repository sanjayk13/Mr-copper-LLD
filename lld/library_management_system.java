import java.util.*;

public class library_management_system
 {
      HashMap<String, Book> books = new HashMap<>();
    HashMap<String, Member> members = new HashMap<>();
    HashMap<String, Integer> due_dates = new HashMap<>();

    public library_management_system() {
        
      books.put("java prog", new Book("java prog", "ISBN001"));
        books.put("dsa book", new Book("dsa book", "ISBN002"));
        books.put("Os notes", new Book("Os notes", "ISBN003"));
          members.put("kishan", new Member("kishan", "kishan1234"));
        members.put("john", new Member("john", "john12345"));
    }

  public boolean verifyuser(String member_name, String pass) 
{
        Member member = members.get(member_name);
        if (member != null && member.getmember_name().equals(member_name) && member.getPassword().equals(pass)) {
          return true;
        }
        System.out.println("invalid username");
          return false;
    }
   public void search_book(String member_name, String book_name) {
        if (books.containsKey(book_name)) 
        {
             Book book = books.get(book_name);
            if (!book.isIs_borrowed())
     {
             Member member = members.get(member_name);
                  member.add_borrowedBooks(book);
            due_dates.put(member_name + "_" + book_name, 14);  // due in 14 days
                System.out.println("book borrwored");
            System.out.println(book);
            } 
        else 
        {
                System.out.println("book is not avaible.");
            }
        } else 
    {
            System.out.println("no book found.");
 }
}

    public void return_book(String member_name, String book_name, int return_day) {
        if (books.containsKey(book_name)) 
        {
            Book book = books.get(book_name);
            if (book.isIs_borrowed())
         {
                Member member = members.get(member_name);
                member.remove_borrowedBook(book); 
            int due_date = due_dates.getOrDefault(member_name + "_" + book_name, 14);
             fine_amt fine = new fine_amt(return_day, due_date);
                int amount = fine.computeFine();
              member.setFine(member.getFine() + amount);
              System.out.println("book is returned");
                if (amount > 0)
             {
                    System.out.println("fine amount " + amount);
                } else {
                    System.out.println("no fine");
                }
                due_dates.remove(member_name + "_" + book_name);
            } else {
                System.out.println("The book isn't borrwed ");
            }
        }
     else {
            System.out.println("Book not found.");
        }
    }
   public void pay_fine(String member_name) {
         Member member = members.get(member_name);
        if (member != null)
         {
            int pending = member.getFine();
            if (pending > 0) 
            {
                System.out.println("pending fine" + pending);
                System.out.println("fine paid.");
                  member.setFine(0);
            } 
        else {
                System.out.println("No pending fine.");
                }        }
}
}
