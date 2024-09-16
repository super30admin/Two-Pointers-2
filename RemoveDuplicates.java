
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// we have j and i is passing through the elements if ith elemt is same as the prev elemt then counter increases or else count is changed to 
//1 and if the count is less then equal to 2 then the element from j becomes i



class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length ==0)return 0;
        int j = 1;
        int count = 1;
        for(int i = 1; i< nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            
            if(count <=2){
                nums[j] = nums[i];
                j++;
            }
        }return j;
    }
}