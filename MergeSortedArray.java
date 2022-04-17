
// Time Complexity : O(N+M)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/*

we start copying the larger element b/w nums[r1] and nums[r2]
at nums[r3].

*/


public class MergeSortedArray{

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums1==null && nums2 == null) return;
        
        int r1 = m-1;
        int r2=n-1;
        int r3 = m+n-1;
        
        while(r1>=0 && r2>=0)
            {
            if(nums1[r1]>nums2[r2])
            {
                nums1[r3]=nums1[r1];
                r1--;
            }
            else
            {
                nums1[r3]=nums2[r2];
                r2--;
            }
            r3--;
        }
        
        while(r2>=0)
        {
            nums1[r3]=nums2[r2];
            r2--;
            r3--;
        }
    }

    public static void main(String args[])
    {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m=3;
        int n = 3;
        merge(nums1, m, nums2, n);
        for(int i:nums1)
        {
            System.out.print(i+" ");
        }
    }
}