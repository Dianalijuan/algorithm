import java.util.Scanner;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 121 true
 * 120 false
 * -121 false
 */
public class PalindromeNumbers {
    public static void palindrome() {
        Scanner scanner = new Scanner(System.in);
        System.err.print("请随机输入一个整数：");
        //将int 转换成String;一下3种方法均可
        /*String num = scanner.nextInt() + "";
        String num = String.valueOf(scanner.nextInt());*/
        String num = Integer.toString(scanner.nextInt());
        char[] array = num.toCharArray(); //将字符串转换成字符数组
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == array[array.length - (i + 1)]) {

            } else {
                System.out.println(array + "不是回转数子");
                break;
            }
        }
        System.out.println(array + "是回转数子");
    }

    public static void main(String[] args) {
        palindrome();
    }

}
