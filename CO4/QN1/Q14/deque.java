import java.util.*;

public class deque {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		deque.addFirst("Java");
		deque.add("is");
		deque.addLast("a");
		deque.addLast("Programming");
		deque.addLast("Language");
		System.out.println(deque);
		deque.removeFirst();
		System.out.println(deque);
	}
}