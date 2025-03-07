
/*
 time complexity O(N) N=m+n, space is constant.
* */
public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pt1 = m-1;
        int pt2 = n-1;
        int index = m+n-1;
        while(pt2 >= 0 && pt1 >= 0){
            if(nums2[pt2] > nums1[pt1]){
                nums1[index] = nums2[pt2];
                pt2--;
            } else{
                nums1[index] = nums1[pt1];
                pt1--;
            }
            index--;
        }

        while(pt2>=0){
            nums1[index] = nums2[pt2];
            pt2--;
            index--;
        }
    }
}
