package LeetCode.java;

// 26-07-02 15min
// https://leetcode.com/problems/remove-duplicates-from-sorted-list

class ListNode {

    int val;

    ListNode next;

    ListNode() {

    }

    ListNode(int val) {

        this.val = val;
    }

    ListNode(int val, ListNode next) {

        this.val = val;
        this.next = next;
    }
}

public class RemoveDuplicatesfromSortedList_83 {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode prev = head;
        ListNode current = head != null ? head.next : null;
        while (current != null) {
            while (prev != null && current != null && prev.val >= current.val) {
                current = current.next;
            }
            System.out.println(current != null ? current.val : "null");
            if (prev != null) {
                prev.next = current;
            }
            prev = current;
        }

        return head;
    }
}