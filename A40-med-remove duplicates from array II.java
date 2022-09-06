// TC=O(n)
// SC=O(1)
class Solution {
    public int removeDuplicates(int[] nums) {

        int n= nums.length;
        int slow=1;
        int fast;
        int count =1;

        for(fast=1; fast<n; fast++){        //O(n)

            if(nums[fast]==nums[fast-1])
                count++;
            else
                count=1;

            if(count<=2){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;


    }
}