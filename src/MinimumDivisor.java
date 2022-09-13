import java.util.Scanner;

public class MinimumDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int a = 2;
        while (a <= x) {
            if (x == 2 || x == 4) {
                System.out.println(2);
                break;
            }a++;
            if (x % a == 0) {
                System.out.println(a);
                break;
            }
        }
    }
}