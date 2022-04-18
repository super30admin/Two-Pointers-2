// Time Complexity : O(N^2) where N is the number elements in array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// 3ptrs technique. ** start from the right most p1=m-1, p2=n-1, p3=m+n-1, set elements to p3 and move ptrs

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null && nums2==null) return;

        int p1=m-1;
        int p2=n-1;
        int p3=m+n-1;

        while(p1>=0 && p2>=0){
            if(nums1[p1] > nums2[p2]){
                nums1[p3]=nums1[p1];
                p1--;
            }else{
                nums1[p3]=nums2[p2];
                p2--;
            }
            p3--;
        }

        while(p2>=0){
            nums1[p3]=nums2[p2];
            p2--;
            p3--;
        }
    }
}
