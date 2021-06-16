import java.util.*;
public class PrintDruplicate {
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		   int arr[]= {3,4,3,5,3,4,9,3,9,10,34};
		   int i,j,count;
		   for(i=0;i<arr.length;i++)
		   {  
			   count=0;
			     for(j=i+1;j<arr.length;j++)
			     {
			    	    if(arr[i]==arr[j])
			    	    {
			    	    	//System.out.println(arr[i]);
			    	    	count++;
			    	    	arr[j]=0000000;
			    	    
			    	    	   
			    	    }
			     }
			     
			     
			     if(count>0&&arr[i]!=0000000)
			     {
			    	 System.out.println(arr[i]);
			     }
			    
		   }
		   
		   
		   
		 
	

	}

}
