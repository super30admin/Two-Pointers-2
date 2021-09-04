public class RemoveDuplicates {

    //Two Pointer Approach:
    //Traverse the entire array and increase the count if the current element is equal to previous element.
    //If the count is lesser than 2, then replace the element from the second pointer to first pointer and move the first pointer.
    //TC: O(N) where N is lenght of the given array
    //SC: O(1) Not using any extra space.
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int count = 1;
        int i = 1;
        
        for(int j=1;j<nums.length;j++) {
            if(nums[j] == nums[j-1]) {
                count++;
            } else {
                count = 1;
            }

            if(count <= 2) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int result = removeDuplicates.removeDuplicates(new int[]{1,1,2,2,2,3});
        System.out.println("The result: "+result);
    }
}