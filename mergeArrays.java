Time : O(m+n)
Space:O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first=m-1;
        int second=n-1;
        int k=m+n-1;
        while(second>=0&&first>=0){
            if(nums1[first]>=nums2[second]){
                nums1[k]=nums1[first];
                k=k-1;
                first=first-1;
            }else if(nums1[first]<nums2[second]){
                nums1[k]=nums2[second];
                second=second-1;
                k=k-1;
            }
        }
        while(second>=0){
            nums1[k]=nums2[second];
            k--;
            second--;
        }

    }
}