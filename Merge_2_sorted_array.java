// Time Complexity : O(m+n)
// Space Complexity : O(m+n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Here I am using 2 pointer approach, where both the pointers start from the end, we do not start from the first index because there could be case where the last number in the first array could be greater than the last number in the second array and while swaping out the elements there are chances of breaching the sorted array property given in the problem to solve this porblem we use the using pointers at the end of each array approach. then we just keep on comparing each array element and use a insersion index to add the elements in first array empty position.

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1; int p2=n-1;
        int idx = n+m-1;

        while(p1>=0 && p2>=0){
            if (nums1[p1] >= nums2[p2]){
                nums1[idx] = nums1[p1];
                p1--;
            } else{
                nums1[idx] = nums2[p2];
                p2--;
            }
            idx--;
        }
        while(p2>=0){
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }
}