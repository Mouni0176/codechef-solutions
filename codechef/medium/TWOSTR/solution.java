import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            boolean found =true;
            boolean finall = true;
            String x = scanner.next();
            String y = scanner.next();
            for(int i =0;i<x.length();i++){
                if(x.charAt(i)!=y.charAt(i)){
                    found =false;
                }
                if((x.charAt(i)=='?')||(y.charAt(i)=='?')){
                    found =true;
                }
                if(found==false){
                    finall = false;
                }
            }
                if(finall ==true){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            
           
        }
    }
}
