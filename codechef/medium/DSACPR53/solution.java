import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int [][] arr = new int [m][n];
		for(int i = 0;i<m ;i++){
		    st = new StringTokenizer(br.readLine());
		    for(int j=0;j<n;j++){
		        arr[i][j] = Integer.parseInt(st.nextToken());
		    }
		}
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        sb.append(arr[i][j]).append(" ");
		    }
		
		    sb.append('\n');
		}
		System.out.println(sb);
	}
}
