import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
	
		while(test-->0){
		    
		   
		        int n = scanner.nextInt();
		      
		        String bin = scanner.next();
		        int count =0;
		        for(int j=0;j<n-1;j++){
		            if(bin.charAt(j) == bin.charAt(j+1)){
		                count++;
		            }
		        }
		        System.out.println(count);
		        
		    
		}

	}
}
