
package org.rashi.datastructure.linkedlist.programs;

import org.rashi.datastructure.linkedlist.common.LinkedList;
import org.rashi.datastructure.linkedlist.common.Node;

public class MiddleElement {

	public static void main(String args[]) {

		LinkedList list = new LinkedList();
		Node head = list.createLinkedList();
		getMiddleElement(head);
	}

	public static Node getMiddleElement(Node head) {

		Node firstpointer = head;
		Node secondPointer = (head == null) ? null : head.getNext();
		while (secondPointer != null) {
			firstpointer = firstpointer.getNext();
			secondPointer = secondPointer.getNext() == null ? null : secondPointer.getNext().getNext();
		}
		System.out.println("Middle element of the list is : " + firstpointer.getValue());
		return firstpointer;
	}
}
