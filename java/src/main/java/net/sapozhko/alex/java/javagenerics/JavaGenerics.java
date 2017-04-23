package net.sapozhko.alex.java.javagenerics;

/**
 * @author Alexander on 23.04.2017.
 */
public class JavaGenerics<V> {

    void printArray(V[] i) {
        for (V x : i) System.out.println(x);
    }
}