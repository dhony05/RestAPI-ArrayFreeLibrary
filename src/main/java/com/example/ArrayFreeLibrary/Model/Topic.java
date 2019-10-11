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
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private Long id;

	@Column(name = "keyword")
	private String keyword;

	@Column(name = "name")
	private String name;
	@Column(name = "type")
//	private String type;
//	@Column(name = "source")
	private String source;
	@Column(name = "author")
	private String author;
	@Column(name = "contributor")
	private String contributor;
	@Column(name = "contributor_email")
	private String contributor_email;
	@Column(name="description")
	private String description ;


	public Topic() {
		this.keyword = null;
		this.name = null;
		this.source = null;
		this.contributor = null;
		this.contributor_email = null;
		this.description = null;
	}

	public Topic(String keyword, String name,String source,String author,
			String contributor,String contributor_email, String description) {
		super();
		//this.id = id;
		this.keyword = keyword;
		this.name = name;
//		this.type = type;
		this.source = source;
		this.author = author;
		this.contributor = contributor;
		this.contributor_email =  contributor_email;
		this.description = description;
	}

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
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
//	public String getType() {
//		return type;
//	}
//	
//	public void setType(String type) {
//		this.type = type;
//	}
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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

	@Override
	public String toString() {
		return  ", keyword=" + keyword + ", name=" + name + ", source=" + source + ", author="
				+ author + ", contributor=" + contributor + ", contributor_email=" + contributor_email
				+ ", description=" + description + "]";
	}







}
