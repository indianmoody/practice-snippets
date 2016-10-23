package prac1;

import java.util.*;

public class StackLinkDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLink st = new StackLink();
		for (int i=0; i<5; i++) {
			st.push(10*i);
		}
		
		System.out.println("Stack size: " + st.size());
		
		for (int i=0; i<6; i++) {
			System.out.println(st.pop());
		}

	}

}

class StackLink {
	
	int size = 0;
	LinkedList<Integer> li = new LinkedList<Integer>();
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public void push(Integer d) {
		li.add(d);
		size++;
	}
	
	public Integer pop() {
		try {
			Integer temp = li.removeLast();
			if (size > 0) {
				size--;
			}
			return temp;
		}
		catch (Exception e) {
			System.out.println("Stack is already empty!");
			return null;
		}
	}
	
	public Integer peek() {
		try {
			return li.getLast();
		}
		catch (NoSuchElementException e) {
			System.out.println("Stack is already empty!");
			return null;
		}
	}
}