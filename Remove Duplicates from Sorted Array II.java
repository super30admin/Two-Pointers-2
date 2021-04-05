//Time Complexity : O(n)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0||nums==null){
            return 0;
        }
        //declare the two pointers
        int slow=1,fast=1,count=1;
        //initially set count to 1
        //iterate through the array
        while(fast < nums.length){
            //check if the current element is the same as previous element
            if(nums[fast] == nums[fast-1]){
                //if so increse the count
                count++;
            }
            //if the elements are not same agin set the count back to 1
            else{
                count=1;
            }
            //if count is less than 3 then overwite the elements
            if(count <= 2){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}