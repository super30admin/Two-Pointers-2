
//Input: nums = [0,0,1,1,1,1,2,3,3]
//Output: 7, nums = [0,0,1,1,2,3,3,_,_]
//TC O(n)
//SC O(1)
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int num :nums) {
            if (i<2||num>nums[i-2]){
                nums[i++] = num;
            }
        }
        return i;
    }
}
