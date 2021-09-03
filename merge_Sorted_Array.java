//Time Complexity: O(m)
//Space Compelxity:O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null && nums2==null)
            return;
        int sp1=m-1;
        int sp2=n-1;
        int sp3=m+n-1;
        while(sp1>=0 && sp2>=0){
            if(nums1[sp1]>=nums2[sp2]){
                nums1[sp3]=nums1[sp1];
                sp3--;
                sp1--;
            }
            else{
                nums1[sp3]=nums2[sp2];
                sp3--;
                sp2--;
            }
        }
        while(sp2>=0){
            nums1[sp3]=nums2[sp2];
            sp3--;
            sp2--;
        }
        while(sp1>=0){
            nums1[sp3]=nums1[sp1];
                sp3--;
                sp1--;
        }
    }
}