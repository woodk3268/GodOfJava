package chapter9.javapackage;

import chapter9.javapackage.sub.AccessModifier;

public class AccessCall {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicMethod();
    //    accessModifier.protectedMethod();
        //   accessModifier.defaultMethod();
        // accessModifier.privateMethod();

    }
}
