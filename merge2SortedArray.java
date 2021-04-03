/*
Run time complexity - O(N+M)
Space complexity - O(1)
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)
            return;
        int temp=m+n-1;
        for(int i=m-1;i>=0;i--)
        {
            nums1[temp]=nums1[i];
            nums1[i]=0;
            temp--;
        }
        int a=n;
        int b=0;
        int pos=0;
        while(b<n && a<(m+n))
        {
            if(nums1[a]<=nums2[b])
            {
                nums1[pos]=nums1[a];
                nums1[a]=0;
                a++;
            }
            else if(nums2[b]<nums1[a])
            {
                nums1[pos]=nums2[b];
                b++;
            }
            pos++;
        }
        while(b<n)
        {
            nums1[pos]=nums2[b];
            b++;
            pos++;
        }
        //nums1 will already be in it's own position
    }
}
