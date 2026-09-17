import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		
		char c = scanner.next().charAt(0);
		
		int value = scanner.nextInt();
		
		int found =-1;
		int count=0;
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)==c){
		       count++;
		       if(count ==value){
		        found =i;
		       }
		 
		    }
		}
		if(found ==-1){
		    System.out.println("-1");
		}
		else{
		    System.out.println(found);
		}

	}
}
