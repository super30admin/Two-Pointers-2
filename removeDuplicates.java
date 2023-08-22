// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
import java.util.*;

public class removeDuplicates {

     public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int j=1;
        int count=1;
        int n=nums.length;
        
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }

            if(count<=2){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        removeDuplicates ts = new removeDuplicates();
        int[] m1= {1,1,1,2,2,3};
        int[] m2=  {0,0,1,1,1,1,2,3,3};
        System.out.println(ts.removeDuplicates(m1));// ans = 5
        System.out.println(ts.removeDuplicates(m2));// ans = 7
    }
}
