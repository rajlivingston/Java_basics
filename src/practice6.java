import java.util.Scanner;

public class practice6 {
    public static void main(String[]args){
        String Indian,NRI;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your nationality");
        String nationality =scanner.nextLine();

        System.out.println("Enter your age");
         int age = scanner.nextInt();



         if(age>=18){
             if (age>21){
                 if (nationality.equals("Indian")){
                     System.out.println("Eligible to vote and nominate");
                 }
                 else {
                     System.out.println("Eligible to voting only");
                 }
             }
             else {
                 System.out.println("Eligible for voting");
             }

         }
         else {
             System.out.println("Not eligible to vote");

         }
    }
}
