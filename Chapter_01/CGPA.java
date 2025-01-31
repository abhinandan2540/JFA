package Chapter_01;

public class CGPA {
    public static void main(String[] args) {
//        finding out CGPA from 3 subjects
        int sub1=85;
        int sub2=98;
        int sub3=99;
        int totalNumber=sub1+sub2+sub3;
//        total no of subject 3
//        we define float values by .f integrating
        float CGPA=(totalNumber/3.0f)/10;
        System.out.println(CGPA);
    }
}
