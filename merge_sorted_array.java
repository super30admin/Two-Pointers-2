class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null || nums2 ==null)
        {
            return;
        }
        
        int pm = m-1;
        int pn = n-1;
        
        int pinsert = nums1.length-1;
        
        while(pinsert!=-1)
        {
            
            if(pm==-1 || pn==-1)
            {
                break;
            }           
            if(nums1[pm] > nums2[pn] || nums1[pm] == nums2[pn])
            {
                nums1[pinsert] = nums1[pm];
                pm--;
            }
            else{
                nums1[pinsert] = nums2[pn];
                pn--;
            }
            pinsert--;        
        }
        
        while(pn>-1)
        {
            nums1[pinsert] = nums2[pn];
            pn--;
            pinsert--;
        }
        
    }
}
