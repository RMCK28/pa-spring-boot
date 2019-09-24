package uk.ac.belfastmet.todo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table
public class Task {
	
	private long id;
	private String Description;
	private Boolean Status;
	private String Name;
	private String Username;
	private String Priority;

	public Task(String descritotion, Boolean Status, String Name, String Username, String priortiy) {
		super();
		
	}
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Task() {

	}

	/**
	 * Getters and setters for strings & boolean variables
	 * 
	 * @return
	 */
	@Column (name = "description")
	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}
@Column (name = "status")
	public Boolean getStatus() {
		return Status;
	}
@Column (name = "name")
	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
	@Column (name = "username")
	public String getUsername() {
		return Username;
	}

	public void setUsername(String Username) {
		this.Username = Username;
	}
	@Column (name = "priority")
	public String getPriority() {
		return Priority;
	}

	public void setPriority(String Priority) {
		this.Priority = Priority;
	}

	public void setStatus(String string) {
		// TODO Auto-generated method stub

	}

}
