package ch06.sec11.final_field_constant;

public class KoreanExample {
    public static void main (String[] args) {
        Korean k1 = new Korean("123456-123456", "Kim");
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        /* cannot change the value of final field */
        // k1.nation = "USA";
        // k1.ssn = "123-12-1234";

        /* can change the value of non-final field */
        k1.name = "Park";
        System.out.println("changed name : " + k1.name);
    }
}
