// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

/* Using two pointers, slow and fast to keep count of 2 allowed duplicates and moving these pointers based on new duplicates.
 * reset count to 1 when unique element is encountered */

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        
        int n = nums.length;
        int p1=0;
        int count =1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count =1;
            }
            if(count<=2){
                p1++;
                nums[p1]=nums[i];
            }
        }
        return p1+1;
    }
}
