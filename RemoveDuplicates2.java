// Question - Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each
// unique element appears at most twice. The relative order of the elements should be kept the same.
//Since it is impossible to change the length of the array in some languages, you must instead have the result be placed
// in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first
// k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
//Return k after placing the final result in the first k slots of nums

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
//Approach - my approach is to take k as variable to work for any integer and track the count of each occurring element
//in the array with help of count and if count exits k times it has a variable i which takes place of the moving j element.
public class RemoveDuplicates2 {
    static int removeDuplicates(int[] nums, int k) {
        int n = nums.length;
        int i = 1;
        int j = 1;
        int count = 1;
        while(j < n) {
            if(nums[j-1] == nums[j]) {
                count++;
            } else {
                count = 1;
            }
            if(count <= k) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }

        return i;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println("Length of new sorted arrays: "+ removeDuplicates(nums, 7));
    }
}
