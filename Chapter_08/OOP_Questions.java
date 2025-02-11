package Chapter_08;


class EmployeeStatus{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }

    public String setName( String newName){
     name=newName;
     return newName;
    }
}


public class OOP_Questions {
    public static void main(String[] args) {

//        object initialization
        EmployeeStatus abhi=new EmployeeStatus();
        abhi.salary=50;
        abhi.name="Abhinandan";

        int abhiSalary=abhi.getSalary();
        System.out.println(abhiSalary);

        String abhiName=abhi.getName();
        System.out.println(abhiName);

        String setName=abhi.setName("mrx");
        System.out.println(setName);


    }
}
