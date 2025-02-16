package Chapter_11;
/*
   WE CAN IMAGINE THAT ABSTRACT IS JUST AN IDEA NOT A SOLID IMPLEMENTATION
   STILL IN GROWING PHASE,NOT IN ACTUAL IMPLEMENTATION PHASE
 */

/*
IN THIS EXAMPLE,
VEHICLE IS ABSTRACT (STILL THEORY let's assume)

* making jeep from theory to practical example
1. for jeep case, as our vehicle still in theory phase, let's assume that we make a car (jeep) which start by inputting key
and stop by outputting key, so for jeep, theory came into reality (existence)

* making lambo from theory to practical example
* making mercedes from theory to practical example
 */

abstract class Vehicle{
    abstract public void start();
    abstract public void stop();
}
class Jeep extends Vehicle{
    @Override
    public void start() {
        System.out.println("key input");
    }

    @Override
    public void stop() {
        System.out.println("key out");
    }
}

class Lambo extends Vehicle{
    @Override
    public void start() {
        System.out.println("key & power button");
    }

    @Override
    public void stop() {
        System.out.println("power button press");
    }
}

class MercedesECO extends Vehicle{
    @Override
    public void start() {
        System.out.println("key & screen press");
    }

    @Override
    public void stop() {
        System.out.println("automatically AI off");
    }
}

public class abstract_2 {
    public static void main(String[] args) {
        /*
        AS VECHILE IS OUR CONCEPT (ABSTRACT)SO WE CAN'T INITIATE IT.
        we can initiate practical examples (daughter classes) .
         */

//        Jeep jp=new Jeep();
//        jp.start();
//        jp.stop();

//        Lambo lm=new Lambo();
//        lm.start();
//        lm.stop();

        MercedesECO mes=new MercedesECO();
        mes.start();
        mes.stop();
    }

}
