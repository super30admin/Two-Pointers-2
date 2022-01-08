// Time Complexity : O(m + n) where m and n are length of input arrays
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

public class MergeSortedarray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m=3,n=3;
        merge(nums1, m, nums2, n);
        for(int i: nums1){
            System.out.print(i + " ");
        }
    }   
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums2 == null){
            return;
        }
        int n1 = m-1, n2 = n-1, i = n + m - 1;
        
        while(n1 >=0 && n2 >=0){
            if(nums1[n1] > nums2[n2]){
                nums1[i--] = nums1[n1--];
            }else{
                nums1[i--] = nums2[n2--];
            }
        }
        while(n2 >= 0){
            nums1[i--] = nums2[n2--];
        }
    }
}
