// Time Complexity : O(n) as we will be iterating through array once
// Space Complexity : O(1) as we are not going to use any extra space other than input and output.
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
// Here we know that array is sorted. So, we will keep slow pointer at 0th index and our fast pointer will start from 1st index and we will maintain a count which 
// is initialized to 1 for 1st element. Now, we will check if the current element is same as previous element, if it is we will increase count by 1 or if it is 
// not same that means it is a first occurance of new element so we will set counter to 1. Then we will check if the count is less than or equal to 2 if it is then
// we will increase slow pointer by 1 and we will replace that element with current element. At the end we will return slow+1 as we are accounting for last element
// for which we did not increase slow pointer.

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int slow = 0;
        int count = 1;

        int k = 2;
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                count = count + 1;
            } else {
                count = 1;
            }
            if (count <= k) {
                slow = slow + 1;
                nums[slow] = nums[i];
            }
        }

        return slow+1;
    }
}


// Time Complexity : O(m+n) as we will iterate through both the arrays.
// Space Complexity : O(1) as we are filling up the elements in-place.
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
// The main idea here is nums1 array has enough length to accomodate both nums1 and nums2 so we will start filling it up from last element. So, we will keep 2 
// pointers p1 and p2 at the end of nums1 and nums2 arrays respectively. Then we will check which element is bigger betweeen these 2 and will fill that element
// in last index of nums1 array. If we fill it from nums1 then we will decrease p1 pointer if we do it from num2 then we will decrease p2 pointer. In any case 
// we will decrease the index of nums1 array from last element as we will be definitely filling it. If we are done with nums2 and p1 pointer of num1 is still 
// at some mid index it's fine we don't need to accomodate that. But if we are done with nums1 array and our p2 pointer is somewhere in the nums2 array then we 
// will fill all remaining elements from nums2 to nums1 one by one.

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int idx = m+n-1;

        while(p1 >= 0 && p2 >= 0) {
            if(nums1[p1] >= nums2[p2]) {
                nums1[idx] = nums1[p1];
                p1--;
            } else {
                nums1[idx] = nums2[p2];
                p2--;
            }
            idx--;
        }

        while(p2 >= 0) {
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }
}


// Time Complexity : O(m+n) as we will go over the rows (m) and once we find the row we will go over the column (n).
// Space Complexity : O(1) as we are not going to use any extra space other than input and output.
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
// The main idea here is check which side of the matrix shows constant increasing pattern. So, we will start from 0th row and last column as last column shows 
// increasing pattern from top to bottom and row shows decreasing pattern from right to left. Here simple logic is if the current element is target we will return
// true otherwise we will check if the target is greater than current element if it is then we can go to next row eliminating this row as the current shows 
// decreasing pattern in the left. If target is less than the current element we will go to the left element of the row by decreasing column index as 
// row shows decreasing pattern from right to left. If we do not find an element we will return false.

// Your code here along with comments explaining your approach
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n - 1;

        while(row < m && col >= 0) {
            if(matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row = row + 1;
            } else {
                col = col - 1;
            }
        } 

        return false;
    }
}