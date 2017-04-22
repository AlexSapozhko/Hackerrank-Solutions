package net.sapozhko.alex.java.stdinandstdout;

import java.util.Scanner;

/**
 * @author Alexander on 22.04.2017.
 */
public class JavaStdinAndStdout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
