class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2)
            return nums.length;
        
        int start = 2, curr = 2;
        
        while(curr < nums.length){
            if(nums[curr] != nums[start-1] || nums[curr] != nums[start-2]){
                swap(nums,start,curr);
                start++;
            }
                curr++;
        }
        return start;
    }
    
    public void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}

//Time complexity : O(N)
//Space complexity : O(1)
