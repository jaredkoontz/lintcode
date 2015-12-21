package problems.medium.medium.problems.easy.removeLinkedListElement;

import org.junit.Test;
import problems.medium.medium.shared.ListNode;

public class RemoveLinkedListElementTest {

	@Test
	public void happyPath() {
		ListNode head = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(3);
		ListNode listNode5 = new ListNode(4);
		ListNode listNode6 = new ListNode(5);
		ListNode listNode7 = new ListNode(3);

		head.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;
		listNode5.next = listNode6;
		listNode6.next = listNode7;

		RemoveLinkedListElement removeLinkedListElement = new RemoveLinkedListElement();
		removeLinkedListElement.removeElements(head, 3);
		System.out.println(head.printForward());
	}

}
