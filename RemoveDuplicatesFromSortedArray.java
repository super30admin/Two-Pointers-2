public class RemoveDuplicatesFromSortedArray {
        public int removeDuplicates(int[] nums) {
            if(nums == null || nums.length ==0){
                return 0;
            }
            int n = nums.length;
            int i=1, count=1, j=1;

            while(i<n){
                if(nums[i-1] == nums[i]){
                    count++;
                }else{
                    count=1;
                }
                if(count <=2){
                    nums[j] = nums[i];
                    i++;
                    j++;
                }else if(count >2){
                    i++;
                }
            }

            return j;
        }
}
