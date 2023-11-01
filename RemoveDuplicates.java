// two pointers, one i of the for loop and one slow pointer
//we replace the slow pointer with i'th indexe's value when encountering more than one value

//time complexity: O(n)
//space complexity: O(1)
public class RemoveDuplicates {

    public static void main(String[] args)
    {
        int[] nums = {1,1,1,2,2,3};
        int result = removeDuplicate(nums);
        System.out.println(" Result is " + result);
    }

    public static int removeDuplicate(int[] nums) {

        if(nums == null || nums.length == 0) return 0;

        int n = nums.length;
        int slow = 0;
        int count = 0;
        int k = 2;

        for(int i = 0; i < n; i++) {

            if(i==0 || nums[i] != nums[i-1])
            {
                count = 1;
            }
            else
            {
                count++;
            }

            if(count <= k)
            {
                nums[slow] = nums[i];
                slow++;
            }

        }

        return slow;

    }

}