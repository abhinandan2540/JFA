package Chapter_11;
interface DataBase{
//    properties defined inside the interface
    int a=45;
    void storageCapacity();
    void storageFunctionality();
}
class SQL implements DataBase{
    @Override
    public void storageCapacity() {
        System.out.println("0.9 GB to 6.5 GB per vCPU");
    }

    @Override
    public void storageFunctionality() {
        System.out.println("TABLE,ROW,COLUMNS,DATA TYPES");
    }
}

public class interfaces_3 {
    public static void main(String[] args) {
        SQL sq=new SQL();
        sq.storageCapacity();
        sq.storageFunctionality();
        System.out.println(sq.a);

//        properties inside the interface can't be changed, they are final


    }
}
