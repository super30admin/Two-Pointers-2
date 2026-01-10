// Time Complexity : O(N), touching each element twice O(2N) = ~O(N)
// Space Complexity : O(1), Updating the array in place
// Did this code successfully run on Leetcode : Yes
// Approach :

// We need to identify the count of each value in the array and keep min(count, k) values of that elements.
// We can keep a count variable to count the frequency, which should be reset before calculating the frequency of the next elements.
// In order to track which elements needs to be replaced by which value, we can have two pointers starting from same position,
// but moving at fast and slow pace.
// The slow pointer indicates the index that needs to be updated and fast pointer indicates the value, the index
// needs to be updated with.
public class DuplicatesInSortedArray {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int slow = 0;
        int fast = 0;
        int k = 2;
        while(fast < len){
            int count = 0;
            // Keep the value, needed for frequency calculation and replacing the slow pointer value later
            int currValue = nums[fast];
            while(fast < len && nums[fast] == currValue) {
                fast++;
                count++;
            }
            // Repeat value only min( current value count, given value k) times
            int minHops = Math.min(count, k);
            while(minHops != 0){
                //Override the duplicate values with required values of the next element.
                nums[slow] = currValue;
                slow++;
                minHops--;
            }
        }

        return slow;
    }
}
