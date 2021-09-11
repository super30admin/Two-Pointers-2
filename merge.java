
// Time Complexity : o(n+m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: We maintain 2 pointers on each array and we start from m-1 and n-1 position in both arrays we see which of the number if highest from 2 numbers and add to towards the last position of the first array and decrease the pointer of the array which we have selected 

// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1P = m-1;
        int nums2P = n-1;
        int index = m+n-1;
        
        while(nums1P >= 0 && nums2P >=0){
            if(nums1[nums1P] > nums2[nums2P]){
                nums1[index] = nums1[nums1P];
                nums1P--;
            }
            else{
                nums1[index] = nums2[nums2P];
                nums2P--;
            }
            index--;
        }
        
        while(nums2P >= 0){
            nums1[index] = nums2[nums2P];
            nums2P--;
            index--;
        }
    }
}