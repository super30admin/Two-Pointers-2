
// Time Complexity :  O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: No issues

// Your code here along with comments explaining your approach
// here we start checking the elements from the back. we compare the last element in both the arrays
// we place the greatest of them at the last position of the array. we decrement the pointer 
// from where we get the greatest element. 
// if p1 is shorter then we need to copy the remaining elements from p2. else p1 elements are already present in the array

class Solution {
    public   merge(int[] nums1, int m, int[] nums2, int n) {
        int p1= m-1;
        int p2=n-1;
        int index=m+n-1;
        while(p1>=0 && p2>=0)
        {
            if(nums1[p1]>nums2[p2])
            {
                nums1[index]=nums1[p1];
                index--;
                p1--;
            }else {
                 nums1[index]=nums2[p2];
                 index--;
                 p2--;
            }
        }
        while(p2>=0)
        {
            nums1[index] = nums2[p2];
            index--;
            p2--;
        }
    }
}