// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// take 3 pointers one for two arrays and and 1 form the end of the array, then start from the end of the array till its zero th index and swap if they are big value is found.
// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = (m-1), j = (n-1), k= (m+n-1);
        while( i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k] = nums2[j];
            k--; j--;
        }
    }
}
/*
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
*/