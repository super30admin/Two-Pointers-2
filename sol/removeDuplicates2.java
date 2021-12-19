package sol;

public class removeDuplicates2 {
	public int removeDuplicates(int[] nums) {
        int counter=1;
        int i=1;
        int j=1;
        
        
        while(i<nums.length&&j<nums.length){
            
            if(nums[i-1]==nums[i]){
                
                counter++;
                
            }else{
                counter=1;
                
            }
            
            
            if(counter<=2){
                
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
    
    return j;
    }
}
