// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english:  Maintain 3 pointers and compare num1 and num2 at any point whichever is maximum, append that
// to the end of num1, at the end check for remaining elements in num2 and append everything

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n -1, p3 = m + n - 1;
        
        while(p1 >= 0 && p2 >= 0) {
            
            if(nums1[p1] > nums2[p2]) {
                nums1[p3--] = nums1[p1--];
            } else {
                nums1[p3--] = nums2[p2--];
            }
        }
        
        while(p2 >= 0) {
             nums1[p3--] = nums2[p2--];
        }
    }
}