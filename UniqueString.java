
// check if a string is unique or not using regex

import java.util.regex.*;

public class UniqueString {

	public static void main(String[] args) {
		String s = "helo1k@j09@8";
        Pattern p = Pattern.compile(".*(.).*\\1");
        Matcher m = p.matcher(s);
        if (m.find()) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
     }

}
