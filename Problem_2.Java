// Time Complexity : O(m + n)
// Space Complexity : O(m + n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// take 3 pointers one for each array and compare each array value and increase the pointer
// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] ans = new int[m+n];
        int i = 0, j = 0, k = 0;
        while(i < m && j < n){
            // compare two array and set the smallest one
            if( nums1[i] < nums2[j] ){
                ans[k] = nums1[i];
                i++; k++;
            }else{
                ans[k] = nums2[j];
                j++; k++;
            }
        }
        // store the remaining values
        while( i < m ){
            ans[k] = nums1[i];
            k++; i++;
        }
        while( j < n ){
            ans[k] = nums2[j];
            k++; j++;
        }
        // set the result array to the actual num1 array
        for( int p = 0; p < m+n; p++){
            nums1[p] = ans[p];
        }
    }
}