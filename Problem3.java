public class Problem3 {
    // Time Complexity : O(n+m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
    //approach here is that as we know both arrays are sorted and there last index would exist the highest value of that array
    //take 3 ptr 1-> ptr over 1st array 2-> ptr over 2nd arrat, 3 -> ptr over 1st array where we're gonna replace the value of max of ptr1 and ptr2
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0){
            return;
        }

        int ptr1 = m-1;
        int ptr2 = n-1;
        int ptr3 = m + n - 1;

        while(ptr1>= 0 && ptr2>=0){
            nums1[ptr3] = Math.max(nums1[ptr1],nums2[ptr2]);
            ptr3--;
            if(nums1[ptr1] > nums2[ptr2]){
                ptr1--;
            }
            else{
                ptr2--;
            }
        }
        //there could be case ptr2 is not gone till its limit.
        while(ptr2>=0){
            nums1[ptr3] = nums2[ptr2];
            ptr2--;
            ptr3--;
        }
    }
}
