import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int [][]arr = new int [m][n];
        if((n*m)%2==0){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print("1"+" ");
                }
                System.out.println();
            }
            
            
        }
        else{
            System.out.println("-1");
        }
    }
}