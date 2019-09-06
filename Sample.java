
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
Iterate through the bigger array backwards.
  compare the numbers of the two sorted arrays in backwards direction until you reach the start.
  fill the max of compared numbers in the bigger array in the backwards direction.
// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a=m-1;
        int b=n-1;
        int c=m+n-1;
        for(c=m+n-1;c>=0;c--){ //iterate through nums1 backwards
            if(a<0){ //case when m<n
                nums1[c]=nums2[b];
                b--;
                continue;
            }
            else if(b<0){ //case when n<m, we don't have to sort more as nums1 is already sorted.
                // nums1[c]=nums1[a];
                // a--;
                // continue;
                break;
            }
            if(nums1[a]>nums2[b]){
                nums1[c]=nums1[a];
                a--;
            }
            else{
                nums1[c]=nums2[b];
                b--;
            }
        }
    }
}
