import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            int count =0;
            int maxi =0;
          
            for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u')
            {
                count++;
                maxi=Math.max(count,maxi);
            }
            else{
                count=0;
        }
            }
        if(maxi >2){
            System.out.println("Happy");
        }
        else{
            System.out.println("Sad");
        }
            
    }
}
}
