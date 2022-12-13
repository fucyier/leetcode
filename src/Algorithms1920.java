import java.util.Arrays;

public class Algorithms1920 {
    public static int[] buildArray(int[] nums) {
        int[] numsPro = new int[nums.length];
        for (int a = 0; a < nums.length; a++)
            numsPro[a] = nums[nums[a]];

        return numsPro;
    }

    public static void main(String... args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
