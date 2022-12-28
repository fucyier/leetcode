import java.util.Arrays;

public class Algorithms69 {
    public static int mySqrt(int x) {
        long i;
        for (i = 0; i * i <= x; i++)
            if (x == i * i || x < (i + 1) * (i + 1)) break;
        return (int) i;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }
}