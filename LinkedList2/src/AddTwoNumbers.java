public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode l1 = new ListNode(2);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);
        l1.next = node1;
        node1.next = node2;

        ListNode l2 = new ListNode(5);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(4);
        l2.next = node3;
        node3.next = node4;

        ListNode.printLinkedList(solution.addTwoNumbers(l1, l2));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        int value = 0;
        int carry = 0;
        while(l1 != null || l2 != null || value != 0) {
            if (l1 != null) {
                value += l1.value;
                l1 = l1.next;
            }
            if (l2 != null) {
                value += l2.value;
                l2 = l2.next;
            }
            // 写这两句话的时候要注意顺序，下面书写的顺序就会导致value在大于10的时候，值被重新改写，原来应有的carry可能会没了
            // e.g [9->8] + [1->1]
            // value = 9+1 = 10
            // value = value % 10 = 0 (这里重新赋值了造成错误)
            // carry = 0 / 10 = 0 (shoule be 10 / 10 = 1)
            carry = value / 10;
            value = value % 10;
            cur.next = new ListNode(value);
            cur = cur.next;
            value = carry;
        }
        return dummy.next;
    }
}
