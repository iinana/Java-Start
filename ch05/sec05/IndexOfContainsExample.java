package ch05.sec05;

public class IndexOfContainsExample {
    public static void main (String[] args) {
        String subject = "Java Programing";

        String subString = "Programing";
        int location = subject.indexOf(subString);
        System.out.println("location : " + location);

        location = subject.indexOf("Java");
        if (location == -1) System.out.println("Not About Java");
        else System.out.println("About Java");

        boolean result = subject.contains("Java");
        if (result) System.out.println("About Java");
        else System.out.println("Not About Java");
    }
}
