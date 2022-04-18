class RemoveDuplicatesFromSortedArray {


// Time Complexity : 0(n)
// Space Complexity :0(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: I have taken two pointers slow and fast. And also a variable to count
    //the repetitions. In my for loop, I check if the fast pointer and the prev pointer is same element or not. If it is same
    //then count is increased and if not then count remains 1. If count is less than 2 then I add the value of fast pointer to
    //my current slow index and increment slow pointer to point to the next index. The fast pointer traverses the entire array
    //and overwriting the elements depending upon their occurences.

// Your code here along with comments explaining your approach


    public int removeDuplicates(int[] nums) {
        int count = 1;
        int slow = 1;
        for(int fast = 1; fast < nums.length; fast++){
            if(nums[fast] == nums[fast-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count <= 2){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}