

// Time Complexity: O((m + n) * log(m + n)) — inserting and polling from PriorityQueue
// Space Complexity: O(m + n) — for storing all elements in the PriorityQueue

import java.util.PriorityQueue;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int i = 0, j = 0, k = 0;
        while (i < m) {
            pq.add(nums1[i++]);
        }


        while (j < n) {
            pq.add(nums2[j++]);
        }


        while (k < m + n) {
            nums1[k++] = pq.poll();
        }
    }

    public static void main(String[] args) {
        MergeSortedArray sol = new MergeSortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        sol.merge(nums1, m, nums2, n);

        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
