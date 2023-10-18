package ch03.practice;

public class ExPencil {
    public static void main (String[] args) {
        int pencils = 534;
        int students = 30;

        int pencilPerStudent = pencils / students;
        int pencilsLeft = pencils % students;

        System.out.println("Pencils per Students : " + pencilPerStudent);
        System.out.println("Pencils Left : " + pencilsLeft);
    }
}
