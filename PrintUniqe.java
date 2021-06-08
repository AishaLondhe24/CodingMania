package gfg.org;
import java.util.*;
import java.io.*;
public class PrintUniqe {
	
	                     static void UniqueWords(String str)
	                     {
	                    	   String []parts=str.split("\\W");
	                    	   
	                    	   int i,j,count;
	                    	   for(i=0;i<parts.length;i++)
	                    	   {
	                    		      count=0;
	                    		      for(j=i+1;j<parts.length;j++)
	                    		      {
	                    		    	    if(parts[i].equalsIgnoreCase(parts[j]))
	                    		    	    {
	                    		    	    	    count++;
	                    		    	    	    parts[j]="";
	                    		    	    }
	                    		      }
	                    		      if(count==0 && parts[i]!="")
	                    		      {
	                    		    	   System.out.println(parts[i]);
	                    		      }
	                    	   }
	                     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner sc=new Scanner(System.in);
             
             String str=sc.nextLine();
             UniqueWords(str);
	}

}
