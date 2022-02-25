// Time Complexity:           O(m+n)
// Space Complexity:          O(1)
// where m is length of first array, n is length of second array
// Yes, this code ran successfully
// No, I didn't face any problem in this problem statement


public class MergeSorted {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        MergeSorted ms = new MergeSorted();
        ms.merge(nums1, m, nums2, n);
        for (int i:nums1) {
            System.out.print(i+" ");
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0)                                                 // if traversed all elements from either of the arrays
        {
            if(nums1[i]>nums2[j])                                           // filling up greater values
            {
                nums1[k] = nums1[i];
                i--;
            }
            else
            {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0)                                                        // if any element is remaining in second array
        {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
