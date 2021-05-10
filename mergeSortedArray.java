class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums1.length == 0) return;
        int i = m - 1; 
        int j = n - 1; 
        int k = m + n - 1; //last index of nums1[]
        
        while(i >= 0 && j >= 0){ //check
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];  
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        
        while(j >= 0){ //when last element is remaining in nums2[]
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
