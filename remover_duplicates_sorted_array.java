// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
public int removeDuplicates(int[] nums) {
        
    if(nums.length == 0) return 0;
    int i = 0;
    for(int j = 1; j < nums.length; j++){
        // if the elements are different, we place the next element at our current index
        if(nums[j] != nums[i]){
            i++; //so that we don't override the values every iteration
            nums[i] = nums[j];
        }
    }
    return i + 1;
    
}