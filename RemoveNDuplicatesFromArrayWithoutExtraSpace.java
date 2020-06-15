class Solution {
    public int removeDuplicates(int[] nums) {
     if(nums == null || nums.length == 0) return 0;  
        int n = nums.length;
        int count = 1;
        int j = 1;
        for(int i = 1 ;i< n ;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                   count = 1;
            }
                if(count <= 2){
                    nums[j] = nums[i];
                    j++;
                }
           /* }else{
                count = 1;
                nums[j] = nums[i];
                j++;
            }
            */
        }return j;
    }
}

/*
TimeComplexity: O(n) 1 iteration
Space Complexity:O(1) same space used
*/