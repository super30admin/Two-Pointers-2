class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length<nums2.length)
            return;
       
        int res[] = new int[nums1.length-1];
        int mp= m-1;
        int np = n-1;
        int current = m+n-1;
        
        while(mp>=0 && np>=0){
            if(nums1[mp]<nums2[np])
            {
                nums1[current--]=nums2[np--];
            }
            else
            {
                nums1[current--]= nums1[mp--];
            }         
        }
        
    while (np >= 0) { 
        nums1[current--] = nums2[np--];
    }
        
       
    }
}