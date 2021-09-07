// Time Complexity :O(m+n)
// Space Complexity :O(m+n)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
public class merge1{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int sort[]=new int [m+n];
        int a=0;
        int b=0;
        int c=0;
        while(a<m && b<n){
            if(nums1[a]<=nums2[b])
            {
                sort[c]=nums1[a];
                a++;
                c++;
            }
            else
            {
                sort[c]=nums2[b];
                b++;
                c++;
            }
        }
        while(a==m && b<n)
        {
            sort[c]=nums2[b];
            b++;
            c++; 
        }
        while(a<m && b==n)
        {
            sort[c]=nums1[a];
            a++;
            c++;
        }
        for(int i=0;i<m+n;i++)
        {
            nums1[i]=sort[i];
        }
        
    }
}
