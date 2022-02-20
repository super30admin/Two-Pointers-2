//TC: O(n)
//SC: Its in place , no extra memory, O(1)
class RemoveDuplicatesinSortedArray2{

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;

        int j=0;
        for (int i =0 ; i <nums.length ; i++)
        {
            /*
             * If the current element is equal to the element at index i+2, then skip the
             * current element because it is repeated more than twice.
             */
            if (i < n-2 && nums[i] == nums[i+2])
            {
                continue;
            }
            nums[j]= nums[i];
            j++;
        }
        return j;
    }


    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 1, 3, 5, 5, 7 };
        int newLength = removeDuplicates(nums);

        System.out.println("Length of array after removing duplicates = " + newLength);

        System.out.print("Array = ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}