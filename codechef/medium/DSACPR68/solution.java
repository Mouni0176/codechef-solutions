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
		
		int [][] pairs = new int[n][2];
		for(int i=0;i<n;i++){
		    pairs[i][0]= scanner.nextInt();
		    pairs[i][1] = scanner.nextInt();
		    
		}
		
		for(int i=0;i<n;i++){
		   int sum = pairs[i][0]+pairs[i][1];
		    if(sum%k==0){
		        System.out.println("("+pairs[i][0]+", "+pairs[i][1]+")");
		    }
		}

	}
}
