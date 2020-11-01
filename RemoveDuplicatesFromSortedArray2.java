package S30.TwoPointers_2;

/*

Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None

*/

public class RemoveDuplicatesFromSortedArray2 {

    public int removeDuplicates(int[] nums) {

        if(nums == null || nums.length == 0) return 0;

        int k = 1;
        int j = 1;

        for(int i = 1; i < nums.length; i++){

            if(nums[i] == nums[i-1]){
                k++;
            }else{
                k=1;
            }
            if(k <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
