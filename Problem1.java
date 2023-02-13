/*
Merge sorted arrays
approach: first start filling the nums1 from the end with largest elements from both arrays.
time: O(n+m)
space: O(1)
 */
public class Problem1 {



    static int removeDuplicates(int[] nums) {
        int last = 1, count=1, j=1;

        while(j<nums.length) {
            if(nums[j]==nums[j-1]) {
                count++;
            }
            else {
                count = 1;
            }
            if (count<=2) {
                nums[last++] = nums[j];
            }
            j++;
        }

        return last;
    }

    public static void main(String []args) {
        removeDuplicates(new int[]{1,1,1,2,2,3});
    }
}
