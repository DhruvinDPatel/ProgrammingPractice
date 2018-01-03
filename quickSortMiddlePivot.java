import java.util.Arrays;

public class quickSortMiddlePivot{

	public static void quickSort(int[] arr, int low, int high){

		if(arr==null || arr.length == 0)
			return;

		if(low>=high)
			return;

		int mid = low + (high - low)/2;
		int pivot = arr[mid];

		int i = low, j = high;

		while(i<=j){
			while(arr[i] < pivot)
				i++;

			while(arr[j] > pivot)
				j--;

			if(i <= j){
				int temp = arr[i];
				arr[i++] = arr[j];
				arr[j--] = temp;
			}

			if(low<j)
				quickSort(arr, low, j);

			if(high>i)
				quickSort(arr, i, high);
		}
	}
	
	public static void main(String[] args){

			int[] x = {9,2,4,7,3,7,10};

			System.out.println(Arrays.toString(x));

			int low = 0, high = x.length - 1;
			quickSort(x, low, high);
			System.out.println(Arrays.toString(x));			
	}
}