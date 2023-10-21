package ch05.sec05;

public class ReplaceExample {
    public static void main (String[] args) {
        String oldStr = "Java Programing";
        String newStr = oldStr.replace("Java", "Python");

        System.out.println("Old Str : " + oldStr);
        System.out.println("New Str : " + newStr);
    }
}
