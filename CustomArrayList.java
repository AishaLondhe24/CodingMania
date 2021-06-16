import java.util.ArrayList;

public class CustomArrayList {
	  private static final int ArrayList = 0;
	int n=4;
	  
	  class Data{
		  
		      int roll;
		      String name;
		      int marks;
		      long phone;
		      
		      Data(int roll,String name,int marks,long phone)
		      {
		    	    this.roll=roll;
		    	    this.name=name;
		    	    this.marks=marks;
		    	    this.phone=phone;
		      }
		  
		  
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       int roll[]= {1,2,3,4};
	       String name[]= {"shubh","Amit","shubhankar"};
	       int marks[]= {99,89,100,88};
	       long phone[]= {9474984848L,4986482948L,4794683894L};
	       
	       
	       CustomArrayList custom=new CustomArrayList();

	}
	
	      public void addValues(int roll[],String name[],int marks[],long phone[])
	      {
	    	          
	    	      ArrayList<Data> list=new ArrayList<Data>();
	    	      
	    	      for(int i=0;i<n;i++)
	    	      {
	    	    	     list.add(new Data(roll[i],name[i],marks[i],phone[i]));
	    	      }
	    	      printValues(list);
	    	        
	    	        
	      }
	      
	      
	      public void printValues(ArrayList<Data>list)
	      {
	    	      for(int i=0;i<n;i++)
	    	      {
	    	    	      Data data=list.get(i);
	    	    	      System.out.println(data.roll+ "" +data.name+""+data.marks+""+data.phone);
	    	      }
	      }

}
