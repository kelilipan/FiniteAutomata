/*
 * Copyright 2018 Anvaqta Tangguh
 * https://anvaqta.id/
 */
package Driver;

import Controller.SentenceController;

/**
 *
 * @author Anvaqta Tangguh Wisesa <me@anvaqta.id>
 */
public class FiniteAutomata {

    /**
     * SAYA GABUT ..JADI SAYA BIKIN MVC 
     */
    public static void main(String[] args) {
        String Sentence = null;
        // SUBJECT    : salsa, saya, dia, aku, kamu
        // PREDIKAT   : baca, beli, makan, minum, nulis
        // OBJECT     : buku, tahu, susu, busa, tisu
        // KETERANGAN : di kos , di kamar , di kota , di kantin , di kafe
        new SentenceController(Sentence);
    }
    
}
