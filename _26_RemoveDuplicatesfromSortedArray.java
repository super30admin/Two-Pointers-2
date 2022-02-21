// space complexity - o(1)
  //time - o(n)
  //Ran on leeetcode successfully : Yes
  // Problem faced  : No
  //Approach : Two pointer approach, move end pointer until numbers are same, the swap left and right
class Solution {
    public int removeDuplicates(int[] nums) {

        int start = 0 ;
        int end = 0;

        while(end < nums.length){

           if(nums[end] == nums[start]){
                end++;
            }
            else{
                nums[start+1] = nums[end];
                start++;
            }
        }
        return start+1;
    }
}
