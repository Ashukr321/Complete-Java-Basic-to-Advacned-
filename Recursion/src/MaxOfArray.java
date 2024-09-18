public class MaxOfArray {
	static int maximum(int arr[], int i, int end) {
		int max;
		if (i == end - 1)
			return (arr[i] > arr[i + 1]) ? arr[i] : arr[i + 1];
		max = maximum(arr, i + 1, end);
		return (arr[i] > max) ? arr[i] : max;
	}
	public static void main(String args[]) {
		int arr[] = {12, 13, 1, 10, 34, 10};
		int end = arr.length - 1;
		System.out.print(maximum(arr, 0, end));
	}
}
