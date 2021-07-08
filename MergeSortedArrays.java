// Time Complexity : O(m+n) where m is the number of elements in the array 1 and n is number of elements in array 2
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I was trying to move from the start 
/* Your code here along with comments explaining your approach: If we move from the start, we would face replacing hte element which are yet to be compared issue.
Hence, start from the end. i and j denotes the last position of element occurance in their respective arrays and k represents the total length of array 1
Compare nums1[i] and nums2[j] and assign the larger element to the end of the list using k pointer. Decrement the respective pointers and comparison
continues till we reach the start of the array. If nums1.length is lesser than nums2.length, nums 1 will get over quickly than nums2. Hence, the 
remaining elements of nums 2 are copied in nums 1 at the end as we get over with the comparisons. 
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1, k = m+n-1;
        while(i >=0 && j>=0){
            if(nums1[i] < nums2[j]){                // Put the largest element at the end
                nums1[k] = nums2[j];
                j--;
                k--;                                // Decrement the respective pointers 
            } else {
                nums1[k] = nums1[i];
                i--;
                k--;
            }
        }
        while(j >= 0){                                  // Remaining elements of nums 2 are copied into nums 1 iff any.
            nums1[k] = nums2[j];    
            j--;
            k--;
        }
    }
}