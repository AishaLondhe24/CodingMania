package gfg.org;
import java.util.*;
public class Anagram {
	
	       static void CheckAnagram(String str1,String str2)
	       {
	    	       int len1=str1.length();
	    	       int len2=str1.length();
	    	       
	    	       
	    	       String s1=str1.toLowerCase();
	    	       String s2=str2.toLowerCase();
	    	       
	    	       char []arr1=str1.toCharArray();
	    	       char []arr2=str2.toCharArray();
	    	       
	    	       if(len1!=len2)
	    	       {
	    	    	   System.out.println("Not anagram");
	    	    	   
	    	       }
	    	       else {
	    	    	     Arrays.sort(arr1);
	    	    	     Arrays.sort(arr2);
	    	    	     
	    	    	     if(Arrays.equals(arr1, arr2))
	    	    	     {
	    	    	    	     System.out.println("anagrams");
	    	    	     }
	    	    	     else {
	    	    	    	   System.out.println("not anagrams");
	    	    	     }
	    	    	     
	    	       }
	       }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		CheckAnagram(str1,str2);

	}

}
