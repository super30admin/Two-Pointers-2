// Time Complexity :O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1; //end pointer to the first array without zeros
        int p2=n-1; //end pointer to the second array
        int f=m+n-1;  //end pointer for the big array
        while(p1>=0 && p2>=0)
        {
            if(nums1[p1]>nums2[p2])
            {
                nums1[f]=nums1[p1];
                p1--;
            }
            else{
                 nums1[f]=nums2[p2];
                 p2--;
            }
            f--;
        }
        while(p2>=0){ //that means all the elements in p1 are greater than atleast one element in p2
            nums1[f]=nums2[p2];
                 p2--;
            f--;
        }
    }
}