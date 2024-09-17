// Time Complexity :O(mn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : No
class MergeSorted {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int p3 = p1+p2+1;
        if (m ==0){
            for(int i = 0;i<n;i++){
                nums1[i]=nums2[i];
            }
        }

        while(p2>=0 && p1>=0){
            if(nums2[p2]>nums1[p1]){
                nums1[p3] = nums2[p2];
                p2--;
            }
            else{
                nums1[p3] = nums1[p1];
                p1--;
            }
            p3--;
        }
        while(p2>=0){
            nums1[p3] =nums2[p2];
            p2--;
            p3--;
        }

    }
}
