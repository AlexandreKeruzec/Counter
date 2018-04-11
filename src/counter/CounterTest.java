package counter;

public class CounterTest {

	public static void main(String[] args) {
		Counter counter = new Counter();
		Counter counter2 = new Counter();
		
		System.out.println(counter.getValue());
		counter.inc();
		System.out.println(counter.getValue());
		System.out.println(counter.toString());
		
		System.out.println("counter equals counter 2 : " + counter.equals(counter2));
		counter2.inc();
		System.out.println("counter equals counter 2 : " + counter.equals(counter2));
	}

}
