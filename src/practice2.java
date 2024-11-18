import java.util.Scanner;

public class practice2 {
   public static void main(String[]arg){
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter your name : ");
       String name = scanner.nextLine();

       System.out.print("Enter your age");
       int age = scanner.nextInt();

       System.out.print("Enter your height");
       double height = scanner.nextDouble();

       System.out.println("Name = "+name);
       System.out.println("Age = "+age);
       System.out.println("Height = "+height);

       scanner.close();
   }
}
