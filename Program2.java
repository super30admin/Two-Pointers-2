//Time Complexity : O(m+n)
//Space Complexity : O(1)


class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
	    int i = m-1;
        int j =n-1;
        int k = nums1.length-1;
        
        if(i<0 && j==0){
            nums1[j] = nums2[j];
        }
        
        while(i>=0 && j>=0 && k>=0){
            if(nums2[j] > nums1[i]){
                nums1[k] = nums2[j];
                j--;
                k--;
            }else if(nums2[j] <= nums1[i]){
                nums1[k] = nums1[i];
                i--;
                k--;
                
            }
        }
        
       while(j>=0 && k>=0){
           nums1[k] = nums2[j];
            k--;
           j--;
       }
        
    }
}