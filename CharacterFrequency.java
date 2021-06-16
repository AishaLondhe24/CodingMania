import java.util.*;
public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      char []arr= {'a','b','c','a','a','b','a'};
	      int count;
	      for(int i=0;i<arr.length;i++)
	      {
	    	    count=1;
	    	  for(int j=i+1;j<arr.length;j++)
	    	  {
	    		       if(arr[i]==arr[j])
	    		       {
	    		    	      count++;
	    		    	      arr[j]='$';
	    		       }
	    	  }
	    	  
	    	  if(arr[i]!='$' && count>0)
	    	  {
	    		  System.out.println(arr[i]+ " " +count);
	    	  }
	      }

	}

}