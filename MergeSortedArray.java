
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// We start from the end of nums1 and nums2 to avoid overwriting existing elements in nums1.
// Compare the largest remaining elements from both arrays and place the bigger one at the correct position from the end.
// Fill in any remaining elements from nums2 if nums1 is exhausted first.



public class MergeSortedArray {
    public void solve(int[] nums1, int m, int[] nums2, int n){
        if(nums1==null || nums1.length==0){
            return;
        }

        int p1 = m-1;
        int p2 = n-1;
        int p3 = m+n-1;

        while(p1>=0 && p2>=0){
            nums1[p3] = Math.max(nums1[p1], nums2[p2]);
            p3--;

            if(nums1[p1] > nums2[p2]){
                p1--;
            }
            else{
                p2--;
            }


        }


        while(p2>=0){
            nums1[p3] = nums2[p2];
            p3--;
            p2--;
        }

    }
    public static void main(String[]args){
        MergeSortedArray ob = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        ob.solve(nums1, m, nums2, n);
        for(int num: nums1){
            System.out.println(num+ " ");
        }


    }
    
}
