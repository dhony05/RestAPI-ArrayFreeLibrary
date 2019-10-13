package com.example.ArrayFreeLibrary.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "topics")
public class Topic {
	@Id
	@Column(name = "keyword")
	private String keyword;
	@Column(name = "name")
	private String name;
	@Column(name = "contributor")
	private String contributor;
	@Column(name = "contributor_email")
	private String contributor_email;
	@Column(name="description")
	private String description ;


	public Topic() {
		this.keyword = null;
		this.name = null;
		this.contributor = null;
		this.contributor_email = null;
		this.description = null;
	}

	public Topic(String keyword, String name,
			String contributor,String contributor_email, String description) {
		super();
		//this.id = id;
		this.keyword = keyword;
		this.name = name;
		this.contributor = contributor;
		this.contributor_email =  contributor_email;
		this.description = description;
	}


	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContributor() {
		return contributor;
	}

	public void setContributor(String contributor) {
		this.contributor = contributor;
	}

	public String getContributor_email() {
		return contributor_email;
	}

	public void setContributor_email(String contributor_email) {
		this.contributor_email = contributor_email;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}








}
