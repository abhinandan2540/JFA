package Chapter_03;

public class StringMethods {
    public static void main(String[] args) {

        String name="Abhinandan";
//        Abhinandan : index : 0,1,2,3,4,5,6,7,8,9
        System.out.println(name.length()); //10
        System.out.println(name.toUpperCase()); //ABHINANDAN
        System.out.println(name.toLowerCase()); //abhinandan
        String nameModified="  Abhinandan  ";
        System.out.println(nameModified.trim()); //cut the leading and trailing spaces into the given string
        System.out.println(name.substring(3)); // inandan
        System.out.println(name.substring(2,8)); //hinand

        System.out.println(name.replace('n','m')); //Abhimamdam
        System.out.println(name.startsWith("Ab")); //true
        System.out.println(name.startsWith("hi")); //false
        System.out.println(name.endsWith("an")); //true
        System.out.println(name.endsWith("da")); //false


        System.out.println(name.charAt(4)); //n
        System.out.println(name.indexOf("a")); // 5 , a present 2 times, it generally returns the first index
        System.out.println(name.indexOf("a",6)); //8,
        System.out.println(name.lastIndexOf("n")); // n present 3 times, last index 9
        System.out.println(name.lastIndexOf("n",8));

        System.out.println(name.equals("ABhinandan")); //false
        System.out.println(name.equalsIgnoreCase("ABhinandan")); //true

    }
}
