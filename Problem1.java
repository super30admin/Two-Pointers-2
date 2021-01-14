// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
class Solution {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2)
            return n;

        int forward = 1;
        int index = 1;
        int prev = nums[0];
        int count = 1;

        while (forward < n) {
            if (nums[forward] == prev) {
                count++;
            } else {
                count = 1;
                prev = nums[forward];
            }

            if (count == 3) {
                while (forward < n && nums[forward] == prev) {
                    forward++;
                }

                if (forward < n) {
                    // Forward now points to the next element in array
                    swap(nums, index, forward);
                    prev = nums[index];
                    count = 1;
                }
            } else {
                swap(nums, index, forward);
            }

            forward++;
            index++;
        }
        return n - (forward - index);
    }

    public static void swap(int arr[], int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 1, 1, 2, 2, 2, 3, 3 };
        int n = removeDuplicates(arr);
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, n + 1)));
    }
}