// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 We start from the end of both the arrays whichever element is bigger we put it at the end of first array and decremenet respective pointer for that array.
*/


public class MergeArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
     
        int first=m-1;
        int second=n-1;
        int i=(m+n)-1;
         
        while(first>=0 && second>=0)
        {
            if(nums1[first]>nums2[second])
            {
                nums1[i--]=nums1[first];
                first--;
            }
            else {
                  nums1[i--]=nums2[second];
                second--;
            }
        }
         
        while(first>=0)
        {
              nums1[i--]=nums1[first];
            first--;
            
        }
        while(second>=0)
        {
              nums1[i--]=nums2[second];
             second--;
            
        }   
            
     }
     public static void main(String[] args)
     {
       int[] nums1 = {1,2,3,0,0,0};
       int[] nums2 = {2,5,6};

       int m=3;
       int n=nums2.length;

      merge(nums1,m,nums2,n);
      for(int i=0;i<nums1.length;i++)
      System.out.println(nums1[i]);
        
     }
    
}