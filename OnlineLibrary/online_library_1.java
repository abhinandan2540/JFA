package OnlineLibrary;

/*
 1. make a onlie library where user's can issueBook, returnBook, showAvailableBook

 */


/*
  THIS IS 1 OF 2 EXAMPLES
  THIS IS DONE USING SIMPLE ARRAY
 */

//let's assume we'll be dealing with array of finite numbers ( not the ArrayList )
class online_library{
    String [] library_books={"The Three-Body Problem","The Name of the Wind","Gone Girl ","The Shining","The Nightingale","Atomic Habits","Meditations","The Psychology of Money","My Experiment with truth","Becoming"};

//    for showing all the available books
    public void showAvailableBooks(){
        System.out.println("Available books..");
        for(String book : library_books){
            if(book !=null){
                System.out.print(book+"\t|\t");
            }
        }
    }

//    for issue books
    public void issueBook(String book_name, String issue_date){
        Boolean isFound=false;
        for(int i=0;i<library_books.length;i++){
            if(library_books[i].equals(book_name) && library_books[i]!=null){
                isFound=true;
                break;
            }
        }
        if(isFound){
            System.out.println(book_name+" not available in library...");
            showAvailableBooks();

        }else{
            System.out.println("\n"+book_name+" issued on "+issue_date);
        }
    }

//    for returning book
    public void returnBook(String book_name, String return_date){
        boolean isIssued=true;
        for(int i=0;i<library_books.length;i++){
         if(library_books[i]!=book_name){
             isIssued=false;
             break;
         }

        }
        if(isIssued){
            System.out.println(book_name+" returned on "+return_date);
        }else{
            System.out.println(book_name+" not issued previously");
            showAvailableBooks();
        }

    }
}


public class online_library_1 {
    public static void main(String[] args) {
        online_library ols=new online_library();
        ols.showAvailableBooks();
        ols.issueBook("Gone Girl","15/02/2025");
        ols.returnBook("jungle book","15/02/2025");

    }
}
