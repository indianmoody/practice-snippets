import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		System.out.println("Enter primary string:");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		s1 = s1 + s1;
		System.out.println("Enter string to be checked if rotation of primary string:");
		String s2 = scan.next();
		scan.close();
		System.out.printf("Is the second string a rotation of primary string?\t%b", s1.contains(s2));
	}

}
