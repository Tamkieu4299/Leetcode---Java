import java.util.*;
public class Solution {
	
	public static int[] twoSum(int[] nums, int target) {
		
		List<Integer> arrList = new ArrayList<Integer>();
		int n=nums.length;
		for (int i = 0; i<n; i++) {
			for (int j = i+1; j<n; j++)
				if(nums[i]+nums[j]==target) {
					arrList.add(i);
					arrList.add(j);
					break;
				}
			
		}
		
		int[]arr = new int[arrList.size()];
		for(int i=0; i<arrList.size(); i++) arr[i]=arrList.get(i);
		
		
		return arr;
    }
//	int[] result = new int[2];
//    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//    for (int i = 0; i < numbers.length; i++) {
//        if (map.containsKey(target - numbers[i])) {
//            result[1] = i;
//            result[0] = map.get(target - numbers[i]);
//            return result;
//        }
//        map.put(numbers[i], i);
//    }
//    return result;
	
	public static void main(String[] args) {
		int[] nums= {3,2,3};
		int target=6;
		System.out.println(Arrays.toString(twoSum(nums,target)));
	}

}
