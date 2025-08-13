
//Idea is to move the fast pointer and use slow pointer to replace the elements pointed by fast pointer
// till k occurences.
//slow pointer is used to write the final result and a fast pointer to iterate through the array.

//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        int slow = 0, fast =0;
        int count = 0;

        while(fast<nums.length)
        {
            if(fast!=0 && nums[fast] == nums[fast-1])
            {
                count++;
            }
            else
            {
                count = 1;
            }

            if(count <= k){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}