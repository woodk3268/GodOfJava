package chapter9.javapackage;

import static chapter9.javapackage.sub.SubStatic.CLASS_NAME;
import static chapter9.javapackage.sub.SubStatic.subStaticMethod;

public class PackageStatic {
    public static void main(String[] args) {
        subStaticMethod();
        System.out.println(CLASS_NAME);
    }
}
