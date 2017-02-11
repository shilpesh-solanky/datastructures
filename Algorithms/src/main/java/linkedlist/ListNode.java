package linkedlist;

/**
 * Created by SHILPESH on 05-Feb-17.
 */
public class ListNode {

    private double data;
    private ListNode next;

    public ListNode(double data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public double getData() {
        return data;

    }

    public void setData(double data) {
        this.data = data;
    }
}
