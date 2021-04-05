/*
 *  Time Complexity: O(M+N) Where M is the length of nums1 and N is the length of nums2.
 *  Space Complexity: O(1) Since we are mutating the nums1 array.
 *
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : Design the approach to hold the min element.
 *
 *  Explanation: We point two indexes at the last valid element in both the arrays, and we have a current index pointing to the last element in the nums1 array. We identify the larger element in both the indexes and replace the current index with that value. We then decrement the current index and index where we found the larger value. If either of the index go out of bounce we break out of the loop and add all the remaining element in the other loop to the current index. 
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1=m-1, idx2=nums2.length-1, currIdx=nums1.length-1;
        while(idx1>=0 && idx2>=0){
            if(nums2[idx2]>nums1[idx1]){
                nums1[currIdx]=nums2[idx2];
                idx2--;
            }else{
                nums1[currIdx]=nums1[idx1];
                idx1--;
            }
            currIdx--;
        }
        if(idx1>=0){
            while(idx1>=0){
                nums1[currIdx]=nums1[idx1];
                idx1--;
                currIdx--;
            }
        }
        if(idx2>=0){
            while(idx2>=0){
                nums1[currIdx]=nums2[idx2];
                idx2--;
                currIdx--;
            }
        }
    }
}
