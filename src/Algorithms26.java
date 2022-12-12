import java.util.*;

public class Algorithms26 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;
        int temp = nums[0];
        int c = 1;
        for (int j = 1; j < nums.length; j++) {
            if (temp != nums[j]) {
                temp = nums[j];
                nums[c++] = nums[j];
            }
        }
        return c;
    }
}