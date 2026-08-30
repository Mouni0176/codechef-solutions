import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n= scanner.nextInt();
		int [][] arr = new int[m][n];
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=scanner.nextInt();
		    }
		}
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
    
	}
}
