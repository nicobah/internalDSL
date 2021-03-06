package main.metamodel;

import java.util.*;

	public class Machine {

		private List<State> states = new ArrayList<State>();
		private State initialState;
		private Map<String, Integer> integers;

	public Machine(Collection<State> states, State initialState, Map<String, Integer> integers) {
		super();
		this.states.addAll(states);
		this.initialState = initialState;
		this.integers = integers;
	}


	public List<State> getStates() {
		return states;
	}

	public State getInitialState() {
		return initialState;
	}

	public State getState(String string) {
		State state = null;
		for(State s: states){
			if(s.getName() == string){
				state = s;
			}
		}
		return state;
	}

	public int numberOfIntegers() {
		return integers.size();
	}

	public boolean hasInteger(String string) {
		if(integers.containsKey(string)){
			return true;
		}
		return false;
	}

}
