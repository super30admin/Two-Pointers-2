/**
* Time Complexity - O(n) - n - number of elements
* Space Complexity - O(1)
*/
class Solution {
    public int removeDuplicates(int[] nums) {

        int j=1,count=1;
        int len = nums.length;

        for(int i=1; i < len ; i++){

            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count=1;
            }

            if(count <=2){
                nums[j++] = nums[i];
            }
        }
        return j;
    }

}