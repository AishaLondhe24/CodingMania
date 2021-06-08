package gfg.org;
import java.util.*;
public class StringAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String str1=sc.nextLine();
		
		//int len=str1.length();
	       char temp;	
		 char arr1[]=str1.toCharArray();
		for(int i=0;i<arr1.length;i++)
		{
			  for(int j=i+1;j<arr1.length;j++)
			  {
				   if(arr1[i]>arr1[j])
				   {
					  temp=arr1[i];
					  arr1[i]=arr1[j];
					  arr1[j]=temp;
				   }
			  }
		}
		//String str2=arr1.toString();
		
		String str2=Arrays.toString(arr1);
		System.out.println(str2);
      /* for(int i=0;i<arr1.length;i++)
       {
		System.out.println(arr1[i]);
       }
       */	
	}

}
