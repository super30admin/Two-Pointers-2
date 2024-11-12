// Time Complexity :O(2n) = O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx= m+n-1;
        int p1=m-1;
        int p2=n-1;

        while(p1>=0 && p2>=0){
            if(nums2[p2]>nums1[p1]){
                nums1[idx]=nums2[p2];
                p2--;
            }else{
                nums1[idx]=nums1[p1];
                p1--;
            }
            idx--;
        }

        while(p2>=0){
            nums1[idx]=nums2[p2];
            p2--;
            idx--;
        }
    }

}
