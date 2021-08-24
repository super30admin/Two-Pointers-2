class mergeSort {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       

        //2 pointers to the end of each array
        int pointer1 = m-1;
        int pointer2 = n-1;

        //third pointer
        for( int p = m + n - 1; p >= 0; p-- ) {

            //end of array break
            if(pointer2 < 0) {
                break;
            }

            // moving first pointer case
            if( pointer1 >= 0 && nums1[pointer1] > nums2[pointer2]) {

                nums1[p] = nums1[pointer1];
                pointer1--;

            }

            // moving second pointer case
            else  {

                nums1[p] = nums2[pointer2];
                pointer2--;

            }

        }

        
    }
}