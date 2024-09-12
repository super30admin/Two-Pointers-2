/*
Time complexity - O(n)
Space complexity - O(n)*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m ==0 && n ==0)
            return;
       
        int k = m+n-1;
        int i=m-1, j=n-1;
        //run loop till m and n is not reach the 0th index
        while(i >=0 && j >=0){
            //which ever element is greater keep storing at the last index 
            if(nums1[i] >= nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
        //if nums1 is exhaused
        while(j >=0){
            nums1[k--] = nums2[j--];
        }
        //if nums2 is exhaused
        while(i >=0){
            nums1[k--] = nums1[i--];
        }
    }
}
