package Chapter_10;

//                          SUPER EXAMPLE
class Animal1 {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal1 {
    public void makeSound() {
        super.makeSound();  // Calls Animal's makeSound()
        System.out.println("Dog barks");
    }
}

//                            THIS EXAMPLE
class Animal2 {
    private String type;

    // Default constructor
    public Animal2() {
        this("Unknown Animal"); // Calls parameterized constructor
    }

    // Parameterized constructor
    public Animal2(String type) {
        this.type = type;
        System.out.println("Animal Type: " + this.type);
    }
}

public class This_Super {
    public static void main(String[] args) {

     Dog1 dg=new Dog1();
     dg.makeSound();

//     Animal2 an=new Animal2();
        Animal2 an1=new Animal2("dog");



    }
}
