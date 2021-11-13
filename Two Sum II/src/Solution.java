import java.util.Arrays;

public class Solution {
	
	public static int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        
        for(int i=0; i<numbers.length; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		if(numbers[i]+numbers[j]==target) {
        			arr[0]=i+1;
        			arr[1]=j+1;
        			break;
        		}
        	}
        }
        return arr;
        	
    }
	
//	{
//    int first=0, last=numbers.length-1;
//    while(numbers[first]+numbers[last] !=target)
//    {
//        if(numbers[first]+numbers[last] > target)
//            last--;
//        else first++;
//    }
//    return new int[]{first+1,last+1};
//}
	
	public static void main(String[] args) {
		int[] numbers= {-1,0};
		int target =-1;
		System.out.println(Arrays.toString(twoSum(numbers,target)));
	}

}
