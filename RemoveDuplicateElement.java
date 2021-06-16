import java.util.*;
public class RemoveDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3,4,6,3,8,4,3};
		
		int n=arr.length;
		int i,j,k;
		int size=arr.length;
		
		for(i=0;i<n;i++)
		{
			  for(j=i+1;j<n;j++) {
				    if(arr[i]==arr[j])
				    {
				    	   for(k=j;k<n-1;k++)
				    	   {
				    		       arr[k]=arr[k+1];
				    		     
				    		
				    	   }
				    	   
				    	n--;
				    	j--;
				    	  
				    }
				   
				    
			  }
		}
		
		
		for(i=0;i<n;i++)
		{
			   System.out.println(arr[i]);
		}
		
	
		

	}

}
