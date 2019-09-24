package uk.ac.belfastmet.todo.domain;

public class Task {

	private String Description;
	private Boolean Status;
	private String Name;
	private String Username;
	private String Priority;

	public Task() {

	}

	/**
	 * Getters and setters for strings & boolean variables
	 * 
	 * @return
	 */
	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

	public Boolean getStatus() {
		return Status;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String Username) {
		this.Username = Username;
	}

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
