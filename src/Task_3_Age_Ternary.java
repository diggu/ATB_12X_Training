import java.util.Scanner;

public class Task_3_Age_Ternary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        String res = (age<18) ? "minor" : ((age<=65) ? "Adult" : "Aged");
        System.out.println(res);

    }

}
