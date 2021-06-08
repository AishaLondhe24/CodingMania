package gfg.org;
import java.util.*;
public class StringSplitMethod {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        String str="Aishwaryawww-aishwarya-hello-aishwarya-is-good girl";
        
        String parts[]=str.split("-");
        
        for(int i=0;i<parts.length;i++)
        {
        	    System.out.println("---->"+parts[i]);
        }
        		}

}
