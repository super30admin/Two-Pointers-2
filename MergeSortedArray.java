// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes. Forgot about the condition when p2 is still positive we need to copy elements

/*
Approach: Used 2 pointer technique. We have 3 variables p1(m-1), p2(nums2.length -1) and p3(nums1.length -1). Comparing p1 & p2 to put them in place of p3. Lastly, check if p2 is postive
we need to copy the elements from nums2 to nums1
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m == 0 && nums1[0] == 0){
            nums1[0] = nums2[0];
        }

        int p1 = m-1;
        int p2 = nums2.length - 1;
        int p3 = nums1.length - 1;

        while(p1 >= 0 && p2 >=0){

            if(nums2[p2] > nums1[p1]){
                nums1[p3] = nums2[p2];
                p2--;
                p3--;
            }
            else{
                nums1[p3] = nums1[p1];
                p1--;
                p3--;
            }
        }

        //This indicates the elements from nums2 are not completely copied
        while(p2 >= 0){
            nums1[p3] = nums2[p2];
            p2--;
            p3--;
        }
    }
}

//Approach: Brute force approach. Time Complexity is O(m+n)log(m+n) as we are sorting

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {

//        //O(n)
//        for(int i =0; i<nums2.length; i++){
//             nums1[m] = nums2[i];
//             m++;
//        }

//        Arrays.sort(nums1); //O(m+n)log(m+n)
//     }
// }