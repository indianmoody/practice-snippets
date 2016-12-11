import java.util.ArrayList;

public class Polymorphism1{

     public static void main(String []args){
        Animal d = new Dog();
        Animal c = new Cat();
        
        ArrayList<Animal> li = new ArrayList<Animal>();
        li.add(d);
        li.add(c);
        
        for (Animal a : li) {
            if (a instanceof Dog) {
                ((Dog)a).bark();
            }
            else if (a instanceof Cat) {
                ((Cat)a).meow();
            }
        }
     }
}

class Animal {
    public void run() {
        System.out.println("animal running!");
    }
}

class Dog extends Animal {
    public void run() {
        System.out.println("dog running!");
    }
    
    public void bark() {
        System.out.println("bark bark ...");
    }
}

class Cat extends Animal {
    public void run() {
        System.out.println("cat running!");
    }
    
    public void meow() {
        System.out.println("meow meow ...");
    }
}
