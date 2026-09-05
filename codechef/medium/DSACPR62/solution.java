import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int lengthh= scanner.nextInt();
		int element = scanner.nextInt();
        int []arr = new int [lengthh];
        boolean found = false;
        for(int i=0;i<lengthh;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<lengthh;i++){
            if(arr[i]==element){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
	}
}
