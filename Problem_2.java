// Time Complexity : O(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

//starting from last index of array nums1, comparing the last elements of nums1 and nums2 using 2 pointers
//whichever is greater, putting it in last index of nums1 and moving 1 index to the left of both nums 1 and of greater amongst nums1 and nums2
//returning nums1 which has the merged sorted array

// Your code here along with comments explaining your approach

//88. Merge Sorted Array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if((m == 0) && (n != 0)){
            for (int i = 0; i < n; i++){
                nums1[i]=nums2[i];
            }
        }
        int i=m, j=n;
        if ((m != 0)&&(n != 0)){
            while ((i > 0)&&(j > 0)){
                if (nums2[j-1] >= nums1[i-1]){
                    nums1[(i+j)-1] = nums2[j-1];
                    j--;
                }
                else{
                    nums1[(i+j)-1] = nums1[i-1];
                    i--;
                }
            }
            if(i==0){
                while(j > 0){
                    nums1[j-1]=nums2[j-1];
                    j--;
                }
            }
        }
    }
}