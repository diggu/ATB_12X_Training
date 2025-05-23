import java.util.Scanner;

public class Task_2_Max_from_3_Ternary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int x =sc.nextInt();
        int y =sc.nextInt();
        int z =sc.nextInt();
       int max = (x >= y) ? ((x >= z) ? x : z) : ((y >= z) ? y : z);
        System.out.println(max);
    }

}
