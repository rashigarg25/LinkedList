
package org.rashi.datastructure.linkedlist.programs;

import org.rashi.datastructure.linkedlist.common.LinkedList;
import org.rashi.datastructure.linkedlist.common.Node;

public class DetectLoop {

	public static void main(String args[]) {

		LinkedList list = new LinkedList();
		Node head = list.createLoopedLinkedList();
		//Node head = list.createLinkedList();
		boolean isLoop = false;
		Node firstPointer = head;
		Node secondPointer = head != null ? head.getNext() : null;
		while (secondPointer != null) {
			firstPointer = firstPointer.getNext();
			secondPointer = secondPointer.getNext() != null ? secondPointer.getNext().getNext() : null;
			if (firstPointer == secondPointer) {
				isLoop = true;
				break;
			}
		}
		if (isLoop) {
			System.out.println("Loop in the linkedlist");
			int count = 1;
			while (firstPointer.getNext() != secondPointer) {
				count++;
				firstPointer = firstPointer.getNext();
			}
			System.out.println(count + " no of nodes in the loop.");
			firstPointer = secondPointer = head;
			while (count != 0) {
				secondPointer = secondPointer.getNext();
				count--;
			}
			while (secondPointer != firstPointer) {
				secondPointer = secondPointer.getNext();
				firstPointer = firstPointer.getNext();
			}
			System.out.println("The first node of the looped linked list is : " + firstPointer.getValue());
		} else {
			System.out.println("No loop in the linkedList");
		}
	}
}
