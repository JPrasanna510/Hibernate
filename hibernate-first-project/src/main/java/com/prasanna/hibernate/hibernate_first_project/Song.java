package com.prasanna.hibernate.hibernate_first_project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Song {
   @Id
   @Column(name="songId")
	  private int id;
   @Column(name="songName")
	  private String songName;
   
	  private String singer;
	  
	  public Song() {
		// TODO Auto-generated constructor stub
	}
	  
	public Song(int id, String songName, String singer) {
		super();
		this.id = id;
		this.songName = songName;
		this.singer = singer;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	  
}
