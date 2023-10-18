package ch04.sec02;

public class IfNestedExample {
    public static void main (String[] args) {
        int score = (int) (Math.random() * 20) + 81;
        String grade;

        System.out.println("Score : " + score);
        if (score >= 90) {
            if (score >= 95) grade = "A+";
            else grade = "A0";
        } else {
            if (score >= 85) grade = "B+";
            else grade = "B0";
        }
        System.out.println("Grade : " + grade);
    }
}
