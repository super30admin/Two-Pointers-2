class Solution {
    /* Time Complexity: O(n);
    Space Complexity : O(1);

    Executed in leetcode;
    */
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int s =0;
        int count =0;
        for (int i = 0;i <n; i++){
            if (i== 0 || nums[i] == nums[i-1]){
                count++;
            }else{
                count =1;
            }
            if (count <= 2){
                nums[s] = nums[i];
                s++;
            }
        }
        return s;
        
    }
}