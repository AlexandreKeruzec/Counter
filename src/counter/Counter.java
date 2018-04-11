package counter;

public class Counter {
	private int value;
	private int increment;
	
	public Counter() {
		super();
		this.value = 0;
		this.increment = 1;
	}
	
	public Counter(int value, int increment) {
		super();
		this.value = value;
		this.increment = increment;
	}

	public int getValue() {
		return value;
	}
	
	public void inc() {
		value += increment;
	}
	
	public String toString() {
		return "valeur : " + value + " (increment " + increment + ")";  
	}
	
	public boolean equals(Counter counterToCompare) {
		return getValue() == counterToCompare.getValue();
	}
}
