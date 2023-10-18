package ch03.sec10;

public class ConditionalOperationExample {
    public static void main (String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : 'C';
        System.out.printf("%d is grade %c\n", score, grade);
    }
}
