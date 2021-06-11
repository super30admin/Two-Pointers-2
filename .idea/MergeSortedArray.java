public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null || nums2==null || nums1.length == 0 || nums2.length==0)
            return;
        int k = n-1;
        int j = nums1.length - 1;
        int i = m - 1;
        while(i>=0 && k>=0 && j>=0)
        {
            if(nums1[i]>=nums2[k]) {
                nums1[j] = nums1[i];
                j--;
                i--;
            }
            else
            {
                nums1[j] = nums2[k];
                j--;
                k--;
            }
        }
        while(k>=0)
        {
            nums1[j] = nums2[k];
            j--;
            k--;
        }
    }
    public  static void main(String args[])
    {
        int[] num1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n =3;
        MergeSortedArray ob = new MergeSortedArray();
        ob.merge(num1,m,nums2,n);

    }
}
//time complexity is O(m + n)
//space complexity is O(1)
