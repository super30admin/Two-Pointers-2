/*
Time Complexity:O(n)
Space Complexity:O(1)
*/
class Solution {
    public int removeDuplicates(int[] nums) {
    int i=0;
    int j=0;
    int count=1;
        while(j<nums.length-1){
           j++;
            //equal elements
            if(nums[i]==nums[j]){
                count++;
                if(count<=2){
                    nums[i+1]=nums[j];
                    i=i+1;
                }
            }
           //unique elements
            else{
               nums[i+1]=nums[j];
                i=i+1;
                count=1;
            }
        }
        return i+1;
    }
}