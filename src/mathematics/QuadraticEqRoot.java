package mathematics;
import java.util.Scanner;

// Given a quadratic equation in the form ax2 + bx + c. Find its roots.


public class QuadraticEqRoot {
    public static void findRoots(int a, int b, int c) {
        int d = (b * b) - (4 * a * c);
        int root1;
        int root2;
        if(d >= 0) {
            root1 = (int) (- (b) + Math.sqrt(d))/ (2 * a);
            root2 = (int) (- (b) - Math.sqrt(d))/ (2 * a);
            System.out.println(root1 + " " + root2);
        }else {
            System.out.println("Imaginary Roots");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        findRoots(a, b, c);
    }
}
