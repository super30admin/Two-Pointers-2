
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

//We will have pointers at the end of both arrays and add which one is bigger to the end of the first array. Whichever
//array has elements left we will just put all of them in the beginning. Thus all numbers are sorted into one array in
//the same manner of mergesort

public class MergeSorted {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = m+n - 1;
        int p1 = m - 1;
        int p2 = n -1;

        while(p1 >= 0 && p2 >= 0){
            //store whichever number is bigger from array
            nums1[idx] = Math.max(nums1[p1], nums2[p2]);
            if(nums2[p2] > nums1[p1]){
                p2--;
            }
            else{
                p1--;
            }
            idx--;
        }
        //if nums are left in nums2, add them all in beginning of nums1
        while(p2 >= 0){
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }
}