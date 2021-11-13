import java.util.*;
import java.util.stream.IntStream;

public class Solution {
	
	public static int search(int[] nums, int target) {
		
//		int res = Arrays.binarySearch(nums, target);
//		int index = 0;
//		
//		if(res>0) {
//			for(int i=0; i<nums.length; i++) {	
//				if(nums[i] == target) {
//					index = i;
//				}
//			}
//			return index;
//		}
//		else {
//			return -1;
//		}
//	}
		int start = 0;
		int end = nums.length-1;
		while(start <= end){
            int mid = start + (end-start)/2;
			
            if(target > nums[mid]){
                start = mid + 1;
            }
			else if(target < nums[mid]){
                end = mid - 1;
            }
			else{
                return mid;
            }
        }
        return -1;
	}
	public static void main(String[] args) {
		int[] nums = {-1,5,3,5,9,12}; 
		int target = 2;
		System.out.println(search(nums,target));

	}
		

}
