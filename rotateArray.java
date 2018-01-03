import java.util.Arrays;
import java.lang.IllegalArgumentException;

public class rotateArray{

	//o(n) space
	public static void rotate(int[] arr, int k){

		if(arr == null || k < 0)
			throw new IllegalArgumentException("check arguments");

		int n = arr.length;

		if( k> n)
			k = k % n;

		int[] result = new int[n];

		for(int i = 0; i < k; i++)
			result[i] = arr[n - k + i];

		int j = 0;

		for(int i=k; i < n; i++)
			result[i] = arr[j++];

		System.arraycopy(result, 0, arr, 0, n);
	}

	public static void bubbleRotate(int[] arr, int k){

		if(arr == null || k < 0)
			throw new IllegalArgumentException("check arguments");

		int n = arr.length;

		if( k>n)
			k = k % n;

		for(int i=0; i < k; i++){
			for(int j=n-1; j > 0; j--){
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}
		}
	}

	public static void reverseRotate(int[] arr, int k){

		if(arr == null || k <0)
			throw new IllegalArgumentException("check arguments");

		int n = arr.length;

		if(k>n);
			k = k % n;

		int lengthOfFirstPart = n - k;

		reverse_helper(arr, 0, lengthOfFirstPart-1);
		reverse_helper(arr, lengthOfFirstPart, n-1);
		reverse_helper(arr, 0, n-1);
	}

	public static void reverse_helper(int[] arr, int left, int right){
		if(arr == null || arr.length == 1)
			return;

		while(left<right){
			int temp = arr[left];
			arr[left++] = arr[right];
			arr[right--] = temp;
		}
	}

	public static void main(String[] args){

		int[] a = {1,5,7,9,11};
		
		rotate(a,6);
		System.out.println("arraycopy rotate: "+Arrays.toString(a));

		bubbleRotate(a,2);
		System.out.println("bubbleRotate :"+Arrays.toString(a));

		int[] a2 = {1,2,3,4,5,6};

		reverseRotate(a2,2);
		System.out.println("reverseRotate: "+Arrays.toString(a2));
	}
}