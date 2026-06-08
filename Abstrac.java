//Abstraction
 abstract class Animal{
    abstract void sound();
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("The Dogs are Bark");
    }
    @Override
      public void sleep(){
        System.out.println("Dog is sleeping");
    }

}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat is mewwww mewwww mewww");
    }
}

public class Abstrac {
    public static void main(String[] args) {
      Dog d=new Dog();
      Cat c=new Cat();
      c.sound();
      d.sound();
    }
    
}
