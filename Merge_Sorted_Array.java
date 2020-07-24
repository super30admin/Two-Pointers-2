/********************************Brute Force*************************/
// Time Complexity : O(n logn + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
import java.util.*;

/*public class Merge_Sorted_Array {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0 && n == 0)
            return;
        for(int i=0; i<n; i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1); 
    }
}*/

/********************************Optimal Approach*************************/
//Time Complexity : O(m + n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : 	yes

/* considering 3 pointers, pt1 = end of first array, pt2= end of second array and
 * index pointer, considering after this all elements are sorted
 * compare the pt1 and pt2, and place the highest of those two in the index position and decrement the index pointer. 
 * If pointer 2 out of array, then copy all elements from nums2 to nums1*/

public class Merge_Sorted_Array {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = m-1;
        int pointer2 = n-1;
        int index = m+n-1; // all the elements after this index are sorted
        while(pointer2 >=0 && pointer1 >=0){
            if(nums2[pointer2] > nums1[pointer1]){
                //place the higher number to the index postion
                nums1[index] = nums2[pointer2];
                index--;
                pointer2--;
            }
            else{   // nums1 is greater or equal to nums2
                nums1[index] = nums1[pointer1];
                index--;
                pointer1--;
            }
        }
        
        while(pointer2 >=0){ // if pointer 2 out of array, then copy all elements from nums2 to nums1
            nums1[index] = nums2[pointer2];
            pointer2--;
            index--;
        }
    }
}