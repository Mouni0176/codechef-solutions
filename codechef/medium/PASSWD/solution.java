import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNextInt()){
		    int test = scanner.nextInt();
		    scanner.nextLine();
		
		for(int j=0;j<test;j++){
		    boolean a1=false;
		    boolean aa1 = false;
		    boolean num = false;
		    boolean chaar = false;
		    boolean lengthh = false;
		String input = scanner.nextLine();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>='a' && input.charAt(i)<='z'){
                a1 = true;
            }
            if((i>0)&& (i<input.length()-1)){
            if(input.charAt(i)>='A' && input.charAt(i)<='Z'){
                aa1 =true;
            }
           
            if(input.charAt(i)<='9' && input.charAt(i)>='0'){
                num=true;
            }
            if((input.charAt(i)=='@') ||(input.charAt(i)=='#')||(input.charAt(i)=='%')|| (input.charAt(i)=='&') || (input.charAt(i)=='?')){
                chaar = true;
            }
           
            }
        }
            if(input.length()>=10){
                lengthh = true;
            }
            if((a1 == true)&& (aa1 == true)&& (num ==true)&& (chaar== true)&&(lengthh==true)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
		}
	}
}
