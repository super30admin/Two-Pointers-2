import java.util.Arrays;

class mergeSortedArray{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null && nums2 == null) return;
        int r1 = m - 1;
        int r2 = n - 1;
        int r3 = m + n -1;

        while(r1 >= 0 && r2 >=0){
            if(nums1[r1] > nums2[r2]){
                nums1[r3] = nums1[r1];
                r1--;
            }
            else{
                nums1[r3] = nums2[r2];
                r2--;
            }
            r3--;
        }

        while(r2 >= 0){
            nums1[r3] = nums2[r2];
            r2--;
            r3--;
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        mergeSortedArray msa = new mergeSortedArray();
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        int m = 3;
        int n = 3;
        msa.merge(num1, m, num2, n);
    }
}