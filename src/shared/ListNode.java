package shared;

/**
 * Definition for singly-linked list.
 */
public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	public String printForward() {
		if (next != null) {
			return val + "->" + next.printForward();
		} else {
			return ((Integer) val).toString();
		}
	}
}
