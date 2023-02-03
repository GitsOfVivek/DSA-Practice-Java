package mathematics;

import java.util.Scanner;

public class AbsoluteValue {
    public static int absoluteValue(int n) {
        if(n < 0) {
            return -n;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(absoluteValue(n));
    }
}
