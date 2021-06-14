// Time Complexity:  O(n)
// Space Complexity: O(1)

package leetcode;

public class Fanng39 {

    public int removeDuplicates(int[] nums) {
        if(nums.length==0||nums==null)return 0;
        int insertptr=1;
        int count=1;
        int k=2;
        for(int i =1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count<=k){
                nums[insertptr]=nums[i];
                insertptr++;
            }
        }
        return insertptr;
    }
}
