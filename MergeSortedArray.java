//Time complexity:O(m+n)
//Space complexity:O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null|| nums2==null) return ;
       int p1=m-1,p2=n-1,last = m+n-1;

    while(p1>=0 && p2>=0){
        if(nums1[p1]>nums2[p2]){
            nums1[last] = nums1[p1];
            last--;
            p1--;
        }
        else{
            nums1[last] = nums2[p2];
            last--;
            p2--;
        }
    }
    while(p2>=0){
        nums1[last] = nums2[p2];
        p2--;
        last--;
    }
        
    }
}