import java.util.Scanner;

public class Task_1_Odd_Even_Ternary
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any integer number to check whether it is odd or even");
        int var = sc.nextInt();
        String res = (var % 2 == 0) ?"Even" : "Odd";
        System.out.println(res);
    }
}
