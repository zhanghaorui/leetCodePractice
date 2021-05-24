package day02;

/**
 * @ClassName Solution2
 * @Author zhanghaorui
 * @Date 2021/5/24 8:41 下午
 * @Description
 *     斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 *
 *           F(0) = 0，F(1)= 1
 *           F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 *     给你 n ，请计算 F(n)
 *
 *   来源：力扣（LeetCode）
 *   链接：https://leetcode-cn.com/problems/fibonacci-number
 *   著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Version 1.0
 */
public class Solution2 {

    /**
     *  动态规划解法
     * @param n
     * @return
     */
    public static int fib(int n) {
        int[] nums = new int[n+1];
        return dynamicPlanning(nums,n);
    }


    public static int dynamicPlanning(int[] nums,int n) {
        if (n == 0 || n == 1) {return n;}
        if (nums[n] != 0) {return nums[n];}
        nums[n] = dynamicPlanning(nums,n-1) + dynamicPlanning(nums,n-2);
        return nums[n];
    }


    public static void main(String[] args) {
        System.out.println(fib(4));
    }



}
