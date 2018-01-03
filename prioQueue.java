import java.util.*;

class prioQueue{

	public static void main(String[] args){

		PriorityQueue<String> pqueue = new PriorityQueue<String>();

		pqueue.add("C");
		pqueue.add("C++");
		pqueue.add("Java");
		pqueue.add("Python");

		System.out.println("Head : "+ pqueue.peek());

		System.out.println("Elements ");

		for(String s:pqueue){
			System.out.println(s);
		}

		pqueue.poll();

		System.out.println("Elements after polling");

		for(String s:pqueue){
			System.out.println(s);
		}

		pqueue.remove("Java");

		System.out.println("Elements after removing java(remove)");

		for(String s:pqueue){
			System.out.println(s);
		}

		System.out.println("C is in queue or not test using contains: "+ String.valueOf(pqueue.contains("C")));
	}
}