/*

    You have to implement a library using Java class Library
    Methods: addBook,issueBook, returnBook,showAvailableBooks
    Properties : Array to store the available books,
    Array to store the issued books
 */


package Project;

import java.util.Scanner;



class Library{
    Scanner sc = new Scanner(System.in);
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[5];
        this.no_of_books = 0;
    }
    void addBook(){
        do{
            System.out.print("Please entre the book :  ");
            this.books[no_of_books] = sc.nextLine();
            no_of_books++;
        }while (no_of_books < 5);
    }
    void showAvailableBook(){
        System.out.println("Available Books Are : ");
        for (String book : this.books) {
            if(book == null){
                continue;
            }
            System.out.println("*   "+book);
        }
    }
    void issueBook(){
        System.out.print("Which book You Want to Borrow  : ");
        String book = sc.nextLine();
        for (int i = 0; i < this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println("The Book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("The Book does not exit");
    }
    void returnBook(){
        System.out.print("Which book You Want to Return  : ");
        String book = sc.nextLine();
        for (String b : this.books) {
            if(b == null){
                continue;
            }
            this.books[4] = book;
            System.out.println("*   "+book);
        }
    }
    void allMethod(){
        addBook();
        showAvailableBook();
        issueBook();
        showAvailableBook();
        returnBook();
        showAvailableBook();
    }
}



public class LibraryUsingJava {
    public static void main(String[] args) {
        Library l1 = new Library();
        l1.allMethod();

    }
}
