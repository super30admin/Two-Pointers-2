
// Time Complexity :O(n)- Iterating only once
// Space Complexity :O(1) - In-place 
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
// Declare count variable to maintain the count of elements in array
// Declare a variable j which maintains index of the elements to be replaced in the array

// Your code here along with comments explaining your approach

import java.util.*;
import java.io.*;

public class Problem1_RemoveDupFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int count=1;
        int j=0;
        //Iterate through entire array
        for(int i=1;i< nums.length; i++){
            if(nums[i-1] != nums[i]){
                j++;
                nums[j] = nums[i];
                //reset count when new value is detected
                count =1;
            }else{
                //if count exceeds 2 dont do anything keep moving to next value in array
                if(count<2){
                    j++;
                    nums[j]=nums[i];
                    count++;
                }
            }  
        }
        return j+1;  
    }
    
    public static void main(String[] args) {
    		int[] nums = {1,1,2,2,2,3};
    		int newLength= removeDuplicates(nums);
    		System.out.println("Final Array length: "+newLength );
    		System.out.print("[ ");;
    		for(int i=0; i<newLength ; i++) {
    			System.out.print(nums[i]+ " ");
    		}
    		System.out.print(" ]");
    }
}