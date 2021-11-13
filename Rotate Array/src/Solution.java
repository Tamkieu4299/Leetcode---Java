import java.util.Arrays;

public class Solution {
	
	public static int[] rotate(int[] nums, int k) {
		int n =nums.length;
		int temp=0;
		
		while(true) {
			
			if(k==0) {
				return nums;
			}
			else {
	        	temp=nums[n-1];
	        	for(int j = n-1; j >0 ; j--){
	                nums[j] = nums[j-1];
	        	}
	        	nums[0]=temp;
	        	return rotate(nums,k-1);  
			}
    	}
		
    }
	
//	public void rotate(int[] nums, int k) {
//
//	    if(nums == null || nums.length < 2){
//	        return;
//	    }
//	    
//	    k = k % nums.length;
//	    reverse(nums, 0, nums.length - k - 1);
//	    reverse(nums, nums.length - k, nums.length - 1);
//	    reverse(nums, 0, nums.length - 1);
//    
//}
//
//	private void reverse(int[] nums, int i, int j){
//	    int tmp = 0;       
//	    while(i < j){
//	        tmp = nums[i];
//	        nums[i] = nums[j];
//	        nums[j] = tmp;
//	        i++;
//	        j--;
//	    }
//}
	
	public static void main(String[] args) {
		int[] nums = {-1,-100,3,99};
		int k = 2;
		System.out.println(Arrays.toString(rotate(nums,k)));
	}

}
	