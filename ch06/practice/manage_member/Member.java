package ch06.practice.manage_member;

public class Member {
    String name;
    String id;
    String password;
    int age;

    public Member() {
    }
    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("12345")) return true;
        else return false;
    }
    public void logout(String id) {
        System.out.println(id + " is logout");
    }
}
