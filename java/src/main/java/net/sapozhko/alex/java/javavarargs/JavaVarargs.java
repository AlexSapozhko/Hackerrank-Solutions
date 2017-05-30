package net.sapozhko.alex.java.javavarargs;

/**
 * @author Alexander on 30.05.2017.
 */
public class JavaVarargs {
    int sum;

    void add(int... v) {
        for (int x : v) {
            System.out.print(x);
            sum += x;
            if (x != v[v.length - 1])
                System.out.print("+");
        }
        System.out.println("=" + sum);
        sum = 0;
    }
}