//Leetcode: 88 - https://leetcode.com/problems/merge-sorted-array/description/

//Time Complexity = O(n)
//Space Complexity = O(1) // No Auxiliary Space
// Does it run on LeetCode successfully? : Yes
// Any difficulties: Second while loop for P2. Made so many mistakes.

/*
Start with last index of both array
and one more index at the nums1's last index having 0s. This is the place where we keep putting elements by iterating from right to left.
At the end in second while loop, if we have elements left in nums2 (p1 is out of bound) then simply copy them over to nums1 to have final output.
*/

import java.util.Arrays;

public class MergeTwoSortedArrS {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1= m-1;
        int p2= n-1;
        int idx=m+n-1;

        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] >= nums2[p2]){
                nums1[idx] = nums1[p1];
                p1--;
            }else{
                nums1[idx] = nums2[p2];
                p2--;
            }
            idx--;
        }

        while(p2 >=0 ){
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }

        System.out.println(Arrays.toString(nums1));
          Arrays.stream(nums1).forEach(System.out::print); //Playing with Java8 Operations
    }

    public static void main(String[] args){
        MergeTwoSortedArrS obj = new MergeTwoSortedArrS();
        obj.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3 );
    }
}