package problems.easy.insertionSortList;

import org.junit.Test;
import shared.ListNode;

/**
 * @author koontz
 */
public class InsertionSortListTest {

	@Test
	public void happyPath() {
		InsertionSortList i = new InsertionSortList();
		ListNode node0 = new ListNode(1);
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(0);
		node0.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		i.insertionSortList(node0);
		node0.printForward();
	}
}
