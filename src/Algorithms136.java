import java.util.HashMap;
import java.util.Map;

public class Algorithms136 {
    public static int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int value = 0;
        if (nums.length > 0) value = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != value) value = nums[i];
        }
        return value;

    }
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }
}