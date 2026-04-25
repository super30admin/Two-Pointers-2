
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 
// Three line explanation of solution in plain english- 
//Use two pointers starting from the ends of both arrays and fill the first array from the back.
//Compare elements: place the larger one at the end and move that pointer backward.
//Repeat until all elements from both arrays are merged.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1, p2=n-1;
        int idx=m+n-1;
        while(p1>=0 && p2>=0){
            if(nums2[p2]>nums1[p1]){
                nums1[idx]= nums2[p2];
                p2--;
            }else{
                nums1[idx]= nums1[p1];
                p1--;
            }
            idx--;
        }
        while(p2 >= 0){
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }
}