import java.util.Scanner;

public class condition3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
         System.out.println("enter second number");
        int b = sc.nextInt();

        if(a == b){
            System.out.println("a and b are Equal");
        }else if(a>b){
            System.out.println("a is greater than b");
        }else if(a<b){
            System.out.println("a is smaller than b");
        }else{
            System.out.println("Enter valid no");
        }
      
    }
}

