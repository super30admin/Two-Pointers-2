public class problem2_merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1, insert = m+n-1;
        
        while(p1 >= 0 && p2 >= 0){
            if (nums1[p1] >= nums2[p2])
            {
                nums1[insert] = nums1[p1];
                --p1;
            }
            else{
                nums1[insert] = nums2[p2];
                --p2;
            }
            --insert;
        }
        
        while(p2>=0){
            nums1[insert] = nums2[p2];
            --p2;
            --insert;
        }
        while(p1>=0){
            nums1[insert] = nums1[p1];
            --p1;
            --insert;
        }
    }
}
