// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

//Time Complexity : O(mn) since we are iterating through both of the arrays
//Space Complexity: O(1) since we are not taking any extra space

 public void merge(int[] nums1, int m, int[] nums2, int n) 
 {
        //[1,2,3,0,0,0] , m=3, [2,5,6], n=3
         int ptr1 = m - 1; 
         int ptr2 = n - 1;
         int i = m + n - 1;
        
         while(ptr1 >= 0 && ptr2 >= 0)
         {             
             if(nums1[ptr1] > nums2[ptr2]){ //Since the arrays are sorted it would be easy to verify the ends
                nums1[i] = nums1[ptr1];
                ptr1--;   
             }
             else
             {
                nums1[i] = nums2[ptr2];
                ptr2--;
             }
             i--;
         }                   
         while(ptr2>= 0){ // In case if ptr1 reaches 0 and ends the earlier loop
             nums1[i] = nums2[ptr2];
             ptr2--;
             i--;
         }
 }