//TimeComplexity O(m+n)
//Spacecomplexity O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int right1 = m-1;
        int right2 = n-1;
        int end = m+n-1;
        
        while(end >= 0 && right2 >= 0 && right1 >= 0){
            if(nums2[right2] > nums1[right1]){
                nums1[end] = nums2[right2];
               
                end--;
                right2--;
                
            }else{
                nums1[end] = nums1[right1];
                right1--;
                end--;
            }
        }
        while(right2 >= 0){
            nums1[end] = nums2[right2];
            right2--;
            end--;
        }
    }
}
