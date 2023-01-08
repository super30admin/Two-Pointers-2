// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//Approach: In this approach we keep two pointers at the end of both the arrays. And we keep a moving pointer to end of nums1
//Then we compare the values at the end of both arrays. If it is greater we place that value at the end of the nums1 and we decrement the current pointer
//and we start filling nums1 like that.

public class MergeSorted {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(n ==0) return;
        if(m==0) nums1[0]= nums2[0];
        int nums1High = m-1;
        int nums2High = n-1;
        int curr= nums1.length-1;
        while(nums1High>=0 && nums2High >= 0){
            if(nums2[nums2High]>nums1[nums1High]){
                nums1[curr]= nums2[nums2High];
                curr--;
                nums2High--;
            }else{
                nums1[curr]= nums1[nums1High];
                curr--;
                nums1High--;
            }
        }
        while(nums2High >= 0){
            nums1[curr]= nums2[nums2High];
                curr--;
                nums2High--;
        }
    }
}
