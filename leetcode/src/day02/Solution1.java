package day02;

/**
 * @ClassName Soultion1
 * @Author zhanghaorui
 * @Date 2021/5/24 9:35 上午
 * @Description
 *
 *      斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 *
 *          F(0) = 0，F(1)= 1
 *          F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 *      给你 n ，请计算 F(n)
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fibonacci-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Version 1.0
 */
public class Solution1 {

    /**
     *    最简单的递归写法
     * @param n
     * @return
     */
    public static int fib(int n) {
        if (0 == n) {
            return 0;
        }
        if(0<n && n<=2) {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(4));
    }

}
