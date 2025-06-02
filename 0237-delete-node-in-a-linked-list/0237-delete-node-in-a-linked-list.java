/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public void deleteNode(ListNode node) {
        // Copy the next node's value to current node
        node.val = node.next.val;
        // Bypass the next node
        node.next = node.next.next;
    }
}