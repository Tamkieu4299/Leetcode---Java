import java.util.List;

public class Solution {
	/* Solution 1 */
	public static String reverseWords(String s) {
		
        char[] arr;
        arr = s.toCharArray();
        char temp =' ';
        int left=0;
        int right = s.length()-1;
        String str;
        
        String[] str_arr;
       
        
		while(left<right) {
			
			if(right==left) {
				break;
			}
			else {
				temp = arr[left];
				arr[left++] = arr[right];
				arr[right--] =temp;
			}
		}
		
		str = String.valueOf(arr);
		str_arr = str.split(" ");
		String[] new_arr = new String[str_arr.length];
		for(int i=str_arr.length-1; i>=0;  i--) {
			new_arr[str_arr.length-1 -i] =str_arr[i];
		}
		
		str = str.join(" ", new_arr);
		
		
		
        return str;
		
    }
	/* Solution 2 */
//	public String reverseWords(String s) {
//        String[] str = s.split(" ");
//        for (int i = 0; i < str.length; i++) str[i] = new StringBuilder(str[i]).reverse().toString();
//        StringBuilder result = new StringBuilder();
//        for (String st : str) result.append(st + " ");
//        return result.toString().trim();
//    } 
	
	
	/* Solution 3 */
//	public String reverseWords(String s) {
//        char[] ca = s.toCharArray();
//        for (int i = 0; i < ca.length; i++) {
//            if (ca[i] != ' ') {   // when i is a non-space
//                int j = i;
//                while (j + 1 < ca.length && ca[j + 1] != ' ') { j++; } // move j to the end of the word
//                reverse(ca, i, j);
//                i = j;
//            }
//        }
//        return new String(ca);
//    }
//
//    private void reverse(char[] ca, int i, int j) {
//        for (; i < j; i++, j--) {
//            char tmp = ca[i];
//            ca[i] = ca[j];
//            ca[j] = tmp;
//        }
//    }
	
	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));

	}

}
