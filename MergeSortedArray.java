// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Approach: We use the 2 pointer approach with an extra pointer(idx) to traverse nums1 array.
// Start pointer1(p1) from last non-zero th index in nums1 array i.e. from m+n-1 index & pointer p2 from n-1 of nums2.
// If either element between nums1 and nums2 is greater, put it in the idx index position. 
// After that move the pointer(p1/p2) of the greater element to the left of its array until all arrays are traversed.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1; //last non-zero th index in nums1
        int p2=n-1; //last index in nums2
        int idx=m+n-1; //last index in nums1
        
        while(p1>=0 && p2>=0){
            if(nums1[p1]>=nums2[p2]){ //if nums1 is bigger
                nums1[idx]=nums1[p1]; //put it in last index
                p1--; //move p1 to left
            } else {
                nums1[idx]=nums2[p2]; //nums2 bigger, put it in idx
                p2--; //move p2 to left
            }
            idx--; //in any case, keep moving idx
        }
        while(p2>=0){ //If p1 finishes first
            nums1[idx]=nums2[p2]; //put all nums2 in remaining 0 positions of nums1
            p2--;
            idx--;
        }
        
    }
}