
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :     Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pt1 = m-1; 
        int pt2 = n-1;
        int index = m+n-1;
        while(pt2 >= 0 && pt1 >= 0){
           if(nums2[pt2] > nums1[pt1]){
                nums1[index] = nums2[pt2];
                pt2--;
            } else{
                nums1[index] = nums1[pt1];
                pt1--;
            }
            index--;
        }
        while(pt2>=0){
            nums1[index] = nums2[pt2];
            pt2--;
            index--;
        }
    }
  }