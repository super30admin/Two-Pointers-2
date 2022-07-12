//Time complexity = O(n)
//Space complexity = O(1)
//Brute force=if current element = previous element then the loop will exit out else if current element not = previous element then copying the pointer from i with j in the current loop using anchor.

//Optimal approach:using count by 2 pointers if the current and previous element & return the length of the pointer j becoz the element i=j.My loop is not dependent on the anchor.
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<2) return nums.length;
        int count = 1;
        int j=1;
        for(int i =1;i<nums.length;i++){
        if(nums[i] == nums[i-1]){
            count++;
        }
         else{
             count = 1;
         }
            if(count<=2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
        
    }
}