import java.util.Arrays;

public class Solution {
	
//  public static void moveZeroes(int[] nums) {
//        int n = nums.length;
//        int i = -1;
//        for (int j = 0; j < n; j++) {
//        	if (nums[j] != 0) {
//        		i++;
//        		swap(nums, i, j);
//        	}
//        }
//    }
//    public static void swap(int[] nums, int i, int j) {
//    	int temp = nums[i];
//    	nums[i] = nums[j];
//    	nums[j] = temp;
//    }
	public static void moveZeroes(int[] nums) {
        if(nums == null || nums.length <=1)
            return;
        int last = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
            	
                nums[++last] = nums[i];
                
                if(i != last)
                    nums[i]=0; 
            }
        }
        System.out.println(Arrays.toString(nums));
    } 
	public static void main(String[] args) {
		int[] nums= {0,1,0,3,12};
		moveZeroes(nums);

	}

}
