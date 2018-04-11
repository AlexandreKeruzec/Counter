package counter;

public class Counter {
	private int value;
	private final int increment;
	private static int globalCounter = -1;
	
	public Counter() {
		super();
		this.value = 0;
		this.increment = 1;
		if(globalCounter==-1) {
			globalCounter = 0;
		}
	}
	
	public Counter(int value, int increment) {
		super();
		this.value = value;
		this.increment = increment;
		if(globalCounter!=-1) {
			globalCounter = 0;
		}
	}

	public int getValue() {
		return value;
	}
	
	public static int getglobalCounter() {
		return globalCounter;
	}
	
	public void inc() {
		value += increment;
		globalCounter += increment;
	}
	
	public String toString() {
		return "valeur : " + value + " (increment " + increment + ")";  
	}
	
	public boolean equals(Counter counterToCompare) {
		return getValue() == counterToCompare.getValue();
	}
}
