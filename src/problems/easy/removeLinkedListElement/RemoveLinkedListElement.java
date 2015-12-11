package problems.easy.removeLinkedListElement;


import shared.ListNode;

public class RemoveLinkedListElement {
	/**
	 * Recursive solution
	 */
	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return null;
		head.next = removeElements(head.next, val);
		return head.val == val ? head.next : head;
	}

	/**
	 * Iterative solution
	 */
	public ListNode removeElementsIter(ListNode head, int val) {
		if (head == null) {
			return null;
		}
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode p = dummy;
		while (p.next != null) {
			if (p.next.val == val) {
				p.next = p.next.next;
			} else {
				p = p.next;
			}
		}

		return dummy.next;
	}

}
