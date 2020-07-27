/*
// Time Complexity : O(n+m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
  //strt from the end of the two lists,
  //write larget elem at the end of largest array.
  //work our way towards indx 0.
// Your code here along with comments explaining your approach
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1;
        m = m-1;
        n = n-1;

        //iterate while both lists are look at indx >= 0
        while(m >=0 && n >=0){
            if(nums1[m] > nums2[n]){
                nums1[k] = nums1[m];
                m--;
            }
            else{
                nums1[k] = nums2[n];
                n--;
            }
            k--;
        }

        //in case lrger array elems are coppied.
        //all elems in smaller array are smaller.
        //so copy them as is.
        while(n >= 0){
            nums1[k--] = nums2[n--];
        }
    }
}
