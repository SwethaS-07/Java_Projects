package package1;

import java.util.*;

class Task {
    String title;
    boolean completed;

    Task(String title){
        this.title = title;
        this.completed = false;
    }
}

public class Todolist {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        int choice;

        do{
            System.out.println("\n--- To Do List ---");
            System.out.println("1 Add Task");
            System.out.println("2 View Tasks");
            System.out.println("3 Mark Task Completed");
            System.out.println("4 Delete Task");
            System.out.println("5 Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

            case 1:
                System.out.print("Enter task: ");
                String title = sc.nextLine();
                tasks.add(new Task(title));
                System.out.println("Task added.");
                break;

            case 2:
                if(tasks.isEmpty()){
                    System.out.println("No tasks available.");
                } else {
                    for(int i=0;i<tasks.size();i++){
                        Task t = tasks.get(i);
                        String status = t.completed ? "Completed" : "Pending";
                        System.out.println((i+1) + ". " + t.title + " [" + status + "]");
                    }
                }
                break;

            case 3:
                System.out.print("Enter task number: ");
                int num = sc.nextInt();
                if(num >0 && num <= tasks.size()){
                    tasks.get(num-1).completed = true;
                    System.out.println("Task marked completed.");
                } else {
                    System.out.println("Invalid task number.");
                }
                break;

            case 4:
                System.out.print("Enter task number to delete: ");
                int del = sc.nextInt();
                if(del >0 && del <= tasks.size()){
                    tasks.remove(del-1);
                    System.out.println("Task deleted.");
                } else {
                    System.out.println("Invalid task number.");
                }
                break;

            }

        }while(choice != 5);

        System.out.println("Program closed.");
        sc.close();
    }
}
