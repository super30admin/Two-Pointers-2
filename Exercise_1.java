
//Time Complexity - O(n+m)
//Space Complexity - O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // using three pointers

        // set 2 pointers to the end of each array

        int p1 = m-1;
        int p2 = n-1;

        //third pointer
        for( int p = m + n - 1; p >= 0; p-- ) {

            //end of array break
            if(p2 < 0) {
                break;
            }

            // moving first pointer case
            if( p1 >= 0 && nums1[p1] > nums2[p2]) {

                nums1[p] = nums1[p1];
                p1--;

            }

            // moving second pointer case
            else  {

                nums1[p] = nums2[p2];
                p2--;

            }


        }


    }
}