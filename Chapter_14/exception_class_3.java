package Chapter_14;
import java.io.*;
public class exception_class_3 {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("nonexistent.txt");
        }
        catch (Exception e){
            System.out.println("An error occured: "+e.getMessage());
        }
    }
}
