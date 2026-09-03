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
	    int n = Integer.parseInt(st.nextToken());
	    int [][] arr= new int[m][n];
	    for(int i =0;i<m;i++){
	        st = new StringTokenizer(br.readLine());
	        for(int j=0;j<n;j++){
	            arr[i][j]= Integer.parseInt(st.nextToken());
	        }
	    }
	    int start =0;
	    int maxi=0;
	    int count=0;
	    for(int i=0;i<m;i++){
	         count=0;
	        for(int j=0;j<n;j++){
	            if(arr[i][j]==1){
	                count++;
	                
	            }
	            if(maxi<count){
	                start=i;
	                maxi=count;
	            }
	        }
	    }
	    System.out.println(start+1);
	    

	}
}
