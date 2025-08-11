class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // o(m+n)
        /* j > = i ==> n1[w] = n2[j] , w -- , j--
            i > j => n1[w] = n1[1] , w -- , i--
            if(i == -1 & j>=0){
                n1[w] = n2[j] , w -- , j--
            }
        */
        if(m == 1 && m+n == 1){ // handling ex 2
            return;
        }

        if( m==0 && n==1 ){ //handlinmg ex 1
            nums1[0] = nums2[0];
            return;
        }

        int j=n-1;
        int i=m-1;
        int w=m+n-1;

        while(j>=0){
            if( (i == -1 && j>=0) || (nums2[j] >= nums1[i]) ){
                nums1[w] = nums2[j];
                w--;
                j--;
            }
            else{
                nums1[w] = nums1[i];
                w--;
                i--;
            }
        }

    }
}