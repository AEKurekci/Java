package lab;

import java.util.ArrayList;
import java.util.List;

public class StackOverFlowDemo {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		try {
			
			values.add(5);
			while (true) {
				values.addAll(values);
			}
		} catch (OutOfMemoryError err) {
			System.out.println("No space in the memory");
			System.out.println(values.size());
			values.addAll(values);
		}

	}

}
