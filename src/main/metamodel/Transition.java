package main.metamodel;

public class Transition {
	private String event;
	private State target;
	private String operationVariable;

	public Transition(String event, State target) {
		super();
		this.event = event;
		this.target = target;
	}
	public void setOperationVariable(String string){
		operationVariable = string;
	}

	public Object getEvent() {
		return event;
	}

	public State getTarget() {
		return target;
	}

	public boolean hasSetOperation() {
		if(getTarget() != null){
			return true;
		}
		return false;
	}

	public boolean hasIncrementOperation() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasDecrementOperation() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getOperationVariableName() {
		return operationVariable;
	}

	public boolean isConditional() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getConditionVariableName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getConditionComparedValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isConditionEqual() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isConditionGreaterThan() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isConditionLessThan() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasOperation() {
		// TODO Auto-generated method stub
		return false;
	}

}
