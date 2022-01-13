// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: I initialized 3 pointers two(i,j) starting from last index of the array and one(k) at the end of un-utilized space in nums1 arr. Inside the while loop which ran till the arr was at index 0, i checked 3 three conditions to store the elements of my curr index at k'th index by comparing them. Then for the edge case, that is when no sorting was required, i used another while loop to store the elements from 2nd arr into first arr  

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m - 1;
        int j = n - 1;
        
        int k = nums1.length - 1;
        
        while(i >= 0 && j >= 0){
            if(nums1[i] < nums2[j]){
                nums1[k] = nums2[j];
                j--;
                k--;
                
            } else if( nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
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
        
    }
}