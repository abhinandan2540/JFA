package Chapter_05;

public class Questions {
    public static void main(String[] args) {
//        Q1
        int n=4;
        for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
//        Q 2
        int m=0;
        int ans=0;
        while (m<10){
            if(m%2==0){
                ans+=m;
            }
            m++;
        }
        System.out.println(ans);
//        Q 3
//        let say without scanner, multi table of 9
        int a=1;
        while (a<11){
            System.out.println("9"+"x"+a+"="+9*a);
            a++;
        }
//        Q 4
//        facotrial, not using scanner
//        factorial of 5
        int facto=1;
        for(int i=1;i<6;i++){
            facto=facto*i;
        }
        System.out.println(facto);
//        Q 5
        int f=5;
        while(f>0){
            System.out.println(f);
        }
//        Q 9
        int a1=1;
        int ans1=0;
        while (a<11){
            System.out.println("8"+"x"+a+"="+8*a1);
            ans+=(8*a1);
            a++;
        }
        System.out.println(ans1);
//        ans = 440

    }
}
