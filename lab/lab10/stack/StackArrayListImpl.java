package stack;
import java.util.ArrayList;
public class StackArrayListImpl<T> implements Stack<T>{
	
	private T type;
	ArrayList<T> List = new ArrayList<T>();
	
	public void push(Object item) {
		List.add(item);
		
	}
	
	public Object pop() {
		return List.remove(List.size()-1);
		
	}
	
	public boolean empty() {
		return List.isEmpty();
	}

}
