
// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
/*Approach - we are using 3 pointers one pointing to the end of the nums1 array,second pointing to the end of the nums2 array
 third pointing to the end of (m+n)elements of num1 array.*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=m-1;
        int k=n-1;
       int i=m+n-1;
        while(k>=0&&l>=0)
        {
            if(nums1[l]<=nums2[k]){
                nums1[i]=nums2[k];
                k--;
            }
            else
            {
                nums1[i]=nums1[l];
                l--;
            }
            i--;

        }
        while(k>=0){
            nums1[i--]=nums2[k];
            k--;
        }
    }
}