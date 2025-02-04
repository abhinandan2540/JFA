package Chapter_05;

public class BrkCont {
    public static void main(String[] args) {

//        break
        int i=0;
        while(i<10){
            System.out.println(i);
            if(i==4){
                System.out.println("breaking from loop");
                break;
            }
            i++;
        }

//        continue
       for(int j=0;j<10;j++){
           if(j==4){
               System.out.println("skipping 4");
               continue;
           }
           System.out.println(j);
       }

//       while loop
        int z=0;
        while (z<10){
            if(z==4){
                System.out.println("skipping 4");
                z++;
                continue;
            }
            System.out.println(z);
            z++;
        }

//        do while loop
        int x=0;
        do{
            if(x==4){
                System.out.println("skipping 4");
                x++;
                continue;
            }
            System.out.println(x);
            x++;
        }while(x<10);

    }
}
