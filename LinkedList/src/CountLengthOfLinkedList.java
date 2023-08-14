public class CountLengthOfLinkedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        int res = countLengthOfLinkedList(node1);
        System.out.println(res);
    }

    private static int countLengthOfLinkedList(ListNode head) {
        int count = 0;
//        corner case
        if (head == null) {
            return count;
        }
        ListNode cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
}

// TC:O(n)
// SC:O(1)