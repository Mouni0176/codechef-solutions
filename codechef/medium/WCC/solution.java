import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int test=scanner.nextInt();
	
		for(int i=0;i<test;i++){
		    int x = scanner.nextInt();
		   int c=0,n=0,d=0;
		   String st = scanner.next();
		    for(int j=0;j<st.length();j++){
		        
		       
		       
		            if(st.charAt(j)=='C'){
		                c++;
		                
		            }
		            else if(st.charAt(j)=='N'){
		                n++;
		            }
		            
		        }
		            if(c>n){
		                System.out.println(60*x);
		            }
		            else if(c==n){
		                System.out.println(55*x);
		            }
		            else{
		                System.out.println(40*x);
		            }
		            
		        
		    }
		}
		
		
		

	
}
