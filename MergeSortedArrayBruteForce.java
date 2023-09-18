class MergeSortedArrayBruteForce {
    //Using Brute Force storing values in result matrix
    //TC will be O(m + n(log (m+n)))
    //SC will be O(1)

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(nums2 == null || nums2.length==0){ //Base cond to check nums2 is empty means nums1 is already sorted.
            return;
        }

        int i=0;        //pointer for nums1 array.
        int j=0;        //pointer for nums2 array.
        int k=0;        // pointer for sorted result array.
        int[] result = new int[m+n]; //array to store sorted elements


        while(i<m && j<n)       //travering through nums1 and nums2
        {
            if(nums1[i]<nums2[j])
            {
                result[k]=nums1[i];
                i++;
            }
            else {
                result[k]=nums2[j];
                j++;
            }
            k++;
        }


        while(i<m)//if any value left in nums1
        {
            result[k] = nums1[i];
            k++;
            i++;
        }


        while(j<n)  //if any value left in nums2
        {
            result[k] = nums2[j];
            k++;
            j++;
        }


        //to copy all the elements in nums array.
        for(int r=0;r<nums1.length;r++)
        {
            nums1[r] = result[r];
        }

        for(int num: nums1){
            System.out.println(num);
        }

    }

    public static void main(String[] args){
        MergeSortedArrayBruteForce obj= new MergeSortedArrayBruteForce();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        obj.merge(nums1,m,nums2,n);
    }
}