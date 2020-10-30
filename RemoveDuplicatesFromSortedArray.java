// Time Complexity : O(n) where  n = size of the array
// Space Complexity : O(1) not extra auxiliary space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*Approach
 * We will be using 2 pointer approach. Where one pointer will be used to traverse the array and keep count of the
 * number of duplicates and other pointer will be at the position where we can insert the element to remove duplicate
 * */

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        //edge
        if(nums==null || nums.length==0){
            return 0;
        }

        int j=1, count=1;
        for(int i=1; i<nums.length; i++){
            //if(previos no is same as current, then we increment the count
            if(nums[i]==nums[i-1]){
                count++;
            }
            else {
                //else reset the count to 1
                count = 1;
            }
            if(count<=2){
                //replace value at j index with value at index 1
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
