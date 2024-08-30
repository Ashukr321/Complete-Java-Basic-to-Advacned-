public class _7_diff_btw_single_right_shift_and_unsigned_right_shift {
	public static void main(String[] args) {
//		>>
		System.out.println("use of signed operator >>");
		int x = -16;
		int y = x>>2;
		System.out.println(y); // -4

		System.out.println("use of unsigned operator >>>" );
		int a = 16;
		int b = a>>>2;
		System.out.println(b);
	}
}
