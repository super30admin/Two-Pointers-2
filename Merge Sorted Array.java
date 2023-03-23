class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Time: O(M + N)
        //Space: O(M+N)
        
        //The trick here is to start looking from the end of the array.
        //This should not be an easy question.
        
        int nums2_pointer = n - 1;
        int nums1_pointer = m - 1;
        
        int nums1_last = nums1.length - 1;
        
        while(nums1_last >= 0){
            
            if(nums1_pointer >= 0 && nums2_pointer >= 0){
                
                if(nums2[nums2_pointer] >= nums1[nums1_pointer]){
                    nums1[nums1_last] = nums2[nums2_pointer];
                    nums2_pointer --;
                }
                
                else{
                    nums1[nums1_last] = nums1[nums1_pointer];
                    nums1_pointer --;
                }
            }
            
           else if(nums2_pointer >= 0){
               
               nums1[nums1_last] = nums2[nums2_pointer];
               nums2_pointer --;
               
           }
            
            else{
                
                nums1[nums1_last] = nums1[nums1_pointer];
                nums1_pointer --;
                
            }
            
           
            nums1_last --;
           
            
        }
    }
}