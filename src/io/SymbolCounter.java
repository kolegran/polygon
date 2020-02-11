package io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SymbolCounter {
    private long amount;

    public void count(char searchedSymbol, String fileName) {
        long counter = 0;
        try (FileReader fileReader = new FileReader(fileName)) {
            final Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                counter += scanner.nextLine()
                        .chars()
                        .filter(symbol -> symbol == (int) searchedSymbol)
                        .count();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        this.amount = counter;
    }

    public long getAmount() {
        return amount;
    }
}
