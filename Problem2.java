/*
Merge a sorted array
approach: start filling elements from last of nums1
time: O(m+n)
space: O(1)
 */
public class Problem2 {

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1, index = nums1.length-1;

        while (p1>=0 && p2>=0) {
            if (nums1[p1]>nums2[p2]) {
                nums1[index--] = nums1[p1--];
            }
            else {
                nums1[index--] = nums2[p2--];
            }
        }

        while (p2>=0) {
            nums1[index--] = nums1[p2--];
        }

    }



    public static void main(String []args) {
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6},3);
    }
}
