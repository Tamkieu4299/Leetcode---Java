/*
 Hint:

Think of two pointers technique with slow runner and fast runner.

Both slow runner and fast runner are initialized to head node.

Each iteration, fast runner moves two steps forward while the slow one moves one steps only.

When fast runner meets the empty node (i.e., NULL) on the tail, the slow one will be right on the node of midpoint.
 */
public class Solution {
	
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
	