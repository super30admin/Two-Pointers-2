// Time Complexity : The time complexity is O(m) where m is the length of the first array.
// Space Complexity : The space complexity is O(1).
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Since both the arrays are sorted, we can use 2 pointers to merge them. One pointer would be at the end of 1st array and the other
// at the end of second array. We will maintain the current index in array1 where the merged number has to be copied. If the number
// in second array is greater than the number in first array, copy num in array2 in the index and decrement pointer2. Similarly vice versa

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int pt1 = m-1;
        int pt2 = n-1;
        int idx = m+n-1;

        if(nums2.length == 0){
            return;
        }

        // Copy numbers from both the arrays in sorted order
        while(pt1>=0 && pt2>=0){
            if(nums2[pt2] >= nums1[pt1]){
                nums1[idx--] = nums2[pt2--];
            }
            else{
                nums1[idx--] = nums1[pt1--];
            }
        }

        // copy remaining numbers from array2 if any
        while(pt2 >= 0){
            nums1[idx--] = nums2[pt2--];
        }

    }
}