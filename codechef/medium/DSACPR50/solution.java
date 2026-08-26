import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		
		for(int i = 0;i<test;i++){
		    int sum = 0;
		    int n = scanner.nextInt();
		    int maxi = Integer.MIN_VALUE;
		    for(int j= 0 ;j<n;j++){
		        int m = scanner.nextInt();
		        
		        sum += m;
		        if(sum < 0){
		            sum = 0;
		            
		        }
		        maxi = Math.max(sum,maxi);
		    }
		    System.out.println(maxi);
		   
		}

	}
}
