package net.sapozhko.alex.java.javastdinstdout;

import java.util.Scanner;

/**
 * @author sergii.sapozhko on 2017-04-22.
 */
public class JavaStdinStdout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double y = sc.nextDouble();

        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()) {
            sb.append(sc.nextLine());
        }
        String s = sb.toString();

        System.out.println("String: " + s);
        System.out.println("Double: " + y);
        System.out.println("Int: " + x);
    }
}
