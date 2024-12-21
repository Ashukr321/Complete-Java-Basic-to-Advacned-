public class ArrayEx1 {
	public static void main(String[] args) {
//		 array store same type data
		int []nums; // declaration
		nums = new int[5];
		nums[0]= 1;
		nums[1]= 2;
		nums[2]= 3;
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);

		int [] numbers = {1,2,4,};
		System.out.println(numbers);
		for(int i = 0; i<numbers.length; i++){
			System.out.println(numbers[i]);
		}

		System.out.println("print the number using for each loop ");
		// for each loop
		for(int x : numbers)
		{
			System.out.println(x);
		}

		int sum = 0;
		for (int x:numbers){
			sum+=x;
		}
		System.out.println("the  sum of the number "+sum);
//		System.out.println(nums.getClass());
	}
}
