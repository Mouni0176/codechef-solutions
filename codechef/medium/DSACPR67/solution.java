import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int k = scanner.nextInt();
		
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++){
		    arr[i] = scanner.nextInt();
		}
		
		int mini= Integer.MAX_VALUE;
		int mininum = Integer.MAX_VALUE;
	
		for(int i=0;i<n;i++){
    		int ad = Math.abs(k-arr[i]);
    		if(ad <mini){
    		    mini = ad;
    		    mininum = arr[i];
    		    
    		}
    		else if(ad == mini){
    		    if(mininum>arr[i]){
    		        mininum =arr[i]; 
    		    }
    		   
    		}
		}
	    System.out.println(mininum);
	
}
}
