import java.util.*;

public class Solution {
	
	public static int[] sortedSquares(int[] nums) {
		
		int[] powArr = new int[nums.length];
		int n = nums.length;
        
		int i = 0, j = n - 1;
		
		for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                powArr[p] = nums[i]*nums[i];
                i++;
            }
            else {
            	powArr[p] = nums[j]*nums[j];
                j--;
            }
        }
        return powArr;
    }

	public static void main(String[] args) {
		int[] nums = {-7,-3,2,3,11};
		System.out.println(Arrays.toString(sortedSquares(nums)));

	}

}
