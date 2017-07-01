package problems.easy.removeLinkedListElement;


import shared.ListNode;

public class RemoveLinkedListElement {
    /**
     * Recursive solution
     */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        head.setNext(removeElements(head.getNext(), val));
        return head.getVal() == val ? head.getNext() : head;
    }

    /**
     * Iterative solution
     */
    public ListNode removeElementsIter(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.setNext(head);
        ListNode p = dummy;
        while (p.getNext() != null) {
            if (p.getNext().getVal() == val) {
                p.setNext(p.getNext().getNext());
            } else {
                p = p.getNext();
            }
        }

        return dummy.getNext();
    }

}
