// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
 * We are using two pointers along with an index element where p1 will be at the last non-zero element of 
 * first array and p2 will be at the last element of second array. The index will be at the last element of
 * first array. Now we run a loop comparing elements at both pointers and if it is greater than the other
 * pointer, we assign it at the last index and decrement .
 */

// Your code here along with comments explaining your approach


public class Merge {

    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int m = 6;
        int nums2[] = {2,5,6};
        int n = 3;

        int result[] = merge(nums1, m, nums2, n);

        for(int i = 0; i<result.length;i++)
        {
            System.out.println(result[i]);
        }

    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n -1;
        int ind = m + n - 1;
        
        while(p1 >= 0 && p2 >= 0)
        {
            if(nums1[p1] > nums2[p2])
            {
                nums1[ind] = nums1[p1];
                p1--;
            }
            else
            {
                nums1[ind] = nums2[p2];
                p2--;
            }
            ind--;
        }
        
    /*This is to handle a single element array where nums1 will be [0] and nums2 will be [1]
     */        
        while(p2 >=0)
        {
            nums1[ind] = nums2[p2];
            p2--;
            ind--;
        }

        return nums1;
    }        
}
