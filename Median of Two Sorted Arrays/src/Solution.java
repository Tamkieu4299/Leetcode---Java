import java.util.*;

public class Solution {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int aLen = nums1.length;
        int bLen = nums2.length;
        int[] result = new int[aLen + bLen];
        double median;
        
        System.arraycopy(nums1, 0, result, 0, aLen);
        System.arraycopy(nums2, 0, result, aLen, bLen);

        Arrays.sort(result);
        int n=result.length;
        
        if(result.length%2!=0) return median=result[(n+1)/2-1];
        else {
        	int index1 = (int) Math.floor((double)(n+1)/2);
        	int index2 = (int) Math.ceil((double)(n+1)/2);
        	return median=((double)result[index1-1]+(double)result[index2-1])/2;
        }
	}
//	int index1 = 0;
//    int index2 = 0;
//    int med1 = 0;
//    int med2 = 0;
//    for (int i=0; i<=(nums1.length+nums2.length)/2; i++) {
//        med1 = med2;
//        if (index1 == nums1.length) {
//            med2 = nums2[index2];
//            index2++;
//        } else if (index2 == nums2.length) {
//            med2 = nums1[index1];
//            index1++;
//        } else if (nums1[index1] < nums2[index2] ) {
//            med2 = nums1[index1];
//            index1++;
//        }  else {
//            med2 = nums2[index2];
//            index2++;
//        }
//    }
//
//    // the median is the average of two numbers
//    if ((nums1.length+nums2.length)%2 == 0) {
//        return (float)(med1+med2)/2;
//    }

//  return med2;
	
	public static void main(String[] args) {
		int[] nums1 = {0,0};
		int[] nums2 = {0,0};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

}
