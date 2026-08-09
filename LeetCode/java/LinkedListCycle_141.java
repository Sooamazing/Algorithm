package LeetCode.java;

import java.util.HashSet;
import java.util.Set;

// 26-08-09 10min
// https://leetcode.com/problems/linked-list-cycle
public class LinkedListCycle_141 {

    Set<ListNode> nodes = new HashSet<>();

    public boolean hasCycle(ListNode head) {

        return cycle(head);
    }

    private boolean cycle(ListNode current) {

        if (current == null) {
            return false;
        }
        if (nodes.contains(current)) {
            return true;
        }
        if (current.next == null) {
            return false;
        }
        nodes.add(current);
        return cycle(current.next);
    }

    class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {

            val
                    = x;
            next = null;
        }
    }
}