package chapter8;

public class Student {
    private String name;
    private String address;
    private String phone;
    private String email;

    public Student(String name) {
        this.name = name;
    }
    public Student(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Phone: " + phone + ", Email: " + email;
    }
}
