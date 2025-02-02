package chapter10;

public class Dog extends Animal {
    public String name;

    public Dog() {
        System.out.println("Dog Constructor");
        name=  "Dog";
    }

    public void move() {
        System.out.println("Dog moves");
    }

    public void bark() {
        System.out.println("Dog barks");
    }

}
