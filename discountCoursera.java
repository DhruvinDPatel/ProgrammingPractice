import java.util.*;

public class discountCoursera{

	public static void findDiscount(int[] arr){

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(arr.length);
		HashMap<Integer, Integer> noDiscountIndexes = new HashMap<Integer, Integer>();
		int sum = 0;

		for(int i = 0; i < arr.length; i++)
			pq.offer(arr[i]);

		//System.out.println("Queue at start "+ pq.toString());

		for(int i = 0; i < arr.length; i++){
			int min = pq.peek();
			pq.remove(arr[i]);
			if(arr[i] > min)
				arr[i] = arr[i] - min;
			else
				noDiscountIndexes.put(i, arr[i]);
			//System.out.println("Queue after step "+ String.valueOf(i+1) + pq.toString());
		}

		for(Integer i: arr){
			System.out.print(i + " ");
			sum+=i;
		}

		System.out.println("\nSum: " + String.valueOf(sum));

		if(noDiscountIndexes!= null)
			System.out.println(noDiscountIndexes.keySet());
	}

	public static void main(String[] args){

		int[] a = {5,1,3,4,6,2};

		findDiscount(a);
	}
}