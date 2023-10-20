package ch05.sec04;

public class GarbageObjectExample {
    public static void main (String[] args) {
        String hobby = "trip";
        hobby = null;  // "trip" becomes a garbage
        System.out.println("hobby: "+ hobby);

        String kind1 = "car";
        String kind2 = kind1;
        kind1 = null;  // "car" doesn't become a garbage (kind2 is pointing "car")
        System.out.println("kind2: " + kind2);
    }
}
