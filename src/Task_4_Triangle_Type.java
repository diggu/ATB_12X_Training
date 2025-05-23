import java.util.Scanner;

public class Task_4_Triangle_Type {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all the angles of the triangle");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        String res = (a1+a2+a3 != 180) ? "invalid input" : (a1 == a2 ) && (a2==a3) ? "Equilateral" : ((a1==a2) || (a2 == a3) || (a1 == a3) ? "Isocales" : "Scalene");
        System.out.println(res);

    }
}
