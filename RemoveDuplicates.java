class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = 2;
        int slow = k, fast = k;

        while(fast < nums.length){
           
            if(nums[slow - k] != nums[fast]){
                nums[slow] = nums[fast];
                slow++;
            }

            fast++;
        }

        return slow;
    }
}

Time complexity : O(n)
space complexity : O(1)