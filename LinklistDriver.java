package prac1;

public class LinklistDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linklist l = new Linklist();
		l.addNode(10);
		l.addNode(20);
		l.addNode(30);
		
		l.printList();
		
		l.deleteNode(40);
		l.printList();
		

	}

}

class Linklist {
	
	class Node {
		int data;
		Node next = null;
		
		public Node (int d) {
			data = d;
		}
		
	}
	
	Node head = null;
	//Node tail = null;
	int size = 0;
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	public int Size() {
		return (size);
	}
	
	public void addNode(int d) {
		if (head == null) {
			head = new Node(d);
			head.next = null;
			size++;
		}
		else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			Node m = new Node(d);
			n.next = m;
			m.next = null;
			size++;
		}
		
	}
	
	public void deleteNode(int d) {
		Node n = head;
		if (head.data == d) {
			head = head.next;
			size--;
			System.out.println("node deleted: head");
			return;
		}
		while (n.next != null) {
			if (n.next.data == d) {
				n.next = n.next.next;
				size--;
				System.out.println("node deleted");
				return;
			}
			n = n.next;
		}
		System.out.println("no node with such value: " + d);
	}
	
	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	
}
