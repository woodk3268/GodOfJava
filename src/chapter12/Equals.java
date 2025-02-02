package chapter12;

public class Equals {
    public static void main(String[] args) {
        Equals thisObject = new Equals();
        thisObject.equalMethod();
    }

    public void equalMethod() {
        MemberDto obj1 = new MemberDto("Sangmin");
        MemberDto obj2 = new MemberDto("Sangmin");
        if (obj1 == obj2) {
            System.out.println("obj1 and obj2 are the same");
        } else {
            System.out.println("obj1 and obj2 are different");
        }
        if (obj1.equals(obj2)) {
            System.out.println("obj1 and obj2 are equal");
        } else {
            System.out.println("obj1 and obj2 are not equal");
        }
    }
}
