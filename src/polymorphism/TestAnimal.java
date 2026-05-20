package polymorphism;

public class TestAnimal {
    static void main(String[] args) {
        Cat cat=new Cat();
        Cow cow=new Cow();
        Dog dog=new Dog();
        cat.sound();
        cow.sound();
        dog.sound();
        }
    }

