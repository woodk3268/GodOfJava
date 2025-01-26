package chapter4;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public void setAge(byte age) {
        this.age = age;
    }
    public byte getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }
    public boolean isMarried() {
        return isMarried;
    }

    public static void main(String[] args) {
        ProfilePrint profile = new ProfilePrint();
        profile.setAge((byte) 28);
        profile.setName("woo");
        profile.setMarried(false);

        System.out.println("My age is " + profile.getAge());
        System.out.println("My name is " + profile.getName());
        System.out.println("My married is " + profile.isMarried());
    }
}
