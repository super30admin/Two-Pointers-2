
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
// Three line explanation of solution in plain english

/*
 * Questions:
 * what if count > k -> fast pointer will continue to move
 * what if count <=k -> slow we will increment to 1 and fast pointer will continue to move
 * if we find a new elment reset the count to 1
 * i
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int slow=0;
        int count=0;
        int k=2;

        for(int fast=0; fast<nums.length; fast++){
            if(fast !=0 && nums[fast]==nums[fast-1]){
                count++;
            }else{
                count =1;
            }

            if(count<=k){
                nums[slow]= nums[fast];
                slow++;
            }
        }

        return slow;
    }
}