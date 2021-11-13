
import java.util.*;

public class Solution {
	
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> endList = new ArrayList<>();
		
		
		
        for(int i=0; i<nums.length; i++) {
        	//List<Integer> subList =new ArrayList<>();
        	for(int j=0; j<nums.length && j!=i; j++) {
        		//List<Integer> subList =new ArrayList<>();
        		for(int k=0; k<nums.length && k!=i && k!=j; k++) {
        			List<Integer> subList =new ArrayList<>();
        			if(nums[j]+nums[k]+nums[i]==0) {
        				subList.clear();
        				subList.add(nums[i]);
        				subList.add(nums[j]);
        				subList.add(nums[k]);
        				subList.sort(null);
        	        	if(subList.size()>0) endList.add(subList);
        				
        			}	
        		}
        	}
//        	subList.sort(null);
//        	if(subList.size()>0) endList.add(subList);
        	
        }
        
        HashSet<List<Integer>> s = new HashSet<>(endList);
        
        endList.clear();
        List<List<Integer>> endList_ = new ArrayList<>(s);
        
        
        return endList_;
    }
	
//	Arrays.sort(num);
//    List<List<Integer>> res = new LinkedList<>(); 
//    for (int i = 0; i < num.length-2; i++) {
//        if (i == 0 || (i > 0 && num[i] != num[i-1])) {
//            int lo = i+1, hi = num.length-1, sum = 0 - num[i];
//            while (lo < hi) {
//                if (num[lo] + num[hi] == sum) {
//                    res.add(Arrays.asList(num[i], num[lo], num[hi]));
//                    while (lo < hi && num[lo] == num[lo+1]) lo++;
//                    while (lo < hi && num[hi] == num[hi-1]) hi--;
//                    lo++; hi--;
//                } else if (num[lo] + num[hi] < sum) {
//                    // improve: skip duplicates
//                    while (lo < hi && num[lo] == num[lo+1]) lo++;
//                    lo++;
//                } else {
//                    // improve: skip duplicates
//                    while (lo < hi && num[hi] == num[hi-1]) hi--;
//                    hi--;
//                }
//            }
//        }
//    }
//    return res;
	
	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
		System.out.println(threeSum(nums));

	}

}
