package TwoPointers2;

//Source Link: https://leetcode.com/problems/merge-sorted-array/
//    Time complexity : o(n+m) 
//    space complexity: o(1) 
//    Did this code run successfully in leetcode : yes
//    problems faces : no*/

public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int pointer1 = m-1;
        int pointer2 = n-1;
        int i = m+n-1;

        while(pointer1>=0 && pointer2>=0)
        {
            if(nums1[pointer1] > nums2[pointer2])
             {
                nums1[i] = nums1[pointer1];
                pointer1--;
              }else
              {
                  nums1[i] = nums2[pointer2];
                  pointer2--;
              }

            i--;
        }
        while(pointer2>=0)
        {
            nums1[i] = nums2[pointer2];
            pointer2--;i--;
        }

    }

}