import java.util.*;

public class Solution {
	
//	public static String convert(String s, int numRows) {
		
//		List<Character[]> lOfLists = new ArrayList<Character[]>(numRows); 
// 		int i=0; // columns
//		int j=0; // rows
//		int inx=0;
//		boolean reverse = false;
//		int nSize = numRows + (s.length()/numRows) * (numRows -2);
//		
//		String res="";
//		for(int k = 0; k < s.length(); k++)  {
//			lOfLists.add(new Character[nSize]);
//	    }
//		if(s.length()<= numRows) return s;
//		else {
//		
//			while(inx<s.length()) {
//				
//				if(j==numRows-1) {
//					lOfLists.get(j)[i] = s.charAt(inx);
//					inx++;
//					j--;
//					i++;
//					reverse=true;
//				}
//				if(j==0 && reverse==true) {
//					lOfLists.get(j)[i] = s.charAt(inx);
//					inx++;
//					j++;
//					reverse=false;
//				}
//	
//				if(j<numRows-1 && reverse==false) {
//					lOfLists.get(j)[i] = s.charAt(inx);
//					inx++;
//					j++;
//				}
//				if(j<numRows-1 && reverse==true) {
//					lOfLists.get(j)[i] = s.charAt(inx);
//					inx++;
//					j--;
//					i++;
//					}
//			}
//			
//			for(int m=0; m<numRows; m++) {
//				for(int  n=0;  n<nSize;  n++) {
//					if(lOfLists.get(m)[n] != null) res+=lOfLists.get(m)[n];
//					else {continue;}
//				}
//				
//			}
//			return res;		
//		}	
//	}
	public static String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < sbs.length; i++) sbs[i] = new StringBuilder();
        int idx = 0;
        int direction = -1;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            sbs[idx].append(c);
            if (idx == 0 || idx == numRows - 1) direction = 0 - direction;
            idx += direction;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder sb : sbs) res.append(sb);    
        return res.toString();
    }
		

	public static void main(String[] args) {
		String s="KIEUCONGTAM";
		int numRows = 5;
		
		System.out.println(convert(s, numRows));

	}

}
