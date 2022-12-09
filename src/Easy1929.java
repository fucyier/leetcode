import java.util.Arrays;

public class Easy1929 {
    public static int[] getConcatenation(int[] nums) {
        int[] newNums= new int[nums.length*2];
        int j=0;
        for (int i=nums.length;i<nums.length*2;i++) {
            newNums[j] = nums[i - nums.length];
            newNums[i] = nums[i - nums.length];
            j++;
        }
        return newNums;
    }

    public static void main(String... args) {
        int[] nums = {1, 3, 2, 4};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
