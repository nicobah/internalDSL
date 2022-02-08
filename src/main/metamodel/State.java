package main.metamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class State {
	private String name;
	private List<Transition> transitions = new ArrayList<>();


	public State(String name){
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public List<Transition> getTransitions() {
		return transitions;
	}

	public Transition getTransitionByEvent(String event) {
		Transition transition;
		for(Transition t: transitions){
			if(t.getEvent() == event){
				transition = t;
				return transition;
			}
		}
		return null;
	}


}
