class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode y = new ListNode(0);
        y.next = head;
        ListNode prev = y;
        
        while (prev.next != null) {
            ListNode cur = prev.next;
            
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            
            if (prev.next != cur) {
                prev.next = cur.next;
            } else {
                prev = prev.next;
            }
        }
        
        return y.next;
    }
}
