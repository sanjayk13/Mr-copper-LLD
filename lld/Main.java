import java.util.*;

public class Main {

     public static boolean ispass(String password) {
        if(password.length() < 8) 
{
          System.out.println("Password is short");
             return false;  }
        
        
         for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= '0' && c <= '9') 
        {
                return true;
            }
        }

    System.out.println("pasword does not contains digits ");
          return false;
    }

     public static void main(String[] args) 
    
 {
        Scanner sc = new Scanner(System.in);
          library_management_system lms = new library_management_system();

         System.out.print("enter name ");
        String username = sc.nextLine();
          System.out.print("enter password");
        String password = sc.nextLine();

        if (!ispass(password)) {
            System.out.println("Exiting.");
            return;
        }

        if (!lms.verifyuser(username, password)) 
    {
            System.out.println("invalid login");
            return;
        }

        System.out.println("login sucessfull");

        while (true) 
       {
            System.out.println(" 1.borrow book ");
            System.out.println("2.return book ");
            System.out.println("3.pay fine ");
             System.out.println("4.exit ");

         int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) 
            {
                 case 1:
                      System.out.print("enter book name ");
                   String borrow_title = sc.nextLine();
                    lms.search_book(username, borrow_title);
                      break;

                case 2:
                      System.out.print("enter book to return");
                  String return_title = sc.nextLine();
                     System.out.print("enter return date ");
                  int return_day = sc.nextInt();
                        sc.nextLine();
                       lms.return_book(username, return_title, return_day);
                    break;
                case 3:
                    lms.pay_fine(username);
                    break;
                 case 4:
                     System.out.println("exited");
                    System.exit(0);
            
            
            
            
            
            
            }
 }
    }
}
