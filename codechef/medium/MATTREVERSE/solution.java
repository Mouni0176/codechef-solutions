import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n  = Integer.parseInt(st.nextToken());
		int [][]arr = new int [m][n];
		for(int i =0;i<m;i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j=0;j<n;j++){
		        arr[i][j] = Integer.parseInt(st.nextToken());
		        
		    }
		}
		int [][] up = new int [m][n];
		int a=0;
		for(int i=m-1;i>=0;i--){
		    
		    for(int j=0;j<n;j++){
		        
		        up[a][j]= arr[i][j];
		        
		    }
		    a++;
		}
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(up[i][j]+" ");
		    }
		    System.out.println();
		}

	}
}
