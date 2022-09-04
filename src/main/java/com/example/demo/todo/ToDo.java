package com.example.demo.todo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todo")
public class ToDo {
	@Id
	Integer id;
	String name;
	String summary;
	String description;
	String author;
	
	public ToDo() {

	}
	
	public ToDo(Integer id, String name, String summary, String description) {
		super();
		this.id = id;
		this.name = name;
		this.summary = summary;
		this.description = description;
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
