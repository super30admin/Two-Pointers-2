package s30.arrays.twoPoinnters2;


// Time Complexity: O(n) As we are iterating every element through the loop.
// Space Complexity: O(1);

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int slow = 1;
        int counter=1;

        for(int index=1; index < nums.length; index++){

            if(nums[index] == nums[index-1]) {
                if(counter < 2) nums[slow++] = nums[index];
                counter++;
            }
            else {
                nums[slow++] = nums[index];
                counter = 1;
            }
        }

        return slow;
    }
    public static void main(String[] args) {
        removeDuplicates(new int[]{1,1,1,2,2,3});
    }
}
