// Time Complexity : O (n) 
// Space Complexity : O (1) no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : minor issues

public class prob2 {

    public static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n){
        if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) return;
        int p1 = m - 1; int p2 = n - 1; int i = m + n - 1;
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[i] = nums1[p1];
                i--; p1--;
            }else{
                nums1[i] = nums2[p2];
                i--; p2--;
            }
        }
        while(p2 >= 0){
            nums1[i] = nums2[p2];
            i--; p2--;
        }
        
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        mergeSortedArray(nums1, nums1.length, nums2, nums2.length);
    }
    
}
