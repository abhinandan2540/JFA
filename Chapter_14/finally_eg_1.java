package Chapter_14;

public class finally_eg_1 {

    static void OutPut(int n){
        try{
            for(int i=0;i<n;i++){
                if(i==2){
                    System.out.println("2 present ending running");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("program run sucessfully");
        }
    }

    public static void main(String[] args) {
        OutPut(5);
    }
}
