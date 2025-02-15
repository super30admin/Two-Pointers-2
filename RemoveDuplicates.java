// Time Complexity : O(n) where n is the number of elements in the array
// Space Complexity : O(1) as we are not using any extra space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// - Use two pointers, slow and fast
// - Keep a count of the number of times an element is repeated
// - If the count is less than or equal to 2, place the element at the slow pointer and increment the slow pointer

// Your code here along with comments explaining your approach
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {

        int slow = 1;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            if(count <= 2){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}
