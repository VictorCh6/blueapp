package com.bluesoft.application.blueapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="SYSTEMS")
public class SystemModel {

	@Id
	@Column(name = "ID")
	@GeneratedValue
	String id;
	
	@Column(name = "NAME")
	@NotNull(message= "{NotNull.system.name.validation}")
	String name;
	
	@Column(name = "DESCRIPTION")
	@NotNull(message= "{NotNull.system.description.validation}")
	String description;
	
	@Column(name = "TECHNOLOGIES")
	@NotNull(message= "{NotNull.system.technologies.validation}")
	String technologies;
	
	@Column(name = "OWNER")
	@NotNull(message= "{NotNull.system.owner.validation}")
	String owner;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
}
