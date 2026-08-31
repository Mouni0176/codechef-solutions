import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int  n = Integer.parseInt(st.nextToken());
        int arr1[][] = new int [m][n];
       
        for(int i =  0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int [] [] arr2 = new int [a][b]; 
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<b;j++){
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int arr3[][] = new int [m][b];
        if(n==a){
            for(int i=0;i<m;i++){
                for(int j=0;j<b;j++){
                    for(int k=0;k<n;k++){
                        
                    
                    arr3[i][j] += arr1[i][k]*arr2[k][j];
                }
                }
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
	}
}
