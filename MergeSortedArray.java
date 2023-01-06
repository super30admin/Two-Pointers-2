// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
// We use two pointers for each of the arrays to traverse in the reverse direction from m-1, n-1
// We compare the values at these pointers and then update the array from index m+n-1 using another variable
// We repeat this till we reach the end of array. If elements are still remaining in nums2 array, we copy those items

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int idx = m+n-1;
        while(p1>=0&&p2>=0){
            if(nums1[p1]>nums2[p2])
                nums1[idx--] = nums1[p1--];
            else
                nums1[idx--] = nums2[p2--];
        }
        while(p2>=0){
            nums1[idx--] = nums2[p2--];
        }
    }
}