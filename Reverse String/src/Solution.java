import java.util.Arrays;

public class Solution {
	
	public static void reverseString(char[] s) {
		int right =s.length-1;
		int left =0;
		
		while(left<right) {
			char temp =' ';
			if(right==left) {
				break;
			}
			else {
				temp = s[left];
				s[left++] = s[right];
				s[right--] =temp;
				
			}
		}
		System.out.println(Arrays.toString(s));
    }

	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
		
	}

}
