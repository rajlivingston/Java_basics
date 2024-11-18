import java.util.Scanner;

public class checkPrime {
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();

        if(num%2==0 || num%3==0){
            System.out.println("It is not a prime");
        }
        else{
            System.out.println("It is a prime");
        }
    }
}
