
package org.rashi.datastructure.linkedlist.programs;

import org.rashi.datastructure.linkedlist.common.LinkedList;
import org.rashi.datastructure.linkedlist.common.Node;

public class ReverseInGroup {

	public static void main(String args[]) {

		int k = 2;
		LinkedList list = new LinkedList();
		Node head = list.createLinkedList();
		list.printLinkedList();
		Node revHead = reverseInGroupRec(head, k);
		list.printLinkedList(revHead);
	}

	public static Node reverseInGroupRec(Node head, int k) {

		Node curr = head;
		Node prev = null, next = null;
		int count = 0;
		while (count != k && curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
			count++;
		}
		if (next != null) {
			head.setNext(reverseInGroupRec(next, k));
		}
		return prev;
	}
}
