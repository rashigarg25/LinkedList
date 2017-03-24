
package org.rashi.datastructure.linkedlist.common;

public class LinkedList {

	private Node startNode;

	public Node createLinkedList() {

		Node node1 = new Node(2);
		Node node2 = new Node(5);
		node2.setNext(node1);
		Node node3 = new Node(7);
		node3.setNext(node2);
		Node node4 = new Node(10);
		node4.setNext(node3);
		this.startNode = new Node(9);
		this.startNode.setNext(node4);
		return startNode;
	}

	public Node addNode(int nodeValue) {

		Node node = new Node(nodeValue);
		node.setNext(this.startNode);
		this.startNode = node;
		return node;
	}
}
