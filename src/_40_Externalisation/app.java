package _40_Externalisation;

import java.io.IOException;
import java.util.*;

public class app {
    public static void main(String[] args) {
        System.out.println(Settings.get().getProperty("url"));
    }
}
