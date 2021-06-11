//time complexity:O(m + n)
//space complexity:O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;//last index of the nums1
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k]=nums1[i];//replace the value at the end
                //of the array by the value at ith index if the 
                //condition is satisfied
                k--;i--; //decrement the respective counters 
            }
            else
            {
                nums1[k]=nums2[j];//replace the element in nums1 by 
                //nums2 element if the nums2 element is greater
                j--;k--;
            }
           
        }
         while(j>=0)
            {
                nums1[k]=nums2[j]; //if there are any remaining elements
             //in the nums2 then add them to the nums1
                j--;k--;
            }
    }
}
