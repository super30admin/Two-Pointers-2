// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* APPROACH:
Using the 2 pointer approach :
slow pointer and fast pointer, slow pointer would keep track of the position in the resultant array (same array, transformed into resultant array)
slow pointer would move for 2 repetitions per unique number while fast pointer would iterate through the whole array.
if a new element is found, count is reset.
1. if(count<=2) swap elements at slow pointer and fast pointer.
2. else fastPointer ++, slow pointer stays at the last position until new element is found
*/

import java.util.Arrays;

public class removeDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(null == nums || nums.length == 0){
            return 0;
        }
        int slowPointer = 1;
        int count = 1;
        for(int fastPointer =1; fastPointer<nums.length; fastPointer++){
            if(nums[fastPointer] == nums[fastPointer-1]){
                count++;
            }else{
                count = 1;
            }
            if(count <= 2){
                nums[slowPointer] = nums[fastPointer];
                slowPointer++;
            }
        }
        return slowPointer;
    }

    public static void main(String[] args){
        int[] nums1 = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums1)); //5

        int[] nums2 = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums2)); //7
    }
}
