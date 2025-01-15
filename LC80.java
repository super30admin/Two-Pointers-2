// TC: O(n)
// SC: O(1)

public class LC80 {
    public int removeDuplicates(int[] nums) {
        int e = 10001;
        int f = 0;
        int ptr = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=e){
                nums[ptr]=nums[i];
                e = nums[i];
                f=1;
                ptr++;
            } else {
                if(f>=2) continue;
                nums[ptr]=nums[i];
                f++;
                ptr++;
            }
        }
        return ptr; 
    }
}