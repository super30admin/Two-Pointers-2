// Time Complexity : O(m + n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; //Pointer at the last elem of m as it's the highest number
        int p2 = n - 1; //Pointer at the last elem of n as it's the highest number
        int idx = m + n - 1; //Pointer at the last elem of m+n which is 0

        while(p1>=0 && p2>=0){
            if(nums1[p1] > nums2[p2]){ //If the elem at p1 is greater than p2
                nums1[idx] = nums1[p1]; //Replace the latest idx position with the highest number which is p1 here
                idx--;
                p1--;
            } else{
                nums1[idx] = nums2[p2]; //Otherwise replace the latest idx position with p2
                idx--;
                p2--;
            }
        }

        while(p2 >= 0){
            nums1[idx] = nums2[p2]; //Replace the remaining indexes with p2 if p2 is greater than 0
            idx--;
            p2--;
        }
    }
}