// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

public class RemoveDuplicates {

    public void dupicates(int [] nums){

        int n = nums.length - 1;
        int count = 0 ;
        int i = 0;
        int swapIndex = 0;

        while (i <= n){
            int prevIndex = i - 1;

            if (prevIndex < 0){
                prevIndex = 0;
            }
            if (nums[i] == nums[prevIndex]){
                if(count < 2){
                    nums[swapIndex] = nums[i];
                    swapIndex++;
                }
                count++;
            }
            else{
                count = 1;
                nums[swapIndex] = nums[i];
                swapIndex++;

            }
            i++;
        }
        System.out.println(nums);
    }
    public static void main(String[] args){
        int[] num1 = {1,1,1,2,2,3};

        RemoveDuplicates obj = new RemoveDuplicates();
        obj.dupicates(num1);
    }
}
