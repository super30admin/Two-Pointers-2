import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String args[]) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, nums2.length,nums2,nums2.length);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int idx = m+n-1;
        while(p1 >= 0 && p2 >=0) {
            if(nums1[p1] >=nums2[p2]) {
                nums1[idx] = nums1[p1];
                p1--;
                idx--;
            }
            else if(nums1[p1] < nums2[p2]) {
                nums1[idx] = nums2[p2];
                p2--;
                idx--;
            }
        }
        while(p2 >=0 && idx >=0) {
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
        System.out.println(Arrays.toString(nums1));
        
    }
    
}
