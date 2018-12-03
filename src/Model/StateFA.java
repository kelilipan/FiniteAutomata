/*
 * Copyright 2018 Anvaqta Tangguh
 * https://anvaqta.id/
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anvaqta Tangguh Wisesa <me@anvaqta.id>
 */
public class StateFA {

    private String name;
    private List<TransitionFA> transisi;
    private boolean isFinal;

    public StateFA(String name) {
        this.name = name;
        transisi = new ArrayList<>();
        isFinal = false;
    }

    public StateFA(String name, boolean isFinal) {
        this.name = name;
        transisi = new ArrayList<>();
        this.isFinal = isFinal;
    }

    public boolean getIsFinal() {
        return isFinal;
    }

    public String getName() {
        return name;
    }

    public void addTransition(Character read, StateFA next) {
        transisi.add(new TransitionFA(read, next));
    }

    public StateFA getNext(Character read) {
        for (TransitionFA o : transisi) {
            if (o.getRead().equals(read)) {
                return o.getNext();
            }
        }
        return null;
    }

}
