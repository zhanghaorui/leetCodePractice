package day04;

/**
 * @ClassName ListNode
 * @Author zhanghaorui
 * @Date 2021/5/26 10:16 下午
 * @Description ListNode
 * @Version 1.0
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
