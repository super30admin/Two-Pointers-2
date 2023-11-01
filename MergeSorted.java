//we have two pointers on end of both the arrays num1 and nums2 and idx at end of nums1
//when moving from left to right, which is the greatest gets placed at idx and decrement the pointer and idx
//handled the edge cases with t1 and t2
//thus, Time Complexity : O(n)
// Space Complexity : O(1) no additonal auxillary space needed

public class MergeSorted {

    public static void main(String[] args)
    {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = nums2.length - 1;
        int idx = nums1.length - 1;
        while(p1 >= 0 && p2 >= 0 )
        {
            if(nums2[p2] > nums1[p1])
            {
                nums1[idx] = nums2[p2];
                idx--;
                p2--;
            }
            else
            {
                nums1[idx] = nums1[p1];
                idx--;
                p1--;
            }
        }
        //either p2 goes out of bounds or p1 == -1
        while(p2>= 0)
        {
            nums1[idx] = nums2[p2];
            idx--;
            p2--;
        }

        System.out.println("Sorted Nums is");
        for(int i=0; i<nums1.length; i++)
        {
            System.out.print(" " + nums1[i]);
        }
    }

}