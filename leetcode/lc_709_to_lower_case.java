import java.util.Scanner;

class Solution {
	
	public String s1(String s) {
		return s.toLowerCase();
	}

	public String s2(String s) {
		char[] c = s.toCharArray();
		for(int i=0; i<c.length; i++) {
			if (c[i] >= 65 && c[i] <= 90) {
				c[i] = (char) (c[i]+32);
			}
		}
		return String.valueOf(c);
	}

	public String s3(String s) {
		String ss = "";
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				ss += (char) (s.charAt(i) + 32);
			}
			else {
				ss += s.charAt(i);
			}
		}
		return ss;
	}

	public String s4(String s) {
		StringBuilder sb = new StringBuilder();

		for (char c : s.toCharArray()) {

			if(c >= 65 && c <= 90)
				c = (char) (c+32);
			sb.append(c);
		}
		return sb.toString();
	}
}


class lc_709_to_lower_case {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		String str = sc.next();

		Solution sol = new Solution();
		System.out.println("s1: " +sol.s1(str));
		System.out.println("s2: " +sol.s2(str));
		System.out.println("s3: " +sol.s3(str));
		System.out.println("s4: " +sol.s4(str));

	}
}