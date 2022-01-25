//Time Complexity: O(n)
//Space Complexity: O(1)
//Since an element should not occur more than twice, we use two pointers to keep track of the element we are at and its occurances.
//If it occurs twice or more than twice, we simply copy the next element after 2 occurances of the previous element. If it occurs once we simply move to
//our next element.

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1, j = 1;
        int count = 1;
        
        while(j < nums.length){
            if(nums[j] == nums[j-1]){
                count++;
            }else{
                count = 1;
            }
            
            if(count<=2){
                nums[i] = nums[j];
                i++;
            }
            
            j++;
        }
        return i;
    }
}