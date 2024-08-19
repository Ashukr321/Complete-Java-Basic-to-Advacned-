public class _2_Java_program_to_compute_the_factorial_of_a_number {
	public static void main(String[] args) {
		int num = 5;
		int factorial = 1;
		for(int i  =1 ; i<=num; i++){
			factorial*=i;
		}
		System.out.println("Factorial of " + num + " is " + factorial);
	}
}
