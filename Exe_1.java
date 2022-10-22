class Solution {
    public int removeDuplicates(int[] nums) {
        int in = 0;
        for(int num:nums){
            if(in<2 || nums[in-2]!=num){
                nums[in]=num;
                ++in;
            }
        }
        return in;
    }
}
//tc=O(n)
//sc=O(1)
