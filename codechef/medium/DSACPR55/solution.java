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
        int [][] arr = new int[m][n];
        for(int i = 0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            for(int j= 0 ;j<n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken()); 
            }
        }
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[j][i]+" ");
            }
        System.out.println();
            
        }
	}
}
