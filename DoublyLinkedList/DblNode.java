package io.github.dudri63.dataStructure.DoublyLinkedList;

public class DblNode {
	private String data;
	public DblNode llink;
	public DblNode rlink;
	public DblNode(String data) {
		this.data = data;
		this.llink = null;
		this.rlink = null;
	}
	public DblNode(String data, DblNode llink, DblNode rlink) {
		this.data = data;
		this.llink = llink;
		this.rlink = rlink;
	}
	public String getData(){
		return this.data;
	}
}
