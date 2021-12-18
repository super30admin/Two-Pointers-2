
// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Three line explanation of solution in plain english
// In this problem I am using three pointers to keep a track of the start and end index of new number and another pointer to keep the index where we need to add the values.
// Your code here along with comments explaining your approach

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int oIndex = 0;

        int i = 0;
        while (i < nums.length) {
            int start = i;
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
            int freq = i - start + 1;
            freq = Math.min(freq, 2);
            while (freq > 0) {
                freq--;
                nums[oIndex] = nums[start];
                oIndex++;
            }
            i++;
        }
        return oIndex;
    }

    public static void main(String args[]) {
        RemoveDuplicates obj = new RemoveDuplicates();
        int nums[] = { 1, 1, 1, 2, 2, 3 };
        System.out.println(obj.removeDuplicates(nums));
    }
}
