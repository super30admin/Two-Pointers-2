
// Time Complexity :O((m+n) * (m+n)^2) here m is first array size and n is second array size;
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach: bruete force approach i have solved this by using nested for loop.so first i filled the first array gaps with second array.next i have used two for loops to put them in order.




class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       for(int i=0;i<n;i++){
        nums1[m+i]=nums2[i];
       }
       System.out.println("-"+nums1.length+""+ m+n);
       for(int i=0;i<m+n;i++){
        for(int j=i+1;j<m+n;j++){
        if(nums1[i]>nums1[j]){
            int temp=nums1[j];
            nums1[j]=nums1[i];
            nums1[i]=temp;

        }
       
        } 
       

    }
    }
}







// Time Complexity :O(m+n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english:I have done this problem by using two pointers which
//  are starting from last index of two arrays,
// by checking values of arrays at pointers,and filling first array from last index which is greater from two pointers and decrement that pointer .

// Your code here along with comments explaining your approach



class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int index = m+n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1] > nums2[p2]){
                nums1[index] = nums1[p1];
                p1--;
            }else {
                nums1[index] = nums2[p2];
                p2--;
            }
            index--;
        }
        while(p2>=0){
             nums1[index] = nums2[p2];
                p2--;
                index--;
        }

    }
}