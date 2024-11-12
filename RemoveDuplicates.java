// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes


public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int slow =1;
        int fast =1;
        int count=1;
        int k=2;

        while(fast<n){
            if(nums[fast]==nums[fast-1]){
                count++;
            }else{
                count=1;
            }

            if(count<=k){
                nums[slow]= nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public static void main(String args[]) {
        RemoveDuplicates remove = new RemoveDuplicates();
        int[] nums={0,0,1,1,1,1,2,3,3};
        System.out.println("Output "+remove.removeDuplicates(nums));

    }

}
