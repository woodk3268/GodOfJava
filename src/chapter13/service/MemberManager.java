package chapter13.service;

import chapter13.model.MemberDto;

public interface MemberManager {
    public boolean addMember(MemberDto member);
    public boolean removeMember(String name, String phone);
    public boolean updateMember(MemberDto member);

}
