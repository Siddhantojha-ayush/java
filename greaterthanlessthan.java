import java.util.Scanner;

public class greaterthanlessthan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of 'a': ");
        int a = sc.nextInt();

        System.out.print("Enter value of 'b': ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            if (a < b) {
                System.out.println(b + " is greater than " + a);
            }
            else{
                System.out.println(a+ " and " +b+ " both are equal");
            }
        }

    }
}
