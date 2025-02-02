package chapter13.util;

import chapter13.model.MemberDto;

import java.lang.reflect.Member;

public class FinalReferenceType {
    final MemberDto dto = new MemberDto();

    public static void main(String[] args) {
        FinalReferenceType finalReferenceType = new FinalReferenceType();
        finalReferenceType.checkDTO();
    }

    public void checkDTO() {
        System.out.println(dto);
        //dto = new MemberDto();
        dto.name = "sangmin";
        System.out.println(dto);
    }
}
