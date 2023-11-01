package ch06.sec11.final_field_constant;

public class Korean {
    final String nation = "Republic of Korea";
    final String ssn;

    String name;

    public Korean(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
