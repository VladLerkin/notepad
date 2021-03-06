package com.jorgeacetozi.notepad.note.domain.model;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Note {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "entity_generator")
	@SequenceGenerator(name="entity_generator", sequenceName = "entity_seq", allocationSize=50)
	@Column(updatable = false, nullable = false)
	private Long id;

	@NotEmpty
	private String title;

	@NotEmpty
	private String content;
	
	// Makes Hibernate happy
	public Note () {
		
	}
	
	public Note (String title, String content) {
		this.title = title;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public Integer getWordCount() {
		return this.content.split(" ").length;
	}

	@Override
	public String toString() {
		return "Note [id=" + id + ", title=" + title + ", content=" + content + ", wordCount=" + this.getWordCount() + "]";
	}
}
