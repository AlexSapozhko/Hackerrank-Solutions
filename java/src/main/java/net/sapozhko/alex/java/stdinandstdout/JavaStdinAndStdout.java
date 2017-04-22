package net.sapozhko.alex.java.stdinandstdout;

import java.util.Scanner;

/**
 * @author Alexander on 22.04.2017.
 */
public class JavaStdinAndStdout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
