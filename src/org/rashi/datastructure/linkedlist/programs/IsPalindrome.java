
package org.rashi.datastructure.linkedlist.programs;

import org.rashi.datastructure.linkedlist.common.LinkedList;
import org.rashi.datastructure.linkedlist.common.Node;

public class IsPalindrome {

	public static void main(String args[]) {

		LinkedList list = new LinkedList();
		Node head = list.createPalindromeList();
		list.printLinkedList();
		isPalimList(head);
	}

	public static boolean isPalimList(Node head) {

		boolean isPalim = true;
		Node mid = MiddleElement.getMiddleElement(head);
		Node reversedHead = ReverseLinkedList.reverse(mid);
		while (head != null && reversedHead != null) {
			if (head.getValue() != reversedHead.getValue()) {
				isPalim = false;
			}
			head = head.getNext();
			reversedHead = reversedHead.getNext();
		}
		if (isPalim) {
			System.out.println("List is a palindrome");
		} else {
			System.out.println("List is not a palindrome");
		}
		return isPalim;
	}
}
