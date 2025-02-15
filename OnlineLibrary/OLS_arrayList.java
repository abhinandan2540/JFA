package OnlineLibrary;
/*

 1. make an online library where user's can issueBook, returnBook, showAvailableBook
 2. array to show returnBook
 3. array to show availableBook
 4. array to show issuer name and date for issueBook
 5. array to show returner name and date for returnBook

 */

/*
THIS IS 2 OF 2 EXAMPLE
THIS IS DONE USING JAVA ARRAYLIST
 */

/*
library_books : for storing the names of the books
issued_books : for storing the info about issued books

only keeping functionality for book_name & date
 */

import java.util.ArrayList;

class OnlineLibrarySystem{
    ArrayList<String> library_books=new ArrayList<>();
    ArrayList<String> issued_books=new ArrayList<>();


//    initializing library with some books
    public OnlineLibrarySystem(){
        library_books.add("The Three-Body Problem");
        library_books.add("The Name of the Wind");
        library_books.add("Gone Girl");
        library_books.add("The Shining");
        library_books.add("The Nightingale");
        library_books.add("Atomic Habits");
        library_books.add("Meditations");
        library_books.add("The Psychology of Money");
        library_books.add("My Experiment with Truth");
        library_books.add("Becoming");
    }

//    show books : user's property for seen books
    public void showAvailableBook(){

        if(library_books.isEmpty()){
            System.out.println("no books are available");
        }
        else{
            System.out.println("...Available books...");
            for(String book : library_books){
                System.out.print(book+"\t|\t");
            }
        }
    }

//    adding multiple type single copy book*
//    (many books also can be added for large scale products)
    public void addBook(String add_book_name){
        if(!library_books.contains(add_book_name)){
            System.out.println("\n"+add_book_name+" added into library");
            library_books.add(add_book_name);
            showAvailableBook();
        }else{
            System.out.println("\n"+add_book_name+" already in library ");
        }
    }

//    issueBook : book issued by the user
    public void issueBook(String issue_book_name,String issue_book_date){
        if(library_books.contains(issue_book_name)){
            library_books.remove(issue_book_name);
            issued_books.add(issue_book_name);
            System.out.println("\n"+issue_book_name+" issued "+"on "+issue_book_date);
        }else{
            System.out.println(issue_book_name+"\tis not available currently");
        }
        showAvailableBook();
    }

//    return books
    public void  returnBook(String return_book_name,String return_book_date){
        if(issued_books.contains(return_book_name)){
            issued_books.remove(return_book_name);
            library_books.add(return_book_name);
            System.out.println("\n"+return_book_name+"\treturned on\t"+return_book_date);
        }else{
            System.out.println(return_book_name+"\tnot issued previously");
        }
       showAvailableBook();
    }

//    show issued books
    public void showIssuedBooks(){
        if(issued_books.isEmpty()){
            System.out.println("No currently issued books");
        }else{
            System.out.println("\n"+"...........Issued books..........");
            for(String book :issued_books){
                System.out.print(book+"\t|\t");
            }
        }
    }

}

public class OLS_arrayList {
    public static void main(String[] args) {
        OnlineLibrarySystem ols=new OnlineLibrarySystem();
        ols.showAvailableBook();
        ols.issueBook("Gone Girl","15/02/2025");
        ols.showIssuedBooks();
        ols.addBook("The India Way");
        ols.issueBook("The India Way","15/02/2025");
        ols.showIssuedBooks();
        ols.returnBook("The India Way","15/02/2024");
        ols.showIssuedBooks();

    }
}
