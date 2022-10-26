package s30.arrays.twoPoinnters2;

// Time Complexity: O(m+n) , m being the size of first array and n for second array.
// Space Complexity: O(1)

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        n = n-1;
        m = m-1;
        int index = nums1.length-1;
        while(n >=0 && m >=0){

            if(nums1[m] > nums2[n]) nums1[index] = nums1[m--];

            else nums1[index] = nums2[n--];

            index--;
        }

        while(n>=0){
            nums1[index--] = nums2[n--];
        }

    }
    public static void main(String[] args) {

    }
}
