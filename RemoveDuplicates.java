// Time complexity for the solution is O(n) where n is the length of the array and space complexity is O(1)
class Solution {
  public int removeDuplicates(int[] nums) {
    if(nums.length == 0) return 0;
    int count = 1;
    int j = 1;
    for(int i=1;i<nums.length;i++){
      if(nums[i] == nums[i-1]){
        count++;
      }
      else{
        count = 1;
      }
      if(count <= 2){
        nums[j] = nums[i];
        j++;
      }
    }
    return j;
  }
}