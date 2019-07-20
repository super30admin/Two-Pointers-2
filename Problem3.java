// Time Complexity :O(n*n) --> beacuse of for loop
// Space Complexity :1
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Confused how to calculate next index for negative elemnts.
// Your code here along with comments explaining your approach
public class circularArrayLoop {
    public static boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int temp = i;
            int start = i,count = 0;
            int nextpos ;
            while(true){
                if(nums[temp]>0)
                    nextpos = (temp+nums[temp])%n;
                else
                    nextpos = (temp+nums[temp]+n)%n;
                if(nums[temp]*nums[nextpos] > 0){
                    temp = nextpos;
                    count++;
                }
                else
                    break;
                if(temp == start && count>1)
                    return true;
                else if(temp == start && count == 1)
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
