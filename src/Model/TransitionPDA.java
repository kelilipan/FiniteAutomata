/*
 * Copyright 2018 Anvaqta Tangguh
 * https://anvaqta.id/
 */
package Model;

/**
 *
 * @author Anvaqta Tangguh Wisesa <me@anvaqta.id>
 */
public class TransitionPDA {

    private Character read;
    private Character pop;
    private String push;
    private StatePDA next;

    public TransitionPDA(Character read, Character pop, String push, StatePDA next) {
        this.read = read;
        this.pop = pop;
        this.push = push;
        this.next = next;
    }

    public Character getRead() {
        return read;
    }

    public Character getPop() {
        return pop;
    }

    public String getPush() {
        return push;
    }

    public StatePDA getNext() {
        return next;
    }
}
