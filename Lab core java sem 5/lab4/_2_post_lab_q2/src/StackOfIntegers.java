public class StackOfIntegers {
	// Private fields
	private int[] elements;
	private int size;

	// No-arg constructor
	public StackOfIntegers() {
		this.size = 0;
		this.elements = new int[10]; // Initialize the array with a default capacity of 10
	}

	// Constructor with specified capacity
	public StackOfIntegers(int capacity) {
		this.size = 0;
		this.elements = new int[capacity]; // Initialize the array with the given capacity
	}

	// Method to check if the stack is empty
	public boolean empty() {
		return size == 0;
	}

	// Method to peek at the top element of the stack
	public int peek() {
		if (empty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return elements[size - 1];
	}

	// Method to push a value onto the stack
	public void push(int value) {
		if (size >= elements.length) {
			// If the array is full, double the size of the array
			int[] newElements = new int[elements.length * 2];
			System.arraycopy(elements, 0, newElements, 0, elements.length);
			elements = newElements;
		}
		elements[size++] = value;
	}

	// Method to pop a value from the stack
	public int pop() {
		if (empty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return elements[--size];
	}

	// Method to get the current size of the stack
	public int getSize() {
		return size;
	}

	// Main method to test the StackOfIntegers class
	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers();

		// Push elements to the stack
		stack.push(10);
		stack.push(20);
		stack.push(30);

		// Peek at the top element
		System.out.println("Top element: " + stack.peek());

		// Pop elements from the stack
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Popped element: " + stack.pop());

		// Check the current size of the stack
		System.out.println("Current size of stack: " + stack.getSize());
	}
}
