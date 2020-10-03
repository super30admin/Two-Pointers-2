class Solution {// time of O(n) space constant
    public int removeDuplicates(int[] nums) {
        
        int p2=1;
        int count=1;
        for (int p1=1; p1<nums.length; p1++){
            if(nums[p1]==nums[p1-1])
                count++;
            else
                count=1;
            
            if(count<=2){
                nums[p2] = nums[p1];
                p2++;
            }
                
        }
        return p2;
    }
}