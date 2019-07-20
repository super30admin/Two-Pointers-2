// Time Complexity : O(nlogn) - As we used Arrays.sort method
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : Simple brute force solution using third array and copying elements of both the arrays into the third. after using Array.sort we can transfer elements back to nums1[]

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] arr = new int[m+n];
        int i;
        for(i = 0; i<m;i++){
            arr[i]= nums1[i];
        }
        for(int j = 0; j<n;j++){
            arr[i]= nums2[j];
            i++;
        }
        Arrays.sort(arr);
        for(i = 0; i<nums1.length; i++){
            nums1[i]= arr[i];
        }
        
    }
}