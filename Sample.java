
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

public class Sample {

    // Time Complexity : O(n)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : yes
    // set prev to 10001 and count 1 initially
    // if count is less than or equal 2 the put the element in at index k
    // return k
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int k = 0;
        int count = 1;
        int prev = 10001;
        while ( i < nums.length) {
            if (prev != nums[i]) {
                count = 1;
            }
            if (count <= 2) {
                nums[k] = nums[i];
                k++;
                count++;
            }
            prev = nums[i];
            i++;
        }
        return k;
    }

    // Time Complexity : O(m + n)
    // Space Complexity : O(1) no extra space
    // Did this code successfully run on Leetcode : yes

    // start inserting from m - 1 index
    // if m becomes 0 first; then just add the remaining elements from nums2 to nums1
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = nums1.length - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            nums1[l--] = nums1[m] < nums2[n] ? nums2[n--] : nums1[m--];
        }
        while (n >= 0) {
            nums1[l--] = nums2[n--];
        }
    }

    // Time Complexity : O(m + n)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : yes

    // start searching from bottom left corner of matrix
    // if curr element is greater than target search upwards
    // else search rightwards
    // return true if found
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;
        while (i >=0 && j < matrix[0].length) {
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] > target) {
                i--;
            } else {
                j++;
            }
        }
        return false;
    }
}