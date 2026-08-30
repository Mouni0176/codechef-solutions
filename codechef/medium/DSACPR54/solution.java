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
        int [][] arr1 = new int[m][n];
        int [][] arr2 = new int [m][n];
        for(int i =0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<n;j++){
                arr1[i][j]= Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            for(int j= 0 ;j<n;j++){
                arr2[i][j] =Integer.parseInt(st.nextToken()); 
            }
        }
        
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j] +=arr2[i][j];
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                sb.append(arr1[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
	}
}
