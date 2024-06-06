//time - O(n)
//space - O(1)
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0) return 0;

        int j=1;
        int count = 1;

        for(int i=1; i<nums.length; i++){
            if(nums[i-1] == nums[i]){
                count++;
            } else {
                count = 1;
            }
            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}