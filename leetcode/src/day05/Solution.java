package day05;

/**
 * @ClassName Solution
 * @Author zhanghaorui
 * @Date 2021/5/27 7:11 上午
 * @Description 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * <p>
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * <p>
 * <p>
 * <p>
 * 示例:
 * <p>
 * 输入: x = 1, y = 4
 * <p>
 * 输出: 2
 * <p>
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 * <p>
 * 上面的箭头指出了对应二进制位不同的位置。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/hamming-distance
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Version 1.0
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int result = 0;
        if (x == y) {
            return result;
        }
        while (x != 0 || y != 0) {
            if (x % 2 != y % 2)
                result++;
            x /= 2;
            y /= 2;
        }
        return result;
    }
}
