package GenericsExtra;

public class BehaviourStudent extends LPAStudent {

	private boolean behaviour;

	public BehaviourStudent() {
		super();
		this.behaviour = random.nextBoolean();
	}

	@Override
	public String toString() {
		String behaviorStatus = behaviour ? "Well-behaved" : "Not well-behaved";
		return "%s %20s".formatted(super.toString(), behaviorStatus);
	}

	public boolean isBehaviour() {
		return behaviour;
	}

}