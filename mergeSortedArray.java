
// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
        /* Starting i and j from given length -1 and k from the lst position of nums1 array.
        simply chceking if the the value of nums1 is smaller than nums2 value then at kth position inserting which is amaller.
        and the loop will run while j and i are greater than 0 as we are starting from the end .*/
// Your code here along with comments explaining your approach


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m+n-1;
        int i = m-1;
        int j = n-1;
        
        while(i>=0 && j>=0){
            if(nums1[i]<nums2[j]){
                nums1[k]=nums2[j];
                j--;
                k--;
            }else{
                nums1[k]=nums1[i];
                i--;
                k--;
            }
        }
        
        while(j>=0){
            nums1[k]=nums2[j];
                --j;
                --k;
        }
    }
}