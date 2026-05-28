import java.util.*;

class condition {
    public static void main(String args[]) {
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("You can vote");
        }else{
            System.out.println("you can't vote");
        }
    }
}