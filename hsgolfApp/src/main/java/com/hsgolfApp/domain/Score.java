package com.hsgolfApp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Score {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "fk_player")
	private User player;
	
	@ManyToOne
	@JoinColumn(name = "fk_course")
	private Course course;
	
	private int strokes;
	private float rating;
	private int slope;	
	private float differential;
	
	public Score(User player, Course course, int strokes) {
		super();
		this.player = player;
		this.course = course;
		this.strokes = strokes;
		if(player.getGender().equals("female")) {
			rating = course.getTeebox().getW_rating();
			slope = course.getTeebox().getW_slope();
		}
		else {
			rating = course.getTeebox().getM_rating();
			slope = course.getTeebox().getM_slope();
		}
		float calcIndex = (getStrokes() - rating)*(113/slope);
		setDifferential(calcIndex);	
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getPlayer() {
		return player;
	}

	public void setPlayer(User player) {
		this.player = player;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getStrokes() {
		return strokes;
	}

	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}

	public float getDifferential() {
		return differential;
	}

	public void setDifferential(float differential) {
		this.differential = differential;
	}
	
	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getSlope() {
		return slope;
	}

	public void setSlope(int slope) {
		this.slope = slope;
	}
	

}
