//Time Complexity: O(m+n)
//Space Complexity: O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp1 = m-1;
        int temp2 = n-1;
        int temp3 = m + n - 1;
        while(temp2>=0 && temp1>=0)
        {
            if(nums2[temp2]>nums1[temp1])
            {
                nums1[temp3] = nums2[temp2];
                temp2--;
            }
            else{
                nums1[temp3] = nums1[temp1];
                temp1--;
            }
            temp3--;                
        }
        while(temp2>=0)
        {
            nums1[temp3] = nums2[temp2];
            temp2--;
            temp3--;
        }
    }
}