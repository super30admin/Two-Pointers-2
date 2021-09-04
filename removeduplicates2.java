time complexity: O(n)
space complexity: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null){ //initial check
        return 0;
    }
 
    if (nums.length <= 2){
        return nums.length;
    } //two pointers to previous and current
    int i = 1; // point to previous 
    int j = 2; // point to current
 
    while (j < nums.length) {
        if (nums[j] == nums[i] && nums[j] == nums[i - 1]) { //checking if they are equal, then incrementing j
            j++;
        } else { //else incrementing i
            i++;
            nums[i] = nums[j]; //then putting  nums[j] into nums[i]
            j++;
        }
    }
 
    return i + 1; 
}
}