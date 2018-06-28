import org.junit.Test;
import java.util.*;
/**
 *  给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 */
public class SumEqualtarget {
    @Test
    public void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    System.out.println(Arrays.toString(new int[]{i, j}));
                }
            }
        }


        return;
    }
}