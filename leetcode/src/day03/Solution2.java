package day03;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @ClassName Solution1
 * @Author zhanghaorui
 * @Date 2021/5/25 9:19 上午
 * @Description
 *              给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 *              你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 *              你可以按任意顺序返回答案。
 *                  示例 1：
 *                      输入：nums = [2,7,11,15], target = 9
 *                      输出：[0,1]
 *                      解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Version 2.0
 */
public class Solution2 {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(i)) {
                result[0] = i;
                result[1] = hashMap.get(nums[i]);
                return result;
            }
            hashMap.put(target-nums[i],i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 13;
        int[] result = twoSum(nums,target);
        Arrays.stream(result).forEach(
                item -> {
                    System.out.println(item);
                }
        );
    }

}
