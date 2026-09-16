import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int a=0;
            int b=0;
            if(s.charAt(0)=='A'){
                a++;
            }
            for(int i=0;i<n-1;i++){
            if((s.charAt(i)=='A')&&(s.charAt(i+1)=='A')){
                a++;
            }
            else if((s.charAt(i)=='B')&&(s.charAt(i+1)=='B')){
                b++;
            }
            }
            System.out.println(a+" "+b);
        }
    }
}
