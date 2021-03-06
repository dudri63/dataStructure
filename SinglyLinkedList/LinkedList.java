package io.github.dudri63.dataStructure.SinglyLinkedList;

public class LinkedList {
	private ListNode head;
	public LinkedList() {
		head = null;
	}
	public void insertFirstNode(String data) {
		ListNode newNode = new ListNode(data);
		newNode.link = head;
		this.head = newNode;
	}
	public void insertMiddleNode(ListNode pre, String data) {
		ListNode newNode = new ListNode(data);
		newNode.link = pre.link;
		pre.link = newNode;
	}
	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			this.head = newNode;
		}
		else {
			ListNode temp = head;
			while(temp.link != null) temp = temp.link;
			temp.link = newNode;
		}
	}
	public void deleteMiddleNode(ListNode pre) {
		ListNode old = pre.link;
		pre.link = old.link;
	}
	public void deleteLastNode() {
		ListNode pre, temp;
		if(head == null) return;
		if(head.link == null) {
			head = null;
		}
		else {
			pre = head;
			temp = head.link;
			while(temp.link != null) {
				pre = temp;
				temp = temp.link;
			}
			pre.link = null;
		}
	}
	public ListNode searchNode(String data) {
		ListNode temp = this.head;
		while(temp != null) {
			if(data.contentEquals(temp.getData()))
				return temp;
			else temp = temp.link;
		}
		return temp;
	}
	public void reverseList() {
		ListNode next = head;
		ListNode current = null;
		ListNode pre = null;
		while(next != null) {
			pre = current;
			current = next;
			next = next.link;
			current.link = pre;
		}
		head = current;
	}
	public void printLinkedList() {
		ListNode temp = this.head;
		System.out.printf("L = (");
		while(temp != null) {
			System.out.printf(temp.getData());
			temp = temp.link;
			if(temp != null) {
				System.out.printf(", ");
			}
		}
		System.out.println(")");
	}
}
