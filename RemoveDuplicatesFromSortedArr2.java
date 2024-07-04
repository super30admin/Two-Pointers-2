
/**
 Approach: two pointers

        Working:
        declare j pointer to 1 //this indicates where the value will be place
        declare count to 1, //indicates that the first element is counted

        iterate through the array starting from 1

        check if value at i and i-1 equal
        increment count
        else
        set count = 1 //indicates that we are seeing the element first time

        check if count is less that or equal to 2
        place the current value at proper index
        nums[j] = nums[i]
        increment j

        return j //which is the length of the properly placed elements in the array


    Time Complexity: O(n)
    Space Complexity: O(1)

 */



class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums == null || nums.length == 0) {
            return 0;
        }

        int j = 1;
        int count = 1;
        for(int i = 1; i<nums.length; i++) {

            if(nums[i] == nums[i-1]){
                count++;
            }
            else {
                count = 1;
            }

            if(count <= 2) {
                nums[j] = nums[i];
                j++;
            }

        }
        return j;
    }
}