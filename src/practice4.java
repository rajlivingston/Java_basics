import java.util.Scanner;

public class practice4 {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = scanner.nextInt();

        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }


    }
}
