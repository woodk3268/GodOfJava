package chapter8;

public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass reference = new ReferencePass();
        reference.callPassByReference();
    }

    public void callPassByValue() {
        int a = 10;
        String b = "b";
        System.out.println("before passByValue a: " + a + ", b: " + b);
        passByValue(a, b);
        System.out.println("after passByValue a: " + a + ", b: " + b);
    }

    public void passByValue(int a, String b) {
        a = 20;
        b = "z";
        System.out.println("after passByValue a: " + a + ", b: " + b);
    }

    public void callPassByReference() {
        MemberDto member = new MemberDto("sangmin");
        System.out.println("before passByReference member.name: " + member.name);
        passByReference(member);
        System.out.println("after passByReference member.name: " + member.name);

    }
    public void passByReference(MemberDto member) {
        member.name = "sanghyun";
        System.out.println("after passByReference member.name: " + member.name);
    }
}
