package mathematics;

import java.util.Scanner;

public class DigitsInFactorial {
    public static int digitsInFactorial (int n) {
        double sumOfLog = 0;
        for(int i = 1; i <= n; i++) {
            sumOfLog += Math.log10(i);
        }
        return (int) Math.floor(sumOfLog) + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digitsInFactorial(n));
    }
}
