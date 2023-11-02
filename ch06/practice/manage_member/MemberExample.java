package ch06.practice.manage_member;

public class MemberExample {
    public static void main (String[] args) {
        Member member = new Member();
        boolean res = member.login("hong", "12345");
        if (res) {
            System.out.println("Login Success");
            member.logout("hong");
        } else System.out.println("Wrong ID or Password");
    }
}