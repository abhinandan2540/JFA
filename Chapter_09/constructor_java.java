package Chapter_09;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(int myid, String myname){
        this.id=myid;
        this.name=myname;
    }

    public void display(){
        System.out.println("Name: "+name+", id: "+id);

    }
}

public class constructor_java {
    public static void main(String[] args) {
        MyMainEmployee av=new MyMainEmployee(12,"java for all");
        av.display();

//        constructor's helps to get rid of get,set in java
        /*
        Key Reasons for Using Constructors in Java
1. Object Initialization (Automatic Setup)
When an object is created, a constructor is automatically called.
It helps initialize instance variables at the time of object creation.
Without a constructor, we would have to use setter methods or manually assign values.
2. Reduces Code Duplication
Instead of writing multiple setter methods, we can use a constructor to set values in one step.
This makes code cleaner and more readable.
3. Provides Default Values
If no constructor is defined, Java provides a default constructor to initialize instance variables with default values (0, null, false, etc.).
If a constructor is defined, we can assign custom default values.
4. Enforces Mandatory Initialization
Sometimes, an object must be initialized with certain values to work correctly.
Using constructors ensures that all required fields have values as soon as an object is created.

         */

    }

}
