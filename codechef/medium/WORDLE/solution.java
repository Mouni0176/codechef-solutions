import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		scanner.nextLine();
		while(test-->0){
		    String m = scanner.nextLine();
		    String n = scanner.nextLine();
		    for(int i=0;i<m.length();i++){
		    if(m.charAt(i)==n.charAt(i)){
		        System.out.print("G");
		    }
		    else{
		        System.out.print("B");
		    }
		    }
		    System.out.println();
		}

	}
}
