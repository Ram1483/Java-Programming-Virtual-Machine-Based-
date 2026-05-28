import java.util.Scanner;

public class condition2 {
    public static void main(String[] args) {
        System.out.println("Enter Any Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
