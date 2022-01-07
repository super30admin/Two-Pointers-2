import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1;
        int k = nums1.length-1;

        while(i >=0 && j>=0){
            if(nums1[i] < nums2[j]){
                nums1[k] = nums2[j];
                j--;
                k--;
            }else{
                nums1[k] = nums1[i];
                i--;
                k--;
            }
        }

        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args){
        int[] arr1 = new int[]{1,2,3,0,0,0};
        int[] arr2 = new int[]{2,5,6};
        merge(arr1,3,arr2,3);
        System.out.println("Merged array : " + Arrays.toString(arr1));
    }
}
