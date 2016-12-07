// compress string by changing repeatitions into a number

public class CompressString {

	public static String compress(String str) {
		StringBuilder s = new StringBuilder();
		char[] ch = str.toCharArray();
		int count = 1;
		s.append(ch[0]);
		for (int i=1; i<ch.length; i++) {
			if (ch[i] == ch[i-1]) {
				count++;
			}
			else {
				s.append(count);
				s.append(ch[i]);
				count = 1;
			}
		}
		s.append(count);
		return s.toString();
	}
	
	public static void main(String[] args) {
		
		String s = "aabcccad";
		System.out.println(compress(s));

	}

}
