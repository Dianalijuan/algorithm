/**
 * Created by Snowy on 2018/8/15.
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 */
public class RemoveDuplicates {

    public static int Remove() {

        int[] nums = {1, 1, 2, 5,6,8,8,9};
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        if (nums.length == 0) {
            return 0;
        }
        return i + 1;
    }

    public static void main(String[] args) {
        System.out.println(Remove());
    }
}
