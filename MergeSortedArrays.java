// Time Complexity : For the 3 pointer approach - O(Max(m,n)) - m and n are the number of elements in the 2 lists
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /* 
         * Bruteforce way to merge the array -
         * First copy the nums2 array into nums 1 then sort the array
         * TC = O(N^2)
         * SC = O(1)
         */
        // for(int i=m;i<nums1.length;i++){
        //     nums1[i] = nums2[i-m];
        // }
        // int j = m-1;
        // int count = 0;
        // for(int i=m;i<nums1.length;i++){
        //     int idx = i;
            
        //     while(j>=0 && nums1[idx]<=nums1[j]){
        //         int temp = nums1[idx];
        //         nums1[idx] = nums1[j];
        //         nums1[j] = temp;
        //         idx = j;
        //         j--;
        //     }
        //     count++;
        //     j = m - 1 + count;
        // }

        /* 
         * Much better approach than previous one using 
         * 3 pointers(2 at last elements of the lists and one at last index of first list)
         *  and comparing between last elements of the two lists
         *  and putting the greater element at the end of the first list 
         */
        int i = m-1; int j = n-1; int k = m + n - 1;
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            } else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        } 

        while(i>=0){
            nums1[k] = nums1[i];
            i--;
            k--;
        } 


    }
}