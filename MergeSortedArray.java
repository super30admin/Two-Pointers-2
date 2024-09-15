// Time Complexity : O(m+n) m, n are gvn inputs
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

/**
 * Transfer all the nums1 ele to the end of the nums1 array and then after each comparision move the smallest ele from the start of nums1 array
 */
// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0 ) return ;
        int m2 = m-1, len1 = nums1.length-1;

        while(m2>=0){                              //O(m)
            nums1[len1--] = nums1[m2--];
        }
        int pt1 = len1+1, pt2 = 0,pt3 = 0;

        while(pt1<(m+n) && pt2<n){
            if(nums1[pt1] <= nums2[pt2]){
                nums1[pt3++] = nums1[pt1++];
            }
            else if(nums1[pt1] > nums2[pt2]){
                nums1[pt3++] = nums2[pt2++];
            }
        }
        while(pt2<n && pt3<nums1.length){
            nums1[pt3++] = nums2[pt2++];
        }
    }
}


// Time Complexity : O(m+n) m, n are gvn inputs
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes

/**
 * populate from the largest ele as the numbers at the end of nums1 is blank.
 * So check the largest of the gvn 2 arrays and populate the largest ele at the end of the nums1 array and go on
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr3=(m+n)-1,ptr2 = n-1, ptr1 = m-1;
        while(ptr3 >= 0 && ptr1 >= 0 && ptr2 >= 0){
            if(nums1[ptr1] > nums2[ptr2]){
                nums1[ptr3--] = nums1[ptr1--];
            }else {
                nums1[ptr3--] = nums2[ptr2--];
            }
        }
        while(ptr2 >= 0){
            nums1[ptr3--] = nums2[ptr2--];
        }
    }
}