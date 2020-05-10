package functionalinterface.custom.datetimeprinter;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        final Printable printable = () -> System.out.println(LocalDateTime.now());
        printable.print();
    }
}
