package prac1;

public class StackArrayDriver {

	public static void main(String[] args) throws TempExc{
		// TODO Auto-generated method stub
		StackArray st = new StackArray();
		for (int i=0; i<5; i++) {
			st.push(10*i);
		}
		
		for (int i=0; i<5; i++) {
			System.out.println(st.pop());
		}

	}

}

class StackArray {
	public StackArray() {};
	
	int limit = 10;
	Integer[] arr = new Integer[limit];
	int size = 0;
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size==0);
	}
	
	public void push(Integer d) {
		if (size >= limit) {
			limit *= 2;
			Integer[] brr = new Integer[limit];
			System.arraycopy(arr, 0, brr, 0, arr.length);
			arr = brr;
		}
		arr[size] = d;
		size++;
	}
	
	public Integer pop() throws TempExc{
		if (isEmpty()) {
			throw new TempExc("Stack is already empty!");
		}
		else {
			Integer temp = arr[size-1];
			arr[size-1] = null;
			size--;
			return temp;
		}
	}
	
	public Integer peek() throws TempExc {
		if (isEmpty()) {
			throw new TempExc("Stack is already empty!");
		}
		else {
			return arr[size-1];
		}
	}
}

class TempExc extends Exception {
	public TempExc() {
		super();
	}
	public TempExc(String s) {
		System.out.println(s);
	}
}