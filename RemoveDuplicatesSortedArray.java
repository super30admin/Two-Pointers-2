/*
 time complexity O(n) and space is constant.
* */
public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        int slow=1;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count<=2){
                nums[slow]=nums[i];
                slow++;
            }
        }
        return slow;
    }
}
