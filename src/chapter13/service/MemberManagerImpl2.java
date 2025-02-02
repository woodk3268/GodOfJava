package chapter13.service;

import chapter13.model.MemberDto;

import java.lang.reflect.Member;

public class MemberManagerImpl2 extends MemberManagerAbstract {
    @Override
    public boolean addMember(MemberDto member) {
        return false;
    }

    @Override
    public boolean removeMember(String name, String phone) {
        return false;
    }

    @Override
    public boolean updateMember(MemberDto member) {
        return false;
    }
}
