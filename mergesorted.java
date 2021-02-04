// Time Complexity :O(n+m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: we are comparing the elemnts of both the arrays and merging and storing them in the first array.

// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums1==null||nums2==null){return;}
        int i=m-1, j=n-1, index=m+n-1;
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[index]=nums1[i];
                i-=1;
            }
            else{
                nums1[index]=nums2[j];
                j-=1;
            }
            index-=1;
        }
        
        while(j>=0){nums1[index]=nums2[j];
                   j-=1;
                   index-=1;}
      }
}