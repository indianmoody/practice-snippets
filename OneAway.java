package mini2;

import java.util.*;

// There are two strings. If after 1 or 0 insertion, deletion or replacement they becomes same,
// it returns true otherwise false

public class OneAway {
	
	public static boolean checkDifference(String s1, String s2) {
		int k = (int)Math.abs(s1.length() - s2.length());
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int count=0, i=0, j=0;
		
		if (k == 0) {
			while (count <= 1 && i < s1.length()) {
				if (c1[i] != c2[j]) {
					count++;
					i++;
					j++;
				}
				else {
					j++;
					i++;
				}
			}
			if (count <= 1)
				return true;
			else
				return false;
		}
		
		else if (k == 1) {
			while (count <= 1 && i<s1.length() && j<s2.length()) {
				System.out.println("count: " + count + " i: " + i + " j: " + j);
				if (c1[i] != c2[j]) {
					if (i+1 < s1.length()) {
						if (c1[i+1] != c2[j]) {
							count++;
							i++;
							j++;
						}
						else {
							//System.out.println(c1[i+1] + " " + c2[j]);
							count++;
							i += 2;
							j++;
						}
					}
					else {
						i++;
						j++;
						count++;
					}
				}
				else {
					i++;
					j++;
				}
			}
			System.out.println("count: " + count + " i: " + i + " j: " + j);
			System.out.println(count + (s1.length()-i) + (s2.length()-j));
			if ((count + (s1.length()-i) + (s2.length()-j)) <= 1)
				return true;
			else 
				return false;
		}
		
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		s1 = sc.next();
		System.out.println("Enter second string: ");
		s2 = sc.next();
		sc.close();
		System.out.println(checkDifference(s1, s2));

	}

}
