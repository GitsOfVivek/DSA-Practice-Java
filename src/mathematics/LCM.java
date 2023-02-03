package mathematics;

import java.util.Scanner;

public class LCM {
    public static int findLCM(int a, int b) {
        if(a == 0) {
            return b;
        }
        return findLCM(b % a, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findLCM(a, b));
    }
}
