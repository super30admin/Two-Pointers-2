/**
 * Time Complexity : O(n) where n = size of nums
 * Space Complexity : O(1)
 */

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int j=1;
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) count++;
            else count = 1;
            if(count<=2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String args[]){
        RemoveDuplicatesFromSortedArrayII obj = new RemoveDuplicatesFromSortedArrayII();
        int[] myArr = new int[]{1,1,1,2,2,3};
        System.out.println(obj.removeDuplicates(myArr));
    }
}