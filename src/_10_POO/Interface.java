package _10_POO;

import java.io.IOException;
import java.io.PrintWriter;

public interface Interface {
    int i = 3;
    void jeDoisEtreImplementee();
    default void print(String text) {
        System.out.println(text);
    }
    static void print(String text, PrintWriter writer) throws IOException {
        writer.write(text);
    }
}
