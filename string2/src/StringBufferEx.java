public class StringBufferEx {
	public static void main(String[] args) {
		// string buffer is mutable in nature
		// this  Allocates new memory in the heap
		StringBuffer sb = new StringBuffer("hello");
		// default capacity is 16

		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.append("world"));// here we can append in to
		sb.delete(2,5);// start index and end index;
		// this will delete start index to end index - 1
		// this is thread safe   and synchronized in nature , so that this slightly slower than the
		// stringBuilder



		System.out.println(sb);

	}
}
