package chapter10;

public class InheritanceAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        animal.eat();
        System.out.println("Name: " + animal.name);
        Dog dpg = new Dog();
        dpg.move();
        dpg.bark();
        System.out.println("Name: " + dpg.name);
        Cat cat = new Cat();
        cat.move();
        cat.meow();
        System.out.println("Name: " + cat.name);

    }
}
