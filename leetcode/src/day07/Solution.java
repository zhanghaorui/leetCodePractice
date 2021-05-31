package day07;

/**
 * @ClassName Solution
 * @Author zhanghaorui
 * @Date 2021/5/31 1:54 下午
 * @Description
 *                  给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true ；否则，返回 false 。
 *
 *                  整数 n 是 4 的幂次方需满足：存在整数 x 使得 n == 4x
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/power-of-four
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Version 1.0
 */
public class Solution {

    public boolean isPowerOfFour(int n) {
        if (n < 0) return false;
        while (n >= 4) {
            if ((n & 3) != 0) return false;
            n >>= 2;
        }
        return n == 1;
    }

}
