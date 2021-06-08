package gfg.org;

import java.util.*;
public class Characterfreq {

	
	    static void findDupli(String str)
	    {
	    	
	    	  Map<Character,Integer> hm=new HashMap<Character,Integer>();
	    	  
	    	String parts[]=str.split(" ");
	    	
	    	for(int i=0;i<str.length();i++)
	    	{
	    		  char ch=str.charAt(i);
	    		  if(hm.get(ch)!=null)
	    		  {
	    			       hm.put(ch, hm.get(ch)+1);
	    		  }
	    		  else {
	    			  hm.put(ch, 1);
	    			  
	    		  }
	    	}
	    	System.out.println(hm);
	    	
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		findDupli(str);

	}

}
