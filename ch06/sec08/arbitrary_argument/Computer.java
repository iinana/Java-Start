package ch06.sec08.arbitrary_argument;

public class Computer {
    int sum(int ... values) {
        int sum = 0;
        for (int v : values) sum += v;
        return sum;
    }
}
