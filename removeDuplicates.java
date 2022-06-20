class Solution {
    //Time complexity: O(n)
    //Space complexity: O(1)
    public int removeDuplicates(int[] nums) {
        int s=1,c=1;
        for(int f=1;f<nums.length;f++){
            if(nums[f]==nums[f-1]){
                c++;
            }
            else{
                c=1;
            }
            if(c<=2){
                nums[s]=nums[f];
                s++;
            }
        }
        return s;
    }
}