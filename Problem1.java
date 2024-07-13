//Time = O(n)
//Space = O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1; // counter to keep track of unique elements
        int index = 1; // index to traverse the array
        int currentCount = 1; // counter to keep track of current element count
        
        while (index < nums.length) { // traverse the array
            if (nums[index] == nums[index-1]) { // if the current element is equal to the previous element
                currentCount++; // increment the current element count
            } else { // if the current element is not equal to the previous element
                currentCount = 1; // reset the current element count
            }
            
            if (currentCount <= 2) { // if the current element count is less than or equal to 2
                nums[count] = nums[index]; // overwrite the current element in the array with the next unique element
                count++; // increment the counter for unique elements
            }
            
            index++; // increment the index
        }
        
        return count; // return the count of unique elements
    }
}
