import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		
		int [][]pairs = new int[test][2];
		for(int i=0;i<test;i++){
		    pairs[i][0] = scanner.nextInt();
		    pairs[i][1] = scanner.nextInt();
		}
		
		int left = scanner.nextInt();
		int right = scanner.nextInt();
		
    	for(int i=0;i<test;i++){
    	    int sum = pairs[i][0]+pairs[i][1];
    	    int mul = pairs[i][0]*pairs[i][1];
    	    if(((sum<=right)&&(sum>=left)) && ((mul<=right)&&(mul>=left))){
    	        System.out.println(pairs[i][0] +" "+ pairs[i][1]);
    	    }
    	}

	}
}
