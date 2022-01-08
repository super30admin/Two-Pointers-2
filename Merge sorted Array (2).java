//Time complexity: O(m+n)
//Space complexity: O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0)
        {
            for(int i=0;i<n;i++)
            {
                nums1[i]=nums2[i];
            }
        }
        
        if(m>0 && n>0){
        int j=m-1; int k=n-1; int i;
        for(i=m+n-1;i>=0;i--)
        {
            if(j>=0 && k>=0){
            if(nums1[j]>nums2[k])
            {
                nums1[i]=nums1[j];
                j--;
            }
            else
            {
                nums1[i]=nums2[k];
                k--;
            }
        }
            else
            {
                break;
            }
        }
       
    if(j<0)
    {
        while(k>=0 && i>=0)
        {
            nums1[i]=nums2[k];
            i--;
            k--;
        }
    }
    if(k<0)
    {
        while(j>=0 && i>=0)
        {
            nums1[i]=nums1[j];
            j--;
            i--;
        }
    }
}
    }
}