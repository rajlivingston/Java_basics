import java.util.Scanner;

public class palidrome {
        public static void main(String[] args) {
            Scanner value=new Scanner(System.in);
            System.out.println("Enter the num");
            int num =value.nextInt();

            int temp = num;
            int sum =0;
            
            {
                int d = temp%10;
                sum=sum*10+d;
                temp=temp/10;
                System.out.println(sum);
            }

            if(temp==sum)  {
                System.out.println("palindrome");
            }
            else{
                System.out.println("Not a palindrome");
            }


        }
}
