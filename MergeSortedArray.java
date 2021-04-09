
// Time Complexity : O(N+M)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
Traditional merging procedure of the Merge Sort algorithm only difference is we start filling elements from the end in the first array so that we do not need to shift all the elements

*/
// Your code here along with comments explaining your approach
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0){
            return;
        }
        int ptr1 = m-1;
        int ptr2 = n-1;
        int currPtr = m+n-1;
        while(ptr1 >= 0 && ptr2 >= 0 ){
            if(nums1[ptr1] > nums2[ptr2]){
                nums1[currPtr] = nums1[ptr1];
                ptr1--;
            }else{
                nums1[currPtr] = nums2[ptr2];
                ptr2--;
            }
            currPtr--;
        }
        
        while(ptr1 >= 0){
            nums1[currPtr] = nums1[ptr1];
            currPtr--;
            ptr1--;
        }
        while(ptr2 >= 0){
            nums1[currPtr] = nums2[ptr2];
            currPtr--;
            ptr2--;
        }
    }
}
