package net.sapozhko.alex.java.javaifelse;

import java.util.Scanner;

/**
 * @author Alexander on 22.04.2017.
 */
public class JavaIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else {
            if (n >= 2 && n <= 5 || n > 20) {
                ans = "Not Weird";
            }

            if (n >= 6 && n <= 20) {
                ans = "Weird";
            }
        }

        System.out.println(ans);
    }
}
