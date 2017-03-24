
package org.rashi.datastructure.linkedlist.programs;

import java.util.Scanner;

import org.rashi.datastructure.linkedlist.common.LinkedList;
import org.rashi.datastructure.linkedlist.common.Node;

public class LastNElement {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position of the element you want to get fron the last");
		int position = sc.nextInt();
		LinkedList list = new LinkedList();
		Node head = list.createLinkedList();
		int i = 1;
		Node firstPointer = head, secondPointer = head;
		while (i < position && secondPointer != null) {
			secondPointer = secondPointer.getNext();
			i++;
		}
		if (secondPointer == null) {
			System.out.println("The position you entered is greater than the length of the list. Length of the list is : " + (i - 1));
		} else {
			while (secondPointer.getNext() != null) {
				firstPointer = firstPointer.getNext();
				secondPointer = secondPointer.getNext();
			}
			System.out.println("Element at " + position + " position from the last is : " + firstPointer.getValue());
		}
		sc.close();
	}
}
