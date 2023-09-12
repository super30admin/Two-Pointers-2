class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int count = 1;
        int slow = 1;
        for(int i =1; i< nums.length; i++){
            if(nums[i] == nums[i-1]) count++;
            else count = 1;
            if(count <= 2){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}

/**

TC : O(n)
SC : O(1)

Description : 

Optimal Solution : maintaining 2 pointers (slow and fast). 
If count is not less than or equal to k, slow pointer will stop and it will be replaced with fast pointer when count is less than or equal to k. Count will become ‘0’ when fast is not equal to its previous number. TC : O(n) SC : O(1)


 */