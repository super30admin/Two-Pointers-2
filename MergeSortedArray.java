// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //we will need 3 pointers
        //start from end so that elements of first array are not overwritten
        int p1 = m-1; //iterates first array
        int p2 = n-1; //iterates second array

        //iterates over space to be filled in first array
        for(int p=m+n-1; p>=0; p--) {

            //check bounds because these pointers are being changed inside the loop
            if(p2<0)
                break;

            //whichever is bigger goes first because we started from the back

            if(p1>=0 && nums1[p1] > nums2[p2])
            {
                nums1[p] = nums1[p1];
                p1--;
            }

            else {

                nums1[p] = nums2[p2];
                p2--;
            }

        }

    }
}
