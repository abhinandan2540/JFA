package Chapter_03;

public class StringQuestions {
    public static void main(String[] args) {
//        question 1
        String name="JAVA FOR ALL, START REPO PLS";
        System.out.println(name.toLowerCase());  //java for all, start repo pls

//        question 2
        String name1="java for all";
        System.out.println(name.replace(" ","_")); //java_for_all

//        question 3
        String name2="AI";
        System.out.printf("the %s makes it a lot!",name);

//        another method
        String name3="Dear <|name|> plays a lot";
        String newString=name.replace("<|name|>","minecraft");
        System.out.println(newString); //Dear minecraft plays a lot

//         question 4
        String name4="the summer  is very hot   humid";
        System.out.println(name.indexOf("  ")); //2 space : 10
        System.out.println(name.indexOf("   "));//3 space : 23
        System.out.println(name.indexOf("    "));// 4 space : -1

//        question 5
        String sentence="Dear Abhi \n this Java for all opensource repo \n is very fine for track up \n thanks";
        System.out.println(sentence);
//  Dear Abhi
// this Java for all opensource repo
// is very fine for track up
// thanks

    }
}
