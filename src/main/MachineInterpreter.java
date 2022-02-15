package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {

	private State current;

	public void run(Machine m) {
		current = m.getInitialState();

		
	}

	public State getCurrentState() {
		return current;
	}

	public void processEvent(String string) {
		for(Transition t: current.getTransitions()){
			if(t.getEvent() == string){
				current = t.getTarget();
			}
		}
	}

	public int getInteger(String string) {

		return 0;
	}

}
