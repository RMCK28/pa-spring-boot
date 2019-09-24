package uk.ac.belfastmet.todo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import uk.ac.belfastmet.todo.domain.Task;

@Service
public class TodoService {

	public ArrayList getTasks() {

		Task task = new Task();
		task.setName("Name");

		Task task1 = new Task();
		task1.setDescription("Description");

		Task task2 = new Task();
		task2.setUsername("User name");

		Task task3 = new Task();
		task3.setPriority("Priority");

		Task task4 = new Task();
		task4.setStatus("Status");

		ArrayList taskList = new ArrayList();
		taskList.add(task);
		taskList.add(task1);
		taskList.add(task2);
		taskList.add(task3);
		taskList.add(task4);

		return taskList;

	}

	public ArrayList getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
