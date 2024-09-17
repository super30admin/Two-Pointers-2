//Time complexity : O(n)
//Space Complexity : O(1)
//Run successfully on leetcode
//No problem

//Here as we're allowing maximum of two same numbers, we need to have an extra boolean variable to see if the number is repeated or not
//By manipulating two pointers and the repeat boolean variable we'll be able to achieve the result


public class Two_Pointers_2_Problem_1_removeDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0 ) return 0;
        int slow = 0;
        int fast = 1;
        boolean flag = false;
        while(fast<nums.length)
        {
            if(flag == false && nums[slow] == nums[fast])
            {
                flag = true;
                slow++;
                nums[slow] = nums[fast];
                fast++;
            }
            else if(flag == true && nums[slow] == nums[fast])
            {
                while(fast<=nums.length - 1 && nums[slow]==nums[fast])
                {
                    fast++;
                }
            }
            else if(flag == true && nums[slow] != nums[fast])
            {
                flag = false;
                slow++;
                nums[slow] = nums[fast];
                fast++;
            }
            else if(flag == false && nums[slow] != nums[fast])
            {
                slow++;
                nums[slow] = nums[fast];
                fast++;
            }
        }
        return slow+1;
    }
}
