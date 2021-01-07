//time complexity-o(Max(m,n)
//space complexity -o(1)
public class MergeSorted {

	  public void merge(int[] nums1, int m, int[] nums2, int n) {
		
				        int i=m-1;
				int j=n-1;
				int k = m+n-1;
				while(i >=0 && j>=0)
				{
					if(nums1[i] > nums2[j])
						nums1[k--] = nums1[i--];
					else
						nums1[k--] = nums2[j--];
				
				}
				while(j>=0)
					 nums1[k--] = nums2[j--];
		    }
		
		
		    

public static void main(String args[])
{
	MergeSorted mg=new MergeSorted();
	int nums[]= {1,2,3,4,0,0,0};
	int nums1[]= {7,3,2};
	mg.merge(nums,4,nums1,3);
}
}