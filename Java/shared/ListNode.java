package shared;

/**
 * Definition for singly-linked list.
 */
public class ListNode {
	private int val;
	private ListNode next;

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

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode node) {
		this.next = node;
	}

	public int getVal() {
		return val;
	}
}
