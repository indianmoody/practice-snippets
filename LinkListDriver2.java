package mini2;

public class LinkListDriver2 {

	public static void main(String []args){
        LinkList<Integer> li = new LinkList<Integer>();
        System.out.printf("size: %d\n", li.size());
        li.addLast(11);
        li.addLast(21);
        li.addFirst(31);
        System.out.printf("size: %d\n", li.size());
        int first = (int) li.getFirst().getValue();
        int last = (int) li.getLast().getValue();
        System.out.println("first: " + first + ", last: " + last);
        li.removeFirst();
        System.out.printf("size: %d\n", li.size());
        first = (int) li.getFirst().getValue();
        last = (int) li.getLast().getValue();
        System.out.println("first: " + first + ", last: " + last);
        li.removeLast();
        System.out.printf("size: %d\n", li.size());
        first = (int) li.getFirst().getValue();
        last = (int) li.getLast().getValue();
        System.out.println("first: " + first + ", last: " + last);
        
        
     }
}

class LinkList<E> {
    public LinkList() {}
    
    class Node<E> {
        private E value;
        private Node<E> next;
        
        public Node(E v, Node<E> n) {
            value = v;
            next = n;
        }
        
        public E getValue() {
            return value;
        }
        
        public Node<E> getNext() {
            return next;
        }
        
        public void setNext(Node<E> n) {
            next = n;
        }
    }
    
    private int size = 0;
    private Node<E> head = null;
    private Node<E> tail = null;
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public int size() {
        return size;
    }
    
    public Node<E> getFirst() {
        return head;
    }
    
    public Node<E> getLast() {
        return tail;
    }
    
    public void addFirst(E e) {
        if (isEmpty()) {
            head = new Node<E>(e, null);
            tail = head;
            size++;
        }
        else {
            Node<E> n = new Node<E>(e, head);
            head = n;
            size++;
        }
        
    }
    
    public void addLast(E e) {
        if (isEmpty()) {
            head = new Node<E>(e, null);
            tail = head;
            size++;
        }
        else {
            Node<E> n = new Node<E>(e, null);
            tail.setNext(n);
            tail = n;
            size++;
        }
    }
    
    public Node<E> removeFirst() {
        if (head == null) {
            System.out.println("list is already empty!");
            return null;
        }
        Node<E> n = head;
        head = head.getNext();
        if (head == null)
        	tail = null;
        size--;
        return n;
    }
    
    public Node<E> removeLast() {
        if (head == null) {
            System.out.println("list is already empty!");
            return null;
        }
        
        Node<E> n = head;
        
        if (head == tail) {
        	head = null;
        	tail = null;
        	size--;
        	return n;
        }
        
        while (n.getNext() != tail) {
            n = n.getNext();
        }
        Node<E> m = tail;
        n.setNext(null);
        tail = n;
        size--;
        return m;
    }
    
}
