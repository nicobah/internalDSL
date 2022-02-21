package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StateMachine {

    private Map<String, State> states = new HashMap<>();
    private Map<String, Integer> values = new HashMap<>();
    private State current;
    private State initial;
    private String currentEvent;
    private String currentInt;
    private State getState(String name) {
        if (!states.containsKey(name)) states.put(name, new State(name));
        return states.get(name);
    }
//    private String getInt(String string){
//        if (!values.containsKey(string)) values.put(0, string);
//        return values.get(string);
//    }


    public Machine build() {
        return new Machine(states.values(), initial, values);
    }

    public StateMachine state(String state) {
        current = getState(state);
        return this;
    }

    public StateMachine initial() {
        initial = current;
        return this;
    }

    public StateMachine when(String event) {
        currentEvent = event;
        return this;
    }

    public StateMachine to(String state) {
      Transition t = new Transition(currentEvent, getState(state));
      current.getTransitions().add(t);
        return this;
    }

    public StateMachine integer(String string) {
        values.put(string, 0);
        return this;
    }

    public StateMachine set(String string, int i) {
        Transition t = current.getTransitionByEvent(string);
        t.setOperationVariable(string);
        values.put(string, i);
        return this;
    }

    public StateMachine increment(String string) {
        // TODO Auto-generated method stub
        return null;
    }

    public StateMachine decrement(String string) {
        // TODO Auto-generated method stub
        return null;
    }

    public StateMachine ifEquals(String string, int i) {
        // TODO Auto-generated method stub
        return null;
    }

    public StateMachine ifGreaterThan(String string, int i) {
        // TODO Auto-generated method stub
        return null;
    }

    public StateMachine ifLessThan(String string, int i) {
        // TODO Auto-generated method stub
        return null;
    }

}
