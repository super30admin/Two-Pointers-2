//Time Complexity : O(n) where n is the length of array
//Sapce Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
//We have taken two pointers - slow at index 0 and fast at index 1 . Then we have to traverse the array and if we find any duplicate ,then we will increase the count else we will reset the count to 1 . If the value of count is less than k (k==2) , then we will increase slow pointer and replace the value at slow pointer with fast pointer. And at last we will return slow+1 to return the length of array with duplicates ==k.

//CODE:
class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        // null case
        if (nums == null || nums.length == 0)
            return 0;

        int count = 1;
        int slow = 0;
        int fast = 1;

        while (fast < nums.length) { // traversing the array
            if (nums[fast] == nums[fast - 1]) { // if duplicates are there ,then increase the count
                count++;
            } else {
                count = 1; // else rest the count to 1
            }
            if (count <= 2) { // if count id less tha 2 , then increase the slow ptr and replace slow with
                              // fast
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1; // returning length of updated array
    }
}