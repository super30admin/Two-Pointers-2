
// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// In this approach we use three pointers. We keep one pointer at last element of the second arrray , one pointer at the last non zero number of the 
// first array and we keep one pointer at the last index of the first array. If we see the element in first array is bigger than the element in the
// second array we move it to the last index. If element in second array is bigger than the element in the first array we put that element to the last index
// that the third pointer is pointing at.
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       //pointer for element being compared in the first array 
      int p1 = m-1;
      //pointer for element being compared in the second array 
      int p2 = n-1;
      //pointer for storing the element coming from the right side of the first array
      int i = nums1.length-1;
      
      while(p1>=0&& p2 >=0)
      {
    	
        if(nums1[p1]>= nums2[p2])
        {
        	//move the current element to the end
          nums1[i] = nums1[p1];
          p1--;
        }
        else
        {
        	//move the element from second array to the i pointer in first array
          nums1[i]= nums2[p2];
          p2--;
        }
        i--;
      }
      //put rest of the elements to the first array
      while(p2 >=0)
      {
        nums1[i] = nums2[p2];
        p2--;
        i--;
      }
      
          
    }
}