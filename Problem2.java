// Time Complexity : O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes

public class Problem2 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1= m-1;
        int p2 = n-1;
        int last = m+n-1;
        
        while(p1>=0 && p2>=0){
            if(nums1[p1] > nums2[p2]){
                nums1[last] = nums1[p1];
                last--;
                p1--;
            }else {
                nums1[last] = nums2[p2];
                last--;
                p2--;
            }
        }
        
        while(p2 >= 0){
            nums1[last] = nums2[p2];
            last--;
            p2--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        // Print the merged array
        System.out.println("Merged Array:");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
    
}
