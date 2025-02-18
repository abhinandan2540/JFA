package Chapter_11;
interface theory{
    void takeNotes();
    default void greetTheory(){
        System.out.println("hope you enjoying the theory");
    }
}
interface practical{
    void doinhand();
    default void greetPractical(){
        System.out.println("hope you enjoying the practical");
    }
}
class practice {
    public void combined(){
        System.out.println("practice comes with theory + practical");
    }
}
class test extends practice implements theory,practical{
    @Override
    public void takeNotes() {
        System.out.println("take every note");
    }

    @Override
    public void doinhand() {
        System.out.println("do in hand practical for understanding");
    }

    @Override
    public void combined() {
        super.combined();
        System.out.println("then do the best into final test");
    }
}
public class interfaces_default {
    public static void main(String[] args) {
        test av=new test();
        av.takeNotes();
        av.greetTheory();
        av.doinhand();
        av.greetPractical();
        av.combined();
    }
}
