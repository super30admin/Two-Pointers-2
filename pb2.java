class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int r1 = m - 1; // Initialize r1 to the last valid element in arr1
        int r2 = n - 1; // Initialize r2 to the last element in arr2
        int w = m + n - 1; // Initialize w to the last position in arr1

        while (w >= 0) { // Correct condition
            if (r1 >= 0 && r2 >= 0) { // Both arrays have elements to compare
                arr1[w--] = arr1[r1] > arr2[r2] ? arr1[r1--] : arr2[r2--];
            } else if (r1 >= 0) { // Only arr1 has elements left
                arr1[w--] = arr1[r1--];
            } else { // Only arr2 has elements left
                arr1[w--] = arr2[r2--];
            }
        }
    }
}
