
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Problem1 {
    //fast slow pointer: Sol1
    //Sol2 ; bucket sort... count the values and create an array


    public int removeDuplicates(int[] nums) {
        return fastSlowPtr(nums);
    }

    //TC: O(N)
    //SC :O(1)
    public int fastSlowPtr(int[] nums){
        int slow = 0;//points to number that has to be swapped
        int fast = 0; //for tracking change of the numbers
        int k = 2;
        int count =0;
        while(fast<nums.length){
            if(fast>0 && nums[fast] == nums[fast -1]){
                //this means that the element is same and not changed
                count++;

            }else{
                //number changed
                count =1;

            }
            if(count<=k){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        return slow;
    }


}
