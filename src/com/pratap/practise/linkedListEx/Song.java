package com.pratap.practise.linkedListEx;

public class Song {
	private String title;
	private double duration;
	
	
	public Song(String title, double duration) {
		this.title = title;
		this.duration = duration;
	}


	public String getTitle() {
		return title;
	}


	@Override
	public String toString() {
		return "Song [title=" + this.title + ", duration=" + this.duration + "]";
	}
	
	
	
	
}
