
// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
set p1 and p2 to end index of arrays
set idx pointer last position of nums1 where the largest value should go
we merge two sorted arrays by comparing elements from the end and placing the greater element one at the back of the nums1 array
time - O(m+n)
space - O(1)*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int idx=m+n-1;//set to last idx of nums1 array
        while(p1>=0 && p2>=0){
            //check for greatest ending number in both arrays and set it to nums[idx]
            if(nums1[p1]<nums2[p2]){
                nums1[idx]=nums2[p2];
                idx--;
                p2--;
            }
            else{
                nums1[idx]=nums1[p1];
                idx--;
                p1--;
            }
        }
        //if p2>=0 then copy the remaining elements of nums2 array to nums1 array
        while(p2>=0){
            nums1[idx]=nums2[p2];
            idx--;
            p2--;
        }
    }
}