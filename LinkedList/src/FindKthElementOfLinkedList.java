public class FindKthElementOfLinkedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        ListNode resNode = findKthElementOfLinkedList(node1, 4);

//        System.out.println(resNode.value);
    }

    public static ListNode findKthElementOfLinkedList(ListNode head, int k) {
        // corner case check
        if (head == null || k < 0) {
            return null;
        }
        ListNode cur = head;
        int index = 0;
        while (cur != null && index != k) {
            index++;
            cur = cur.next;
        }
    	return cur;
    }
}

// TC:O(n)
// SC:O(1)
