//Remove duplicates from sorted array - 2
// Time Complexity : O(n)
// Space Complexity : O(1)Constant
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
we take two pointers, slow and fast. Also we take a count variavle to count the number of occurances.
when we get count <=2, we put fast pointer number to slow pointer index.
then we traverse ahead with fast pointer, and check if out element is same as prev elment and increase the count
We have to skip the numbers which are more than 2
if nums[fast] == nums[fast-1] , then we increase fast and also count , when we reach count >=2 we exchange the 
elements with slow and fast index. 
*/
class Problem1{
    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,3};
        int len = removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.print(" " +nums[i]);
        }

    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int slow = 1, fast = 1, count = 1;
        while(fast <n){
            if(nums[fast] == nums[fast-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count <=2){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;

        
    } 
}