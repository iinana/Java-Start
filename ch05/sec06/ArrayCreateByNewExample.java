package ch05.sec06;

public class ArrayCreateByNewExample {
    public static void main (String[] args) {
        int[] arr1 = new int[3];
        System.out.print("arr1 initial value : ");
        for (int i = 0; i < 3; i++) System.out.print(arr1[i] + ", ");
        System.out.println();

        for (int i = 0; i < 3; i++) arr1[i] = 10 * (i + 1);
        System.out.print("arr1 changed value : ");
        for (int i = 0; i < 3; i++) System.out.print(arr1[i] + ", ");
        System.out.println("\n");


        double[] arr2 = new double[3];
        System.out.print("arr2 initial value : ");
        for (int i = 0; i < 3; i++) System.out.print(arr2[i] + ", ");
        System.out.println();

        for (int i = 0; i < 3; i++) arr2[i] = (i + 1) / 10.0;
        System.out.print("arr2 changed value : ");
        for (int i = 0; i < 3; i++) System.out.print(arr2[i] + ", ");

        String[] arr3 = new String[3];
        System.out.print("arr3 initial value : ");
        for (int i = 0; i < 3; i++) System.out.print(arr3[i] + ", ");
        System.out.println();

        for (int i = 0; i < 3; i++) arr3[i] = (i + 1) + " Month";
        System.out.print("arr3 changed value : ");
        for (int i = 0; i < 3; i++) System.out.print(arr3[i] + ", ");

    }
}
