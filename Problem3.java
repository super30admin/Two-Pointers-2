// Time Complexity :O(n*n) 
// Space Complexity :1
// Did this code successfully run on Leetcode : Yes

// Any problem you faced while coding this : Yes
// Confused how to calculate next index for negative elements.

// Your code here along with comments explaining your approach
public class circularArrayLoop {
    public static boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int temp = i;
            int start = i,count = 0;
            int nextpos ;
            while(true){
                //calculate the next position
                nextpos = (temp + nums[temp])%n;
                // if nextposition is negative then add n since its a circular array.
                if(nextpos<0) nextpos += n;
                //if nextposition is same as current position then its an invalid loop , so break.
                if(nextpos == temp) break;
                //check if loops continues in same direction , else break and check for next element
                if(nums[temp]*nums[nextpos] > 0){
                    temp = nextpos;
                    count++;
                }
                else
                    break;
                // checks for a valid loop
                if(temp == start && count>1)
                    return true;
                // checks if element loops to itself
                else if(temp == start && count == 1)
                    break;
                // if a loop occurs for other element than start then it will be in a continuous loop , so used this condition to break forever loop
                // e.g : [1,1,2]
                if(count>n)
                    break;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {-1,2};
        System.out.print(circularArrayLoop(nums));
    }
}
