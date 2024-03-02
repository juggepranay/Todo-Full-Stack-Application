package com.simpleWebApplication.TODO;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Size;

@Component
public class TODO {
	//int id,int username string Description, LocalDate taregtDAte, Boolean done
	
	private int id;
	private String username;
	
	
	
	@Size(min=10, message="Enter Atlest 10 Characters")
	private String description;
	private LocalDate targetDate;
	private boolean done;
	
	public TODO(int id, String username, String description, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}
	public TODO() {}
	
	@Override
	public String toString() {
		return "TODO [id=" + id + ", username=" + username + ", Description=" + description + ", targetDate="
				+ targetDate + ", done=" + done + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	

}
