import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();scanner.nextLine();
		while(t-->0){
		    String s= scanner.nextLine();
		    String []list = s.split(" "); 
		    for(String i :list){
		        if(!i.equals(i.toUpperCase())){
		            i=i.toUpperCase().charAt(0)+i.substring(1,i.length()).toLowerCase();
		            System.out.print(i+" ");
		        }
		        else{
		            System.out.print(i+" ");
		        }
		        
		    }
		    System.out.println();
		}

	}
}
