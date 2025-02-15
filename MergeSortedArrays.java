// Time Complexity : O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Using two pointer approach to compare the arrays from the end and 
//replacing the greater value at the end of first array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2  = n-1;
        int index = m+n-1;

            while(p1>=0 && p2>=0){
                if(nums1[p1]<nums2[p2]){
                    nums1[index]=nums2[p2];
                    p2--;
                }
                else{
                    nums1[index]= nums1[p1];
                    p1--;
                }

                index--;

            }

        while(p2>=0){ // copying elements from nums2 to nums1 when p2>=0;
            nums1[index] = nums2[p2];
            p2--;
            index--;
        }        
    }
}