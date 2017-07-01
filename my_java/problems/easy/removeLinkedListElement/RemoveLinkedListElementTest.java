package problems.easy.removeLinkedListElement;

import org.junit.Test;
import shared.ListNode;

public class RemoveLinkedListElementTest {

    @Test
    public void happyPathRec() {
        ListNode head = init();

        RemoveLinkedListElement removeLinkedListElement = new RemoveLinkedListElement();
        removeLinkedListElement.removeElements(head, 3);
        System.out.println(head.printForward());
    }

    @Test
    public void happyPathIterative() {
        ListNode head = init();
        RemoveLinkedListElement removeLinkedListElement = new RemoveLinkedListElement();
        removeLinkedListElement.removeElementsIter(head, 3);
        System.out.println(head.printForward());
    }

    private ListNode init() {
        ListNode head = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(5);
        ListNode listNode7 = new ListNode(3);

        head.setNext(listNode2);
        listNode2.setNext(listNode3);
        listNode3.setNext(listNode4);
        listNode4.setNext(listNode5);
        listNode5.setNext(listNode6);
        listNode6.setNext(listNode7);
        return head;
    }

}
