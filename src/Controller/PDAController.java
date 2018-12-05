/*
 * Copyright 2018 Anvaqta Tangguh
 * https://anvaqta.id/
 */
package Controller;

import Model.StateFA;
import Model.StatePDA;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Anvaqta Tangguh Wisesa <me@anvaqta.id>
 */
public class PDAController {

    Stack<Character> stack;
    StatePDA init;
    StatePDA s;
    StatePDA q0;
    StatePDA q1;
    StatePDA q2;
    StatePDA q3;
    FAController fa = new FAController();
    StatePDA current;

    public PDAController(List<String> token) {
        stack = new Stack<>();
        init = new StatePDA("IS");
        s = new StatePDA("s");
        q0 = new StatePDA("q0");
        q1 = new StatePDA("q1");
        q2 = new StatePDA("q2");
        q3 = new StatePDA("q3", true);
        init.addTransition(Character.MIN_VALUE, Character.MIN_VALUE, "S#", s);
        s.addTransition(Character.MIN_VALUE, 'S', "spX", q0);
        q0.addTransition('s', 's', "", q0);
        q0.addTransition('p', 'p', "", q0);
        q0.addTransition('o', 'X', "Y", q1);
        q0.addTransition('k', 'X', "", q2);
        q0.addTransition(Character.MIN_VALUE, 'X', "", q2);
        q1.addTransition(Character.MIN_VALUE, 'Y', "", q2);
        q1.addTransition('k', 'Y', "", q2);
        q2.addTransition(Character.MIN_VALUE, '#', "", q3);
        current = init;
        current = current.getNext(stack, Character.MIN_VALUE, Character.MIN_VALUE);
        current = current.getNext(stack, Character.MIN_VALUE, stack.pop());
        int i = 0;
        while (current != null && i < token.size()) {
            current = current.getNext(stack, tokenRecognizer(token.get(i)), stack.pop());
            i++;
        }
        while (current != null && !stack.isEmpty()) {
            current = current.getNext(stack, Character.MIN_VALUE, stack.pop());
        }
    }

    public boolean isAccepted() {
        return (current != null ? current.isFinal() : false);
    }

    public Character tokenRecognizer(String token) {
        if (isAccepted(token, fa.S)) {
            return 's';
        } else if (isAccepted(token, fa.K)) {
            return 'k';
        } else if (isAccepted(token, fa.O)) {
            return 'o';
        } else if (isAccepted(token, fa.P)) {
            return 'p';
        }
        return 'x';
    }

    public boolean isAccepted(String kata, StateFA initialState) {
        StateFA current = initialState;
        int i = 0;
        while (current != null && i < kata.length()) {
            current = current.getNext(kata.charAt(i));
            i++;
        }
        return current != null ? current.getIsFinal() : false;
    }
}
