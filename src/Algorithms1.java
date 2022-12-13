import java.util.Arrays;

public class Algorithms1 {
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++)
            for (int j = 0; j < nums.length; j++)
                if (i != j && nums[i] + nums[j] == target)
                    return new int[]{i, j};

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 17)));

    }
}