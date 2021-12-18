// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) {
            return 1;
        }

        int n = nums.length;
        int freq;
        int count;
        int i =0; // Taking this to keep track of unique elements
        int j =0; // Taking this to copy the elements
        int k =0; // Taking this variable to calculate the freq of each element in array
        int temp;
        while(i<n) {
            freq =1;
            // Calculating the frequency iof unique elements
            while(k<n-1 && (nums[k] == nums[k+1])){
                freq++;
                k++;
            }
            temp = freq;
            // if the freq is >2, setting it to 1 - so that only two elements are copied
            if(temp>2) {
                temp = 2;
            }
            count = 0;
            // copying the elements
            while(count<temp) {
                nums[j++] = nums[i];
                count++;
            }
            // moving the i pointer to next unique element
            i = i+freq;
            k = i;
        }
        // this j will be the count of the elements filled after removing duplicates
        return j;
    }
}
