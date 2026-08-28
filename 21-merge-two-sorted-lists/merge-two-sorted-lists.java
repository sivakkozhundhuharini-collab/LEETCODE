 class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (a != null && b != null) {

            if (a.val < b.val) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }

            temp = temp.next;
        }

        if (a != null)
            temp.next = a;
        else
            temp.next = b;

        return dummy.next;
    }
}