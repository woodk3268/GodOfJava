package chapter10;

public class ParentArg {
    public ParentArg(String name) {
        System.out.println("Parent Constructor"+name);
    }

    public ParentArg(InheritancePrint obj) {
        System.out.println("ParentArg(InheritancePrint) Constructor");
    }

    public void printName() {
        System.out.println("Parent printName()");
    }
}
