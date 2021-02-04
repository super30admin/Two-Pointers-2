
// Time Complexity : O(N^2)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Y
// Three line explanation of solution in plain english
pop element >2 count
// Your code here along with comments explaining your approach


class Solution {
    public int removeDuplicates(int[] nums) {

        int count = 1;
        int length = nums.length;

        for(int i=1;i<length;i++){ //check for < length;

            if(nums[i]==nums[i-1]){

                count++;

                if(count>2){
                    popElement(nums, i);
                    i--; //decrease i, since it get incremented in for loop
                    length--; //decrease length
                }
            }else{
                count=1;
            }
        }

        return length;
    }

    public void popElement(int[] nums, int index){

        for(int i=index+1;i<nums.length;i++){
            nums[i-1] = nums[i];
        }

    }
}