import java.util.Stack;

public class _1_prg {
	public static void main(String[] args) {
		Stack <Integer>stack = new Stack<>();
		stack.push(3);
		stack.push(34);
		stack.push(5);
		stack.push(6);
		System.out.println(stack);
		System.out.println("top element of the stack:"+stack.peek());
		System.out.println(stack.search(6));
		System.out.println(stack.empty());
	}
}
