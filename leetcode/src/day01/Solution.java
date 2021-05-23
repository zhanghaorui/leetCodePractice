package day01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @ClassName Solution
 * @Author zhanghaorui
 * @Date 2021/5/23 8:57 下午
 * @Description
 *              给一非空的单词列表，返回前 k 个出现次数最多的单词。
 *
 *              返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
 *
 *              输入: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
 *              输出: ["i", "love"]
 *              解析: "i" 和 "love" 为出现次数最多的两个单词，均为2次。
 *              注意，按字母顺序 "i" 在 "love" 之前。
 *
 *              来源：力扣（LeetCode）
 *              链接：https://leetcode-cn.com/problems/top-k-frequent-words
 *              著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Version 1.0
 */
public class Solution {

    public static List<String> topKFrequent(String[] words, int k) {
        return Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((o1, o2) -> {
                    if (o1.getValue().equals(o2.getValue())) {
                        return o1.getKey().compareTo(o2.getKey());
                    } else {
                        return o2.getValue().compareTo(o1.getValue());
                    }
                })
                .map(Map.Entry::getKey)
                .limit(k)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String[] strings = {"i", "love", "leetcode", "i", "love", "coding"};
        System.out.println(topKFrequent(strings,2));
    }
}
