import org.junit.Test;

import static java.lang.Math.*;

/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 输入: 123
 * 输出: 321
 *
 * 输入: -123
 * 输出: -321
 *
 * 输入: 120
 * 输出: 21
 */
public class IntegerReverse {
    public static void main(String[] args) {
        int num = -210;
        if (pow(-2, 31) < num && num < pow(2, 31 - 1)) {
            int temp = num / 100 + (num % 100 / 10) * 10 + (num % 100 % 10) * 100;
            System.out.println(temp);
        }
        return;
    }
}