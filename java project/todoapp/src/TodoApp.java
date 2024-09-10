import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
	private ArrayList<String> todoList;

	// constructor
	public TodoApp() {
		todoList = new ArrayList<>();
	}

	// add todo list
	public void addTodoList(String todo) {
		todoList.add(todo);
		System.out.println("Todo list added: " + todo);
	}

	public void removeTodoList(int index) {
		if (index >= 0 && index < todoList.size()) {
			String removeTodo = todoList.remove(index);
			System.out.println("Todo item is removed: " + removeTodo);
		}
	}

	public void printTodos() {
		for (int i = 0; i < todoList.size(); i++) {
			String todo = todoList.get(i);
			System.out.println((i + 1) + ". " + todo);
		}
	}

	public static void main(String[] args) {
		TodoApp todoApp = new TodoApp();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Welcome to Todo App");
			System.out.println("1. Add todo");
			System.out.println("2. Remove todo");
			System.out.println("3. Print todos");
			System.out.println("4. Exit");
			int item = sc.nextInt();
			sc.nextLine(); // consume newline left-over

			switch (item) {
				case 1:
					System.out.println("Enter your todo:");
					String todo = sc.nextLine();
					todoApp.addTodoList(todo);
					break;
				case 2:
					System.out.println("Enter index you want to remove");
					int index = sc.nextInt();
					sc.nextLine(); // consume newline left-over
					todoApp.removeTodoList(index);
					break;
				case 3:
					todoApp.printTodos();
					break;
				case 4:
					System.out.println("Exiting...");
					return;
				default:
					System.out.println("Invalid option. Please try again.");
					break;
			}
		}
	}
}