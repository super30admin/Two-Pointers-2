
// Time Complexity : O(N)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode :  yes
// Three line explanation of solution in plain english

//1) using two pointer, where one pointer is at the location to be updated and another pointer is to check the values whetehr it is equal to the previous, if yes,increment 
//   count if not reset count to 1(new values found);
//2) checking condition wheter, if count less that two the modifying the array.
//3) we can change count to 3 if we want atmost 3 duplicates and to 1 if we want not duplicates

// Your code here along with comments explaining your approach

//input : nums = [0,0,1,1,1,1,2,3,3]
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int count=1;
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count<=2){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}

//output:[0,0,1,1,2,3,3]