package chapter9.javapackage;

import chapter9.javapackage.sub.Sub;

public class Package {
    public static void main(String[] args) {
        //System.out.println("This is a package.");
        Sub sub = new Sub();
        sub.subClassMethod();
    }
}
