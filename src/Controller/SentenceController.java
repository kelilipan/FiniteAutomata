/*
 * Copyright 2018 Anvaqta Tangguh
 * https://anvaqta.id/
 */
package Controller;

import Model.StateFA;
import Model.StatePDA;
import View.InputView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anvaqta Tangguh Wisesa <me@anvaqta.id>
 */
//THX TO @firdiar btw
public class SentenceController {
    
    public SentenceController(String Sentence){
        Sentence = new InputView().readString();
        List<String> token = tokenize(Sentence);
        System.out.print("your sentence is : "+new PDAController(token).isAccepted()+"\n");
    }

    public List<String> tokenize(String sentence) {
        sentence = sentence.toLowerCase();
        int i = 0;
        String temp = "";
        List<String> token = new ArrayList<>();
        while (i < sentence.length()) {
            if (sentence.charAt(i) != ' ') {
                temp += sentence.charAt(i);
            } else if (sentence.charAt(i) == ' ' && !temp.equals("di")) {
                token.add(temp);
                temp = "";
            } else if (temp.equals("di")) {
                temp += " ";
            }
            i++;
        }
        token.add(temp);
        return token;
    }
}
