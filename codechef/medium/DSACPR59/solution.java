import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int [][] arr = new int[n][n];
		for(int i=0;i<arr.length;i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j=0;j<arr.length;j++){
		        arr[i][j] = Integer.parseInt(st.nextToken());
		    }
		}
		
		int count=0;
		int same=0;
		for(int i=0;i<arr.length;i++){
		    count+=arr[i][arr.length-i-1];
		    same+=arr[i][i];
		}
		count+=same;
		
		if(n%2!=0){
		    count-=(arr[n/2][n/2]);
		}
		
		System.out.println(count);

	}
}
