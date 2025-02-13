package Chapter_10;

class Animal{
    public int countLegs;
    public Boolean isFriendly;

    public void setCountLegs(int legs){
        System.out.println("setting countLegs...");
        this.countLegs=legs;
    }
    public void  setIsFriendly(boolean isFriend){
        System.out.println("setting isFriendly...");
        this.isFriendly=isFriend;
    }

}

class Dog extends Animal{
    public String howSound;
    public void setHowSound(String sound){
        System.out.println("setting how sounds...");
        this.howSound=sound;
    }

    public void getAnimal(){
        if ((this.countLegs == 4) && Boolean.TRUE.equals(this.isFriendly)){
            if(this.howSound.equals("bark")){
                System.out.println("Dogs");
            }else{
                System.out.println("not in Data");
            }
        }else{
            System.out.println("not in Data");
        }
    }
}

public class QuickQuiz1 {
    public static void main(String[] args) {

        Dog av=new Dog();
        av.setCountLegs(4);
        av.setIsFriendly(true);
        av.setHowSound("bark");
        av.getAnimal();

        /*
        Boolean.TRUE.equals(this.isFriendly)
        is used to chek the input value is true or false
         */


    }
}
