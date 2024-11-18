import java.util.Scanner;

public class practice5 {
    public static void main(String[]srg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A = ");
        int A = scanner.nextInt();

        System.out.print("Enter P = ");
        int P = scanner.nextInt();

        System.out.print("Enter n = ");
        int n = scanner.nextInt();

        int z = (int) Math.pow(A*(1+(P/100)),n);

        System.out.println(z);



    }
}
