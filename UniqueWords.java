import java.util.*;
public class UniqueWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		
		/*String parts[]=str.split("\\W");
		
		for(int i=0;i<parts.length;i++)
	    System.out.println(parts[i]);
		
		System.out.println();
		HashSet<String> hs=new HashSet<String>(Arrays.asList(parts));
		
		
		System.out.println(hs);
		*/
		
		
		String parts[]=str.split("\\W");
		int count;
		for(int i=0;i<parts.length;i++)
		{
			   count=0;
			   for(int j=i+1;j<parts.length;j++)
			   {
				          if(parts[i].equalsIgnoreCase(parts[j]))
				          {
				        	count++;
				        	parts[j]="";
				        	         
				          }
			   }
			   
			   if(count==0&&parts[i]!="")
			   {
				      System.out.println(parts[i]);
			   }
		}
		
		
		

	}

}
