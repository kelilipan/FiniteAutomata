/*
 * Copyright 2018 Anvaqta Tangguh
 * https://anvaqta.id/
 */
package View;

import java.util.Scanner;

/**
 *
 * @author Anvaqta Tangguh Wisesa <me@anvaqta.id>
 */
public class InputView {

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public String readString() {
        System.out.println("Type " + ANSI_BLUE + "'help'" + ANSI_RESET + " to get more information");
        System.out.print("Insert your sentence : ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        if (sentence.equals("help")) {
            showHelp();
            System.out.print("Insert your sentence : ");
            sentence = scanner.nextLine();
        }
        return sentence;
    }

    public void showHelp() {
        System.out.println("This program only read this combination");
        System.out.println("        // SUBJECT    : salsa, saya, dia, aku, kamu\n"
                + "        // PREDIKAT   : baca, beli, makan, minum, nulis\n"
                + "        // OBJECT     : buku, tahu, susu, busa, tisu\n"
                + "        // KETERANGAN : di kos , di kamar , di kota , di kantin , di kafe");
        System.out.println("USAGE : [SUBJECT][PREDIKAT][OBJECT][KETERANGAN] \n");

    }
}
