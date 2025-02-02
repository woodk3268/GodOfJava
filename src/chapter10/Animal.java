package chapter10;

public class Animal {
    public String name;
    public String kind;
    public int legCount;
    public double iq;
    public boolean hasWing;


    public Animal(){
        System.out.println("Animal Constructor");
        name=  "Animal";
    }

    public void move(){
        System.out.println("Animal is moving");
    }

    public void eat(){
        System.out.println("Animal is eating");
    }
}
