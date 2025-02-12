package Chapter_09;

class COverload{
    int id;
    String name;
    int salary;

//    calling 1
    public COverload(){
        id=0;
        name="enter name";
        salary= 0;
    }

//    calling 2
    public COverload(int myid){
        this.id=myid;
        this.name="enter valid name";
        this.salary=0;
    }
//    calling 3rd
    public COverload(int myid, String myname){
        this.id=myid;
        this.name=myname;
        this.salary=0;
    }
//    calling 4th
    public COverload(int myid, String myname, int mysalary){
        this.id=myid;
        this.name=myname;
        this.salary=mysalary;
    }

    public void display(){
        System.out.println("ID:"+id+",name:"+name+",salary:"+salary);
    }
}

public class constructor_overloading {
    public static void main(String[] args) {

//        calling 1st
        COverload av=new COverload();
        av.display();

//      calling 2nd
        COverload av1=new COverload(12);
        av1.display();

//calling 3rd
        COverload av2=new COverload(12,"java for all");
        av2.display();

//calling 4th
        COverload av3=new COverload(12,"java for all",10000);
        av3.display();

    }
}
