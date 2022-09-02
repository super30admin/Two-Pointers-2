//TC: O(n)
//SC: O(1)
//Program ran on leetcode successfully. 

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        
        int k = 2;
        for (int i = 2; i < nums.length; i++){
            if ((nums[i] != nums[k-1]) || (nums[i] != nums[k-2])){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
        
    }
}