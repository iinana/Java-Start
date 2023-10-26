package ch05.practice;

public class SumAndAverage {
    public static void main (String[] args) {
        int[][] array = {
            {95, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int len = 0;
        for (int i = 0; i < array.length; i++) {
            len += array[i].length;
            for (int num : array[i]) sum += num;
        }

        System.out.println("Total Sum : " + sum);
        System.out.println("Total Average : " + ((double) sum / len));
    }
}