/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 输入: 123      输入: -123        输入: 120
 * 输出: 321      输出: -321        输出: 21
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。
 * 根据这个假设，如果反转后的整数溢出，则返回 0。
 */
public class IntegerReverse {

    private static int reserve() {
        int num = -63954;
        int result = 0;
        while (num != 0 && Math.pow(-2, 31) < num && num < Math.pow(2, 31)) {
            int temp = num % 10;
            result = result * 10 + temp;
            //判断反转时是否溢出
            if (result > Math.pow(2, 31) - 1 || result < Math.pow(-2, 31) + 1) {
                System.out.println(0);
                return 0;
            }
            num /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
          //静态方法里面只能调用静态方法
        System.out.println(reserve());
    }
}