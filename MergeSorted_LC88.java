//Time: O(n+m)

//Space = O(1) 

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums2 == null)
            return;
        
        int i = m - 1;
        int j = n - 1;
        int end = m + n - 1;
        
        //iterate if either of the arrays are traversed
        while(i >= 0 && j >= 0){
            //if nums2 is greater than nums1 place it at the end of nums1
            if(nums2[j] > nums1[i]){
                nums1[end--] = nums2[j--];
            }
            else{
                nums1[end--] = nums1[i--];
            }
        }
        
        //if there are still elements in nums2
        while(j >= 0){
            nums1[end--] = nums2[j--];
        }
    }
}