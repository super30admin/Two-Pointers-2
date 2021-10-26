// Merger Sorted Array
// solved on leetcode
// time complexity - O(n);
// space complexity- O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
        int k=nums1.length-1;
        int i=n-1;
        int j=m-1;
        while(j>=0 && i>=0){
            
            if(nums1[j]>nums2[i]){
                nums1[k]=nums1[j];
                k--;
                j--;
            }else{
                nums1[k]=nums2[i];
                k--;
                i--;
            }
        }
        
        while(i>=0){
            nums1[k]=nums2[i];
            k--;
            i--;
        }
        
        
    }
}