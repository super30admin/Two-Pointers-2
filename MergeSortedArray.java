// Time Complexity: O(m+n)
// Space Complexity: O(1)
// 88. Merge Sorted Array - Easy
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // when there are no elements in nums2
        if(nums2==null || n==0)
           return ;
        
        // When there are no elements in nums1
        if (m==0)
        {
            // nums1=Arrays.copyOfRange(nums2,0,n-1);
            for(int i=0;i<nums1.length;i++)
            nums1[i]=nums2[i];
            return;
        }
        int i=m-1, j = n-1, curr=nums1.length-1;
        while(curr>=0 && j>=0 && i>=0)
        {
            if(nums1[i] > nums2[j])
            {
                nums1[curr]=nums1[i];
                
                curr--;
                i--;
            }
            else
            {
                nums1[curr]= nums2[j];
                j--;
                curr--;
            }
            
        }
        
        // Remaining elements from nums2[]
        while(j>=0)
        {
            nums1[curr]=nums2[j];
            j--;
            curr--;
        }
            
    }
}