import java.util.Arrays;

public class Solution {
	
	private static int binarySearch(int[] arr, int low, int high, int x)
    {
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(arr[mid] == x)
                return mid;
            else if(mid-1 >= low && arr[mid-1] < x && x < arr[mid])
                return mid;
            else if(mid+1 <= high && arr[mid] < x && x < arr[mid+1])
                return mid+1;
            else if(arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
	
    public static int searchInsert(int[] nums, int target) 
    {
        int n = nums.length;
        if(target < nums[0])
            return 0;
        if(target > nums[n-1])
            return n;
        
        return binarySearch(nums, 0, n-1, target);
    }
    
    /* Solution 2*/
//    if(target < nums[0])
//        return 0;
//    else if(target > nums[nums.length - 1])
//        return nums.length;
//    
//    int l = 0;
//    int r = nums.length - 1;
//    int mid = 0;
//    while(l <= r) {
//        mid = (l + r) / 2;
//        
//        if(nums[mid] == target)
//            return mid;
//        
//        else if(nums[mid] < target)
//            l = mid + 1;
//        
//        else
//            r = mid - 1;
//    }
//    
//    return target > nums[mid] ? mid + 1 : mid; 
//}

	public static void main(String[] args) {
		int[] nums = {1};
		int target = 0;
		System.out.println(searchInsert(nums,target));

	}

}
