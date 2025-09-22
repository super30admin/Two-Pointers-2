public class Solution {
    public void Merge(int[] nums1, int m, int[] nums2, int n) {
        int j=m-1;
        
        for(var i=n-1;i>=0;)
        {
            if(j>=0 && i>=0)
            {
            if(nums2[i]>nums1[j])
            {
                nums1[i+j+1] = nums2[i];
                i--;

            }
            else
            {
                nums1[i+j+1]=nums1[j];
                j--;
            }
            }
            else if(i>=0)
            {
                nums1[i+j+1] = nums2[i];
                i--;
            }
        }
    }
}