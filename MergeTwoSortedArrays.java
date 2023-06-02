import java.util.Arrays;
public class MergeTwoSortedArrays {

    public void mergeArrays(int[] nums1, int[] nums2, int m, int n){

        // two pointers from the last numbers
        int p1 = m-1, p2 = n-1, p;

        for(p = m+n-1; p >= 0; p--){ //O(m+n)

            if(p2 <0) break;

            //// push the element with larger pointer to the last (p) of nums1
            if(!(p1<0) && nums1[p1] > nums2[p2]){

                nums1[p] = nums1[p1];

                p1--;
            }
            else{
                nums1[p] = nums2[p2];

                p2--;
            }
        }
    }
    /*
    Time Complexity = O(m+n)
    Space Complexity = O(1)
    */

    public static void main(String[] args){

        MergeTwoSortedArrays object = new MergeTwoSortedArrays();

        int[] arr1 = {1, 3, 7, 0, 0, 0, 0};
        int[] arr2 = {2, 5, 8, 10};
        int m = 3, n = 4;

        object.mergeArrays(arr1, arr2, m, n);

        System.out.println("Merged array is " + Arrays.toString(arr1));

    }

}
