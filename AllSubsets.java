// return all subsets of a given set

import java.util.ArrayList;

public class AllSubsets {
	
	public static ArrayList<ArrayList<String>> returnSubsets(int[] A) {
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		for (int i=0; i<A.length; i++) {
			ArrayList<String> al = new ArrayList<String>();
			al.add(String.valueOf(A[i]));
			for (int j=0; j<i; j++) {
				for (String s : list.get(j)) {
					String s1 = s + " " + A[i];
					al.add(s1);
				}
			}
			list.add(al);
		}
		return list;
	}

	public static void main(String[] args) {
		int[] arr = {2, 5, 7};
		
		ArrayList<ArrayList<String>> list = returnSubsets(arr);
		for (int i=0; i<list.size(); i++) {
			for(String s : list.get(i)) {
				System.out.println(s);
			}
		}

	}

}
