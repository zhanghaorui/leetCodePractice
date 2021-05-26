package day04;

/**
 * @ClassName Solution2
 * @Author zhanghaorui
 * @Date 2021/5/26 10:32 下午
 * @Description Solution2
 * @Version 1.0
 */
public class Solution2 {


    /**
     *  递归
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return this.addTwoNumbers2(l1, l2, 0);
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2, int a) {
        if (l1 == null && l2 == null) {
            return a == 0 ? null : new ListNode(a);
        }
        if (l1 != null) {
            a += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            a += l2.val;
            l2 = l2.next;
        }
        return new ListNode(a % 10, addTwoNumbers2(l1, l2, a / 10));
    }

}
