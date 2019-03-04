package io.github.dudri63.dataStructure.DoublyLinkedList;

public class DblList {
	private DblNode head;
	public DblList() {
		head = null;
	}
	public void insertFirstNode(String data) {
		DblNode newNode = new DblNode(data);
		newNode.rlink = head;
		this.head = newNode;
	}
	public void insertMiddleNode(DblNode pre, String data) {
		DblNode newNode = new DblNode(data);
		newNode.rlink = pre.rlink;
		pre.rlink = newNode;
		newNode.llink = pre;
		newNode.rlink.llink = newNode;
	}
	public void insertLastNode(String data) {
		DblNode newNode = new DblNode(data);
		if (head == null) {
			this.head = newNode;
		}
		else {
			DblNode temp = head;
			while(temp.rlink != null) temp = temp.rlink;
			temp.rlink = newNode;
		}
	}
	public void deleteMiddleNode(DblNode pre) {
		DblNode old = pre.rlink;
		pre.rlink = old.rlink;
	}
	public void deleteLastNode() {
		DblNode pre, temp;
		if(head == null) return;
		if(head.rlink == null) {
			head = null;
		}
		else {
			pre = head;
			temp = head.rlink;
			while(temp.rlink != null) {
				pre = temp;
				temp = temp.rlink;
			}
			pre.rlink = null;
		}
	}
	public DblNode searchNode(String data) {
		DblNode temp = this.head;
		while(temp != null) {
			if(data.contentEquals(temp.getData()))
				return temp;
			else temp = temp.rlink;
		}
		return temp;
	}
	public void printLinkedList() {
		DblNode temp = this.head;
		System.out.printf("L = (");
		while(temp != null) {
			System.out.printf(temp.getData());
			temp = temp.rlink;
			if(temp != null) {
				System.out.printf(", ");
			}
		}
		System.out.println(")");
	}
}
