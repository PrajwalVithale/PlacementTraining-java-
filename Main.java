import java.util.Scanner;

class Contact {
    String name, phone;
    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public String toString() {
        return "Name: " + name + ", Phone: " + phone;
    }
}

class Task {
    String taskName;
    boolean isCompleted;
    Task(String taskName) {
        this.taskName = taskName;
        this.isCompleted = false;
    }
    public String toString() {
        return (isCompleted ? " " : "[ ] ") + taskName;
    }
}

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Contact[] contacts = new Contact[100];
    static int contactCount = 0;
    static Task[] tasks = new Task[100];
    static int taskCount = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n==== Utility Box ====");
            System.out.println("1. Contact Book");
            System.out.println("2. To-Do List");
            System.out.println("3. Calculator");
            System.out.println("4. Number Guessing Game");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt(); sc.nextLine();
            if (ch == 1) contactBook();
            else if (ch == 2) toDoList();
            else if (ch == 3) calculator();
            else if (ch == 4) numberGuessingGame();
            else if (ch == 5) { System.out.println("Exiting..."); break; }
            else System.out.println("Invalid choice.");
        }
    }

    static void contactBook() {
        while (true) {
            System.out.println("\n--- Contact Book ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Delete Contact");
            System.out.println("4. Back");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt(); sc.nextLine();
            if (ch == 1) {
                System.out.print("Enter name: "); String name = sc.nextLine();
                System.out.print("Enter phone: "); String phone = sc.nextLine();
                contacts[contactCount++] = new Contact(name, phone);
                System.out.println("Contact added.");
            } else if (ch == 2) {
                for (int i = 0; i < contactCount; i++) System.out.println((i+1) + ". " + contacts[i]);
            } else if (ch == 3) {
                System.out.print("Enter contact number to delete: "); int idx = sc.nextInt(); sc.nextLine();
                if (idx >= 1 && idx <= contactCount) {
                    for (int i = idx - 1; i < contactCount - 1; i++) contacts[i] = contacts[i + 1];
                    contactCount--;
                    System.out.println("Contact deleted.");
                } else System.out.println("Invalid index.");
            } else if (ch == 4) return;
            else System.out.println("Invalid.");
        }
    }

    static void toDoList() {
        while (true) {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Mark Task Completed");
            System.out.println("5. Back");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt(); sc.nextLine();
            if (ch == 1) {
                System.out.print("Enter task: "); String taskName = sc.nextLine();
                tasks[taskCount++] = new Task(taskName);
                System.out.println("Task added.");
            } else if (ch == 2) {
                for (int i = 0; i < taskCount; i++) System.out.println((i+1) + ". " + tasks[i]);
            } else if (ch == 3) {
                System.out.print("Enter task number to delete: "); int idx = sc.nextInt(); sc.nextLine();
                if (idx >= 1 && idx <= taskCount) {
                    for (int i = idx - 1; i < taskCount - 1; i++) tasks[i] = tasks[i + 1];
                    taskCount--;
                    System.out.println("Task deleted.");
                } else System.out.println("Invalid index.");
            } else if (ch == 4) {
                System.out.print("Enter task number to mark complete: "); int idx = sc.nextInt(); sc.nextLine();
                if (idx >= 1 && idx <= taskCount) {
                    tasks[idx - 1].isCompleted = true;
                    System.out.println("Task marked completed.");
                } else System.out.println("Invalid index.");
            } else if (ch == 5) return;
            else System.out.println("Invalid.");
        }
    }

    static void calculator() {
        while (true) {
            System.out.println("\n--- Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Back");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            if (ch >= 1 && ch <= 4) {
                System.out.print("Enter first number: "); double a = sc.nextDouble();
                System.out.print("Enter second number: "); double b = sc.nextDouble();
                if (ch == 1) System.out.println("Result: " + (a + b));
                else if (ch == 2) System.out.println("Result: " + (a - b));
                else if (ch == 3) System.out.println("Result: " + (a * b));
                else if (ch == 4) {
                    if (b == 0) System.out.println("Cannot divide by zero.");
                    else System.out.println("Result: " + (a / b));
                }
            } else if (ch == 5) return;
            else System.out.println("Invalid.");
        }
    }

    static void numberGuessingGame() {
        int number = (int)(Math.random() * 100) + 1;
        int attempts = 0;
        System.out.println("\n--- Number Guessing Game (1-100) ---");
        while (true) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt(); attempts++;
            if (guess == number) {
                System.out.println("Correct! Attempts: " + attempts);
                break;
            } else if (guess < number) System.out.println("Too low.");
            else System.out.println("Too high.");
        }
    }
}