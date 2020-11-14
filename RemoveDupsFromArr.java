// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Iterating through the arr to find the duplicate and replacing the element.

public class RemoveDupsFromArr {
    public int removeDuplicates(int[] nums) {

        int low =1;
        int count =1;


        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count =1;
            }

            if(count <= 2){
                nums[low++] = nums[i];
            }
        }
        return low;
    }
}
