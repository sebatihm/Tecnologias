package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleReader implements InputReader{
    private final Scanner SCANNER = new Scanner(System.in);

    @Override
    public String readInput(String message) {
        System.out.println(message);
        return SCANNER.nextLine();
    }
}
