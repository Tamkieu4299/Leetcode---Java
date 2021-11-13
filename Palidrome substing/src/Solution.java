import java.util.*;

public class Solution {
	public static String longestPalindrome(String s) {
        String max = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = extend(s, i, i), s2 = extend(s, i, i + 1);
            if (s1.length() > max.length()) max = s1;
            if (s2.length() > max.length()) max = s2;
        }
        return max;
    }
    
    private static String extend(String s, int r, int l) {
        for (; 0 <= r && l < s.length(); r--, l++) {
            if (s.charAt(r) != s.charAt(l)) break;
        }
        return s.substring(r+1, l);
    }
	
	public static void main(String[] args) {
		String s="babbd";
		System.out.println(longestPalindrome(s));
	}

}





