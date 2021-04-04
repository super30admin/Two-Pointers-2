/*
 * Approach - Two Pointers
 * SlowPtr will keep track of the index to rewrite the duplicate values
 * FasterPtr will keep on checking for the next non-duplicate value.
 */

//Time Complexity - O(N) - where is N - length of nums
//Space Complexity - O(1)

class Solution {
  public int removeDuplicates(int[] nums) {

    if(nums == null || nums.length == 0){
      return 0;
    }

    int fastPtr = 1, slowPtr = 1, count = 1;

    while(fastPtr < nums.length){

      if(nums[fastPtr] == nums[fastPtr -1]){
        count++;
      }else{
        count = 1;
      }

      if(count <= 2){
        nums[slowPtr] = nums[fastPtr];
        slowPtr++;
      }

      fastPtr++;
    }

    return slowPtr;
  }
}