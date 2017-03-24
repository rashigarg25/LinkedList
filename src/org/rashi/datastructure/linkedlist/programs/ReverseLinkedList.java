
package org.rashi.datastructure.linkedlist.programs;

import org.rashi.datastructure.linkedlist.common.LinkedList;
import org.rashi.datastructure.linkedlist.common.Node;

public class ReverseLinkedList {

	public static void main(String args[]) {

		LinkedList list = new LinkedList();
		Node head = list.createLinkedList();
		Node prev = null, current = head;
		Node next = current.getNext() != null ? current.getNext() : null;
		while (next != null) {
		}
	}
}
