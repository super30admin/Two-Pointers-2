// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// kep adding to pointer and increasing pointer for genuine element

// Your code here along with comments explaining your approach

public int removeDuplicates(int[] nums) {
    int pointer = 1;
    int curr = nums[0];
    int count = 1;
    for(int i = 1; i<nums.length;i++){
        if(nums[i] == curr){
            count++;
            if(count <= 2) {nums[pointer] = curr; pointer++;}
        } else {
            nums[pointer] = nums[i];
            curr = nums[i];
            pointer++;
            count = 1;
        }
    }
    return pointer;
}