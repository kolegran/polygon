package javalangsystem;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        printAllSystemProperties();
        System.out.println("\n{THE END}\n");
        printAllSystemEnvironmentVariables();

    }

    private static void printAllSystemProperties() {
        for (Map.Entry<Object, Object> entry : System.getProperties().entrySet()) {
            System.out.println(entry.getKey() + " {PROPSEP} " + entry.getValue());
        }
    }

    private static void printAllSystemEnvironmentVariables() {
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + " {ENVSEP} " + entry.getValue());
        }
    }
}
