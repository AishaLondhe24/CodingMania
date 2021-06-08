package gfg.org;
import java.util.*;
public class just {
	
	      static void printAll(String str1,String str2)
	      {
	    	    String str3=str1.replaceAll("\\s", "-");
	    	    System.out.println(str3);
	    	  
	      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        
        printAll(str1,str2);
	}

}
