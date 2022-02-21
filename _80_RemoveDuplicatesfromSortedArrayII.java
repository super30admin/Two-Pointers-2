// space complexity - o(1)
  //time - o(n)
  //Ran on leeetcode successfully : Yes
  // Problem faced  : No
  //Approach : Two pointer approach, move end pointer until numbers are same, the swap left and right
  // Also maintain count pointer, if count is 1 , swap only 1 number , if count is more tha 2 then swap 2 numbers from end and start
class Solution {
  public int removeDuplicates(int[] nums) {

      if(nums == null || nums.length == 0) return 0;
      if(nums.length  == 1) return 1;

      int start = 0 ;
      int end = 1;

      int count  = 1;

      while(end < nums.length){

          if(nums[end] == nums[end-1]){
              count++;
          }
          else{
              if(count == 1){
                  nums[start] = nums[end-1];
                  start++;
              }
              else if(count >= 2){
                  nums[start] = nums[end-1];
                  start++;
                  nums[start] = nums[end-1];
                  start++;
              }
              count = 1;
          }
          end++;
      }

      if(count == 1){
          nums[start] = nums[end-1];
          start++;
      }
      else if(count >= 2){
          nums[start] = nums[end-1];
          start++;
          nums[start] = nums[end-1];
          start++;
      }

      return start;
  }

    //exact same approach as above, less LOC
    public int removeDuplicates(int[] nums) {

        if(nums == null || nums.length == 0) return 0;

        int start = 0 ;
        int end = 1;
        int count  = 1;

        while(end <= nums.length){

            if(end < nums.length && nums[end] == nums[end-1]){
                count++;
            }
            else{
                if(count == 1){
                    nums[start] = nums[end-1];
                    start++;
                }
                else if(count >= 2){
                    nums[start] = nums[end-1];
                    start++;
                    nums[start] = nums[end-1];
                    start++;
                }
                count = 1;
            }
            end++;
        }
        return start;
    }
}
