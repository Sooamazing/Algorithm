package LeetCode.java;

// 26-07-22 35min
// https://leetcode.com/problems/reverse-linked-list
public class ReverseLinkedList_206 {

    /**
     * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode()
     * {} ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
     * this.next = next; } }
     */
    public ListNode reverseList(ListNode head) {

        return reverse(null, head);
    }

    private ListNode reverse(ListNode prev, ListNode current) {
        // System.out.println("-------");
        // System.out.println(current.val + ", "+current.next.val);
        // if (prev != null && current != null) {
        //     System.out.println("===" + prev.val + ", " + current.val);
        // }
        if (current == null) {
            // System.out.println("------- current.next == null, current: "+null);
            return prev;
        }
        ListNode next = current.next;
        current.next = prev;
        // if (prev != null && current != null) {
        //     System.out.println("~~~~~~~~~~~~ after: "+prev.val + ", " + current.val);
        // }

        return reverse(current, next);
    }

}