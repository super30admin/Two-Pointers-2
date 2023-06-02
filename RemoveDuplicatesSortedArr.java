public class RemoveDuplicatesSortedArr {

    public int removeDuplicates(int[] nums){

        int n = nums.length;
        if(nums == null || n == 0) return 0;

        int slow = 1, count = 1, fast;

        for(fast = 1; fast < n; fast++){ //O(n)

            if(nums[fast] == nums[fast -1]){
                //measures number of occurrences of a number
                count++;
            }
            //if number changes, reset count to one
            else{
                count = 1;
            }
            //if count is within given range
            if(count <= 2){

                // keep fast element in slow's place and update slow
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
    /*
    Time Complexity = O(n)
    Space Complexity = O(1)
    */

    public static void main(String[] args){

        RemoveDuplicatesSortedArr object = new RemoveDuplicatesSortedArr();

        int[] arr = {1,1,1,1,1,2,2,2,2,3,4,4,4,5,5,6,6,6,15};

        int result = object.removeDuplicates(arr);

        System.out.println("Number of elements after removing duplicates " + result);
    }
}
