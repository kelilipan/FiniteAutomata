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
    public String readString(){
        System.out.print("Insert your sentence : ");
        Scanner scanner = new Scanner( System.in );
        return  scanner.nextLine();
    }
}
