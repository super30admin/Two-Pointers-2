public class MergeSortedArray {

    //Using 3 pointers
    //Time complexity: O(length of nums1)
    //space complexity: O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0){
            return;
        }

        //using 3 pointers

        int k = m + n - 1;
        m = m - 1;
        n = n - 1;

        while(m >= 0 && n >= 0) {
            //compare m and n
            if(nums1[m] >= nums2[n]) {
                //swap m and final
                nums1[k] = nums1[m];
                m--;
            }
            else {
                //swap n and final
                nums1[k] = nums2[n];
                n--;
            }
            k--;
        }

        while(k >=0 && n >= 0){
            nums1[k] = nums2[n];
            k--;
            n--;
        }

    }
}
