public class removeDups {
    //TC On
    //SC O1

        public int removeDuplicates(int[] nums) {
            int n=nums.length;
            int slow=0;
            int count=1;
            for(int i=1;i<n;i++){
                if(nums[i]==nums[i-1]){
                    count++;
                }
                else{
                    count=1;
                }
                if(count<=2){
                    slow++;
                    nums[slow]=nums[i];
                }
            }
            return slow+1;
        }

}
