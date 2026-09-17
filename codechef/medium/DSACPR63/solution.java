import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		
		char letter = scanner.next().charAt(0);
		
		boolean found =false;
		for(int i=0;i<word.length();i++){
		    if(word.charAt(i) == letter){
		        System.out.println(i);
		        found =true;
		    }
		   
		}
		if(found == false){
		    System.out.println("-1");
		}
	}
}
