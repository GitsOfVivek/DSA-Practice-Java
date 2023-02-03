package mathematics;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static double celsiusToFahrenheit(int n) {
        double res = (double) (n * 9 / 5) + 32;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(celsiusToFahrenheit(n));
    }
}
