package ArrayListAssignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskManager {
    public static void main(String[] args) {
        List<Task> result = makeToDoList();
        System.out.println(result);
    }
    public static List<Task> makeToDoList() {
        Task task1 = new Task("Complete assignment");
        Task task2 = new Task("Go for a run");
        Task task3 = new Task("Buy groceries");
        task2.setCompleted(true);

        List<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);

        for (int i = 0; i < taskList.size(); i++) {
            Task task = taskList.get(i);
            System.out.println((i + 1) + ". " + task.getDescription() + " - Completed: " + task.isCompleted());
        }

        return taskList;
    }
}
