package chapter8;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor reference = new ReferenceConstructor();
        reference.makeMemberObject();
    }

    public void makeMemberObject() {
        MemberDto dto1 = new MemberDto();
        MemberDto dto2 = new MemberDto("Sangmin");
        MemberDto dto3 = new MemberDto("Sangmin", "010-1234-5678");
        MemberDto dto4 = new MemberDto("Sangmin", "010-1234-5678", "god@godofjava.com");
        System.out.println(dto4);
    }
}
