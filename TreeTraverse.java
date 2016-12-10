package mini2;

public class TreeTraverse {
	
	public static void inTraverse(Node n) {
		if (n == null) {
			return;
		}
		inTraverse(n.left);
		visit(n);
		inTraverse(n.right);
	}
	
	public static void preTraverse(Node n) {
		if (n == null) {
			return;
		}
		visit(n);
		preTraverse(n.left);
		preTraverse(n.right);
	}
	
	public static void postTraverse(Node n) {
		if (n == null) {
			return;
		}
		postTraverse(n.left);
		postTraverse(n.right);
		visit(n);
	}
	
	public static void visit(Node n) {
		System.out.print(n.value + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		
		inTraverse(n1);
		System.out.println();
		preTraverse(n1);
		System.out.println();
		postTraverse(n1);

	}

}

class Node {
	public int value;
	public Node left;
	public Node right;
	
	public Node(int d) {
		value = d;
	}
}

