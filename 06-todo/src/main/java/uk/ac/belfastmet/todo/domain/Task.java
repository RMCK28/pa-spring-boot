package uk.ac.belfastmet.todo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

/**
 * 
 * @author MCK18137665
 *
 */
@Entity
@Table(name = "task")
public class Task {

	private long id;
	private String Name;
	// private Boolean Status;
	private String Description;
	private String User;
	private String Priority;

	/**
	 *
	 * @param Name        - name of task being carried out
	 * @param description - describing the task being carried
	 * @param User        - name of person carrying out the task
	 * @param priortiy    - Importance of the task
	 */
	public Task(String Name, String description, String User, String priortiy) {
		super();

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Task() {

	}

	/**
	 * Getters and setters for strings variables
	 * 
	 * @return
	 */
	@Column(name = "description")
	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

	// @Column(name = "status")
	// public Boolean getStatus() {
	// return Status;
	// }

	@Column(name = "name")
	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	@Column(name = "user")
	public String getUser() {
		return User;
	}

	public void setUser(String User) {
		this.User = User;
	}

	@Column(name = "priority")
	public String getPriority() {
		return Priority;
	}

	public void setPriority(String Priority) {
		this.Priority = Priority;
	}

	public void setStatus(String string) {

	}

	public String toString() {
		return this.Description + "" + this.Name + "" + this.User + "" + this.Priority;
	}
}
