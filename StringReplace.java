package gfg.org;
import java.util.*;
public class StringReplace {
	
	      
	           static void printreplace(String str1)
	           {
	        	      String  str2=str1.replaceAll("\\s", "");
	        	       System.out.println(str2);
	           }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		
	    printreplace(str1);

	}

}
