# Mr-copper-LLD

**Library Management System**


**Problem Statement**
Libraries need a basic system to track books, manage members, handle borrow/return requests, and automatically calculate fines based on late returns. This project solves exactly that the core operations of library management.

**Approach & Logic**

The system is split across focused classes, each doing one job:

Book— holds the book info and ensure whether it's borrowed or available
Member— stores member details and their borrowed books list
Librarian— staff who manages the library operations 
fine amt— calculates fine based on return vs due date. 
LibraryManagementSystem— the core engine: search, borrow, return, fine
Main— entry point with a simple menu loop

**Fine Calculation Logic:**
**
<img width="393" height="204" alt="image" src="https://github.com/user-attachments/assets/34eff29e-52b0-4c8e-b923-7404146f9876" />




**Steps to Run**


1. Compile all files
javac Main.java

2. Run the program
java Main

3. Use the menu
     1. Borrow Book
     2. Return Book
     3. Pay Fine
     4. Exit


