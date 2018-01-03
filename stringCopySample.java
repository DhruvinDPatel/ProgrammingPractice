import java.util.Arrays;

public class stringCopySample{

	public static void main(String[] args){

		int[] arr = {1,2,3,4,5};

		int[] copied = new int[10];

		System.arraycopy(arr, 0, copied, 1, arr.length);

		System.out.println("using arraycopy:" + Arrays.toString(copied));
		// length argument can be less or greater src array's size
		int[] copied2 = Arrays.copyOf(arr, 3);

		System.out.println("using copyOf:" + Arrays.toString(copied2));

	}
}