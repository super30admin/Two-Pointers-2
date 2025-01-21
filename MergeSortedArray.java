import java.util.Arrays;

// Time Complexity: O(n) as 2 pointers are used to traverse.
// Space Complexity: O(1) as the merging is done in-place

// I have used only 2 pointers here as compared to the 3 pointers approach by Raj sir.
public class MergeSortedArray {

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 0, 0, 0 };
        merge(array, 3, new int[] { 2, 5, 6 }, 3);
        System.out.println(Arrays.toString(array));

        int array1[] = { 1 };
        merge(array1, 1, new int[] {}, 0);
        System.out.println(Arrays.toString(array1));

        int array2[] = { 0 };
        merge(array2, 0, new int[] { 1 }, 1);
        System.out.println(Arrays.toString(array2));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m - 1;
        int second = n - 1;
        while (first > -1 && second > -1) {
            if (nums1[first] >= nums2[second]) {
                nums1[first + second + 1] = nums1[first];
                first--;
            } else {
                nums1[first + second + 1] = nums2[second];
                second--;
            }
        }
        while (first > -1) {
            nums1[first] = nums1[first];
            first--;
        }
        while (second > -1) {
            nums1[second] = nums2[second];
            second--;
        }
        return;
    }

}
