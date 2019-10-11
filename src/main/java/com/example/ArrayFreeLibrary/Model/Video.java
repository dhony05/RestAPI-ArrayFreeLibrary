package com.example.ArrayFreeLibrary.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "videos")
public class Video {
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
	@Column(name="topic")
	private Topic topic;


	


	public Video() {
		this.keyword = null;
		this.name = null;
		this.source = null;
		this.contributor = null;
		this.contributor_email = null;
		this.description = null;
		this.topic = null;
	}
	

	public Video(String keyword, String name,String source,String author,
			String contributor,String contributor_email, String description, Topic topic) {
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
		this.topic = new Topic(keyword,"","","","",contributor,"");
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
	public Topic getTopic() {
		return topic;
	}


	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return  ", keyword=" + keyword + ", name=" + name + ", source=" + source + ", author="
				+ author + ", contributor=" + contributor + ", contributor_email=" + contributor_email
				+ ", description=" + description + "]";
	}







}
