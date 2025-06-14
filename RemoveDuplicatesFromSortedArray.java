class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 0;
        int count = 0;
        int k =2;

        while(fast < nums.length){
            if(fast > 0 && nums[fast] == nums[fast-1]){
                count++;
            }
            else{
                count =1;
            }

            if(count <= k){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}

/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */