/*
 * Copyright 2018 Anvaqta Tangguh
 * https://anvaqta.id/
 */
package Controller;

import Model.StateFA;

/**
 *
 * @author Anvaqta Tangguh Wisesa <me@anvaqta.id>
 */
//THX TO @firdiar btw
public class FAController {

    StateFA S;
    StateFA P;
    StateFA O;
    StateFA K;

    public FAController() {
        CreateSubjek();
        CreatePredikat();
        CreateObjek();
        CreateKeterangan();
    }

    public void CreateSubjek() {
       //salsa, saya, dia, aku, kamu
        
        StateFA q0 = new StateFA("I.S");
        StateFA q1 = new StateFA("S");
        StateFA q2 = new StateFA("A");
        StateFA q3 = new StateFA("L");
        StateFA q4 = new StateFA("K");
        StateFA q5 = new StateFA("I");
        StateFA q6 = new StateFA("SITY");
        StateFA q7 = new StateFA("AU",true);
        StateFA q8 = new StateFA("D");
        StateFA q9 = new StateFA("A");
        StateFA q10 = new StateFA("K");

        q0.addTransition('s', q1);
        q0.addTransition('k', q4);
        q0.addTransition('d', q8);
        q0.addTransition('a', q9);
        
        q1.addTransition('a', q2);
        
        q2.addTransition('l', q3);
        q2.addTransition('y', q6);
        
        q3.addTransition('s', q6);
        
        q4.addTransition('i', q5);
        
        q5.addTransition('t', q6);
        
        q6.addTransition('a', q7);
        
        q8.addTransition('i', q6);
        
        q9.addTransition('k', q10);
        
        q10.addTransition('u', q7);
        S = q0;
    }

    public void CreatePredikat() {
        //baca, beli, makan, minum, nulis
        
        StateFA q0 = new StateFA("I.S");
        StateFA q1 = new StateFA("M");
        StateFA q2 = new StateFA("A");
        StateFA q3 = new StateFA("K");
        StateFA q4 = new StateFA("A");
        StateFA q5 = new StateFA("I");
        StateFA q6 = new StateFA("N");
        StateFA q7 = new StateFA("SAMIN",true);
        StateFA q8 = new StateFA("U");
        StateFA q9 = new StateFA("N");
        StateFA q10 = new StateFA("U");
        StateFA q11 = new StateFA("L");
        StateFA q12 = new StateFA("I");
        StateFA q13 = new StateFA("B");
        StateFA q14 = new StateFA("A");
        StateFA q15 = new StateFA("C");
        StateFA q16 = new StateFA("E");
        StateFA q17 = new StateFA("L");
       
        q0.addTransition('m', q1);
        q0.addTransition('n', q9);
        q0.addTransition('b', q13);
        
        q1.addTransition('a', q2);
        q1.addTransition('i', q5);
        
        q2.addTransition('k', q3);
        
        q3.addTransition('a', q4);
        
        q4.addTransition('n', q7);
        
        q5.addTransition('n', q6);//
        
        q6.addTransition('u', q8);//
        
        q8.addTransition('m', q7);
        
        q9.addTransition('u', q10);
        
        q10.addTransition('l', q11);
        
        q11.addTransition('i', q12);
        
        q12.addTransition('s', q7);
        
        q13.addTransition('a', q14);
        q13.addTransition('e', q16);
        
        q14.addTransition('c', q15);
        
        q15.addTransition('a', q7);
        
        q16.addTransition('l', q17);
        
        q17.addTransition('i', q7);
        P = q0;
    }

    public void CreateObjek() {
        //buku, tahu, susu, busa, tisu
        
        StateFA q0 = new StateFA("I.S");
        StateFA q1 = new StateFA("T");
        StateFA q2 = new StateFA("A");
        StateFA q3 = new StateFA("HSK");
        StateFA q4 = new StateFA("IU");
        StateFA q5 = new StateFA("S");
        StateFA q7 = new StateFA("AU",true);
        StateFA q6 = new StateFA("B");
        StateFA q8 = new StateFA("U");
        StateFA q9 = new StateFA("S");
        
        
        q0.addTransition('t', q1);
        q0.addTransition('s', q5);
        q0.addTransition('b', q6);
        
        q1.addTransition('a', q2);
        q1.addTransition('i', q4);
        
        q2.addTransition('h', q3);
        
        q3.addTransition('u', q7);
        
        q4.addTransition('s', q3);
        
        q5.addTransition('u', q4);
        
        q6.addTransition('u', q8);
        
        q8.addTransition('s', q9);
        q8.addTransition('k', q3);
        
        q9.addTransition('a', q7);
        
        O = q0;
    }

    public void CreateKeterangan() {
        //di kos , di kamar , di kota , di kantin , di kafe
        
        StateFA q0 = new StateFA("I.S");
        StateFA q1a = new StateFA("D");
        StateFA q1b = new StateFA("I");
        StateFA q1c = new StateFA(" ");
        StateFA q2 = new StateFA("K");
        StateFA q3 = new StateFA("A");//
        StateFA q4 = new StateFA("N");//
        StateFA q5 = new StateFA("T");
        StateFA q6 = new StateFA("I");
        StateFA q7 = new StateFA("SAREN",true);
        StateFA q8 = new StateFA("O");
        StateFA q9 = new StateFA("T");
        StateFA q10= new StateFA("M"); //
        StateFA q11= new StateFA("R");
        StateFA q12= new StateFA("F"); 


        q0.addTransition('d', q1a);
        q1a.addTransition('i', q1b);
        q1b.addTransition(' ', q1c);
        q1c.addTransition('k', q2);
        
        q2.addTransition('a', q3);
        q2.addTransition('o', q8);
        
        q3.addTransition('n', q4);
        q3.addTransition('m', q10);
        q3.addTransition('f', q12);
        
        q4.addTransition('t', q5);
        
        q5.addTransition('i', q6);
        
        q6.addTransition('n', q7);
        
        q8.addTransition('t', q9);
        q8.addTransition('s', q7);
        
        q9.addTransition('a', q7);
        
        q10.addTransition('a', q11);
        
        q11.addTransition('r', q7);
        
        q12.addTransition('e', q7);
        K = q0;
    }
}
