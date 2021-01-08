class MergeArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int k = nums1.length-1;
        
        int i = m-1;
        int j = n-1;
        
        while(i >= 0 && j >= 0)
        {
            if(nums2[j] > nums1[i])
            {
                nums1[k--] = nums2[j--];
            }
            
            else 
            {
                nums1[k--] = nums1[i--];
            }
            
            
        }
        while(j >= 0)
        {
            nums1[k--] = nums2[j--];
        }
        
        
       ß
    }
}