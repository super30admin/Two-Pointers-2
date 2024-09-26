package Day14;
//TC: O(n) SC:O(1)

/*
Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.

It doesn't matter what you leave beyond the returned length.

 */

public class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {

        //Edge case
        if(nums == null || nums.length == 0){
            return 0;
        }


        int slow = 0;
        int fast = 1;

        //flag indicates repition
        boolean flag = false;


        while(fast < nums.length){
            //this indicates repition of the consecutive elements like 2,2
            if(nums[slow] == nums[fast]){
                //there could be two possible cases then
                //flag being false already which means this is the first repitition
                if(!flag){
                    flag = true;
                    slow++;
                    nums[slow] = nums[fast];
                    fast++;
                }
                //Already repeated 1 i.e., occuring twice
                //so just go further till you reach next new element
                else{
                    while(fast < nums.length && nums[fast] == nums[fast-1]){
                        fast++;
                    }
                }
            }
            //elements at slow and fast arent equal
            else{
                flag = false;
                slow++;
                nums[slow] = nums[fast];
                fast++;

            }
        }
        //slow gives the length of the new array part which contains unique elements with max 2 occurences
        //since indexing starts from 0, adding 1 while returning
        return slow+1;
    }

    public static void main(String args[]){
        RemoveDuplicates2 obj = new RemoveDuplicates2();
        int nums[] = new int[]{1,1,1,2,2,3};
        System.out.println("The length of new array: "+ obj.removeDuplicates(nums));

    }
}