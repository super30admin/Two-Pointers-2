public class RemoveDuplicatesFromSortedArray2 {

    //two pointer solution
    //Time complexity: O(n) where n is the length of the array
    //Space complexity: O(1)
    public int removeDuplicates(int[] nums) {

        int slow = 0;
        int numLength = nums.length;
        if(numLength <= 2){
            return numLength;
        }
        int count = 0;

        for(int fast = 0; fast < numLength; fast++) {

            if((fast == 0) || nums[fast] == nums[fast - 1]) {
                count++;
            }
            else {
                count = 1;
            }

            if(count <= 2){
                nums[slow] = nums[fast];
                slow++;
            }
        }


        return slow;
    }
}
