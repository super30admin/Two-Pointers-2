// Problem 1 : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach : It removes duplicates from a sorted array nums while allowing at most k duplicates to remain, using two pointers (slow and count). It iterates through the array, updating count for each duplicate and overwriting duplicates at index slow with the current element if the count is less than or equal to k, then increments slow. Finally, it returns the length of the new array after removing duplicates.

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int slow = 0, count = 0;
        int k = 2;
        for (int i = 0; i < n; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= k) {
                nums[slow++] = nums[i];
            }
        }
        return slow;
    }
}

// Problem 2: https://leetcode.com/problems/merge-sorted-array/
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach : I have used two
// pointers approach to solve this problem. I have taken two pointers p1 and p2
// and initialized them to m-1 and n-1 respectively. I have also taken another
// pointer idx and initialized it to m+n-1. I have compared the elements at p1
// and p2 and placed the greater element at idx and decremented the respective
// pointers. I have repeated this process until p1 and p2 are greater than or
// equal to 0. If p2 is greater than or equal to 0, then I have placed the
// remaining elements of nums2 at the beginning of nums1.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, idx = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[idx--] = nums1[p1--];
            } else {
                nums1[idx--] = nums2[p2--];
            }
        }
        while (p2 >= 0) {
            nums1[idx--] = nums2[p2--];
        }
    }
}
// Problem 3: https:leetcode.com/problems/search-a-2d-matrix-ii/
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach : I have used two
// pointers approach to solve this problem. I have taken two pointers r and c
// and initialized them to 0 and n-1 respectively. I have compared the element
// at matrix[r][c] with the target. If the element is equal to the target, then
// I have returned true. If the element is greater than the target, then I have
// decremented c. If the element is less than the target, then I have
// incremented r. I have repeated this process until r is less than m and c is
// greater than or equal to 0. If the element is not found, then I have returned
// false.
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;

        int r = 0, c = n - 1;

        while (r < m && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }
        return false;
    }
}