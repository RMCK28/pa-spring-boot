package uk.ac.belfastmet.todo.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.todo.domain.Task;
import uk.ac.belfastmet.todo.repository.TaskRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logger
 * 
 * @author MCK18137665
 *
 */
@Service
public class TodoService {

	private static Logger logger = LoggerFactory.getLogger(TodoService.class);

	@Autowired
	private TaskRepository taskRepository;

	public Iterable<Task> getNumberOfTasks() {

		logger.info("# of tasks: {}", taskRepository.count());

		Iterable<Task> toDoTasks = taskRepository.findAll();
		Iterator<Task> iterator = toDoTasks.iterator();
		ArrayList<Task> taskList = new ArrayList<Task>();

		while (iterator.hasNext()) {
			taskList.add(iterator.next());
			// logger.info("{}", iterator.next().toString());

		}
		return taskList;
	}

	// public ArrayList getList() {
	// return null;
	// }

	// public ArrayList getTasks() {

	// task = new Task();
	// task.setName("Name");

	// Task task1 = new Task();
	// task1.setDescription("Description");

	// Task task2 = new Task();
	// task2.setUsername("User name");

	// Task task3 = new Task();
	// task3.setPriority("Priority");

	// Task task4 = new Task();
	// task4.setStatus("Status");

	// ArrayList taskList = new ArrayList();
	// taskList.add(task);
	// taskList.add(task1);
	// taskList.add(task2);
	// taskList.add(task3);
	// taskList.add(task4);

	// return taskList;

	// }

	// public ArrayList getList() {
	// return null;
}
