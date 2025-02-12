package Chapter_09;

class MyEmployee{
    private int id;
     private String name;
//     privet blocking the direct access of the instance variables

//     setting the parameters : setter
    public void setID(int i){
        this.id=i;
    }
    public void setName(String n ){
        this.name=n;
    }
//    getting the parameters : getter
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
}

public class AcessModifiers {
    public static void main(String[] args) {

        MyEmployee abhi=new MyEmployee();
//        setting the params using setID, setName
        abhi.setID(12);
        abhi.setName("java for all");

//        getting the params using getID, getName
        System.out.println(abhi.getID());
        System.out.println(abhi.getName());

    }
}
