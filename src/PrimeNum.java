import java.util.Scanner;

public class PrimeNum {
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        for (int i=0;i<num;i++){
            if(num%2==0 || num%3==0){
                System.out.println(i);
            }
        }

    }
}
