import java.util.*;

public class sumloop {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Value of n: ");
        int n = sc.nextInt();
        
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of first 'n' no. is : " + sum );
    }
}
