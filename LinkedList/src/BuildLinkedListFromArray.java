public class BuildLinkedListFromArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        ListNode res = buildLinkedListFromArray(array);
        ListNode.printLinkedList(res);
    }

    private static ListNode buildLinkedListFromArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        ListNode cur = new ListNode(arr[0]);
        ListNode head = cur;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }
}
