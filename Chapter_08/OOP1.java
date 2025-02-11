package Chapter_08;


class Employee{
    int id;
    String name;
    int salary;

     //    another thing that we can do
//    instance method
 public void PrintDetails(){
        System.out.println("i am "+name);
        System.out.println("id "+id);
     System.out.println("salary is "+salary);
    }

//    we can also make a return type method
    public int getSalary(){
     return salary;
    }

}

/*
 important:
By declaring PrintDetails() as public void, we make it an instance method.

This means the method belongs to an object (an instance of the class), not the class itself.
Since id and name are instance variables, they also belong to the object.
If we declare PrintDetails() as static, it becomes a class method.

Static methods belong to the class, not any specific object.
Since id and name are instance variables, they do not belong to the class itself, only to individual objects.
A static method cannot directly access instance variables like id and name because they belong to an instance, which static methods don’t have.
Since id and name are part of an object, PrintDetails() must also be an instance method so that it can access them.

 */

public class OOP1 {
    public static void main(String[] args) {
//        object initialization
//        here user and sinha are the objects
        Employee user = new Employee();
        Employee sinha=new Employee();
        user.id=12;
        user.name="abhi";
        user.salary=40;


        sinha.id=13;
        sinha.name="mana";
        sinha.salary=40;

        System.out.println("custom class in java");

//        System.out.println(user.id);
//        System.out.println(user.name);

//        we can call direct PrintDetails for printing
        user.PrintDetails();
        sinha.PrintDetails();

        int abhiSalary= user.getSalary();
        System.out.println("abhi salary "+abhiSalary);
        int sinhasalary=sinha.getSalary();
        System.out.println("sinha salary "+sinhasalary);

    }
}
