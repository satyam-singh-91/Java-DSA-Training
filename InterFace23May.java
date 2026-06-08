 /*interface Vehical {
    void start();
    void stop();
}*/
interface Dog {
   abstract void sound();
}
interface Cat {
    abstract void sound();
}
class puppy implements  Cat, Dog{
    @Override
    public void sound() {
        System.out.println("Puppy is woofs");
    }
}
/* 
class car implements Vehical{
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }
}
class bike implements Vehical{
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }
}*/

public class InterFace23May {
    public static void main(String[] args) {
       /*car c = new car();
        c.start();
        c.stop();

        bike b = new bike();
        b.start();
        b.stop(); */ 
        puppy p = new puppy();
        p.sound();
        
    }
}
