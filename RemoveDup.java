
/*
Desc: using a count variable we count the number of occurences of an element using fast pointerand 
Time  Complexity : O(n)
Space Complexity : O(1)
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int count = 1; int j = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]  == nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count<=2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
