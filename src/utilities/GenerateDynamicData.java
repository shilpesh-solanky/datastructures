package utilities;

import datastructure.linkedlist.ListNode;

/**
 * Created by SHILPESH on 05-Feb-17.
 */
public class GenerateDynamicData {

    public static ListNode generateLinkedList(int size) {
        ListNode root = new ListNode(Math.random());
        ListNode nextNode = root;
        for (int i = 0; i <= size; i++) {
            ListNode listNode = new ListNode(Math.random());
        }
        return root;
    }


    public static ListNode insertLinkedList(ListNode headNode, ListNode nodeToInsert, int position) {

        if (headNode == null) {
            return nodeToInsert;
        }
        int size = listLength(headNode);
        if (position == 1) {
            nodeToInsert.setNext(headNode);
        } else {

        }
        return headNode;
    }

    public static int listLength(ListNode headNode) {
        int length = 0;
        ListNode currentNode = headNode;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

}
