package gfg.org;
import java.util.*;
public class SubString {
	   
	    static void printSubString(String str)
	    {
	    	    int len = str.length();
	    	    String array[]=new String[len*(len+1)/2];
	    	    
	    	    int i,j,temp=0;
	    	    for(i=0;i<len;i++)
	    	    {
	    	    	   for(j=i;j<len;j++)
	    	    	   {
	    	    		       array[temp]=str.substring(i,j+1);
	    	    		       temp++;
	    	    	   }
	    	    }
	    	    
	    	    for(i=0;i<array.length;i++)
	    	    {
	    	    	  System.out.println(array[i]);
	    	    }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		printSubString(str);

	}

}
