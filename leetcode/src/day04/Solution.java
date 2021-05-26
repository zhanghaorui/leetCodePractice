package day04;

/**
 * @ClassName Solution
 * @Author zhanghaorui
 * @Date 2021/5/26 10:17 下午
 * @Description 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Version 1.0
 */
public class Solution {

    /**
     *  双指针
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultListNode = new ListNode(0);
        ListNode tempNode = resultListNode;
        int temp = 0;
        while (l1 != null || l2 != null || temp != 0) {
            int l1Value = l1 != null ? l1.val : 0;
            int l2Value = l2 != null ? l2.val : 0;
            int sumValue = l1Value + l2Value + temp;
            temp = sumValue / 10;
            ListNode sumNode = new ListNode(sumValue % 10);
            tempNode.next = sumNode;
            tempNode = sumNode;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return resultListNode.next;
    }
}
