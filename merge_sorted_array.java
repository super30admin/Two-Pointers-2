//Bruteforce solution

//Time Complexity: o(2n)


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        
        int newArr[] = new int[n + m];
        
        int i = 0;
        int j = 0;
        for(int c = 0; c< (m+n); c++){
            if(nums1[i] <=nums2[j] && i < m){
                newArr[c]=(nums1[i]);
                i++;
                    
            }else{
                newArr[c]=(nums2[j]);
                j++;
            }
        }
        for (int l = 0; l < newArr.length; l++){
            nums1[l] = newArr[l];
        }
            
            
        
    }
}


// optimal Solution
//Time Complexity: o(m+n)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m-1; //set pointer at last element
        int ptr2 = n-1;
        int i = m+n-1; //for main array(nums1)
        
        while(ptr1 >= 0 && ptr2 >= 0){ // when 1st element is 0
            if(nums1[ptr1] > nums2[ptr2]){
                nums1[i] = nums1[ptr1];
                ptr1--;
            }else{
                nums1[i] = nums2[ptr2];
                ptr2--;
            }
            i--;
        }
         
        while(ptr2 >= 0){ // if 0 in nums2
            nums1[i] = nums2[ptr2];
            ptr2--; i--;
        }
    }
}
