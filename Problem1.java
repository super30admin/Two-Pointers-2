//space complexity :o(1)
//time complexity: o(n)
//Remove Duplicates from Sorted Array II
public class Problem1 {
    public int removeDuplicates(int[] nums) {
        int j=1,count=1;
        for(int i=1;i<nums.length;i++){
            //increment incase of duplicate
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                //reset
                count=1;
            }
            
            if(count<=2){
                //overwrite element at j if count<=2 && make j point to the next empty //location
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
