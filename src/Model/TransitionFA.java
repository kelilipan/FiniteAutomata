/*
 * Copyright 2018 Anvaqta Tangguh
 * https://anvaqta.id/
 */
package Model;

/**
 *
 * @author Anvaqta Tangguh Wisesa <me@anvaqta.id>
 */
public class TransitionFA {

    private Character read;
    private StateFA next;

    public TransitionFA(Character read, StateFA next) {
        this.read = read;
        this.next = next;
    }

    public Character getRead() {
        return read;
    }

    public StateFA getNext() {
        return next;
    }
}
