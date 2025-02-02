package chapter13;

import chapter13.service.MemberManager;
import chapter13.service.MemberManagerImpl;

public class InterfaceExample {
    public static void main(String[] args) {
        MemberManager memberManager = new MemberManagerImpl();
    }
}
