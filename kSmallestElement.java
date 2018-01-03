import java.util.*;

public class kSmallestElement{

	public static int findKthSmallest(int[] nums, int k){
		if(k<1 || nums == null)
			return 0;

		return getKth(k, nums, 0, nums.length - 1);

		// for largest getKth(num.length - k + 1)
	}

	public static int getKth(int k, int[] nums, int start, int end){

		int pivot = nums[end];
		int left = start;
		int right = end;

		while(true){

			while(nums[left] < pivot && left < right)
				left++;

			while(nums[right] >= pivot && right > left)
				right--;

			if(left == right)
				break;

			swap(nums, left, right);
		}

		swap(nums, left, end);

		if(k == left + 1)
			return pivot;
		else if(k < left + 1)
			return getKth(k ,nums, start, left - 1);
		else
			return getKth(k, nums, left + 1, end);
	}

	public static void swap(int[] arr, int n1, int n2){
		int temp = arr[n1];
		arr[n1] = arr[n2];
		arr[n2] = temp;
	}

	public static void main(String[] args){

		int[] a1 = {3,-1,1,4,2,5};

		System.out.println("2nd smallest element: " + String.valueOf(findKthSmallest(a1, 2)) + "  "+ Arrays.toString(a1));

	}
}