package gfg.org;
import java.util.*;
public class RemoveWords {
	
	   public static String RemoveWords(String str1,String str2)
	   {
		      if(str1.contains(str2))
		      {
		      String tempWord=str2+" ";
		      str1=str1.replaceAll(tempWord,"");
		      tempWord=" "+str2;
		      str1=str1.replaceAll(tempWord,"");
		      }
		      return str1;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		System.out.println(RemoveWords(str1,str2));

	}

}
