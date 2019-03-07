package com.hsgolfApp.domain;



import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Teebox {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private TeeboxName name;
	
	@OneToOne
	@JoinColumn(name = "fk_course")
	private Course course;
	
	private int m_slope;
	private float m_rating;
	private int w_slope;
	private float w_rating;
	
	
	public Teebox(TeeboxName name, int m_slope, float m_rating, int w_slope, float w_rating) {
		super();
		this.name = name;
		this.m_slope = m_slope;
		this.m_rating = m_rating;
		this.w_slope = w_slope;
		this.w_rating = w_rating;
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TeeboxName getName() {
		return name;
	}
	public void setName(TeeboxName name) {
		this.name = name;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public int getM_slope() {
		return m_slope;
	}
	public void setM_slope(int m_slope) {
		this.m_slope = m_slope;
	}
	public float getM_rating() {
		return m_rating;
	}
	public void setM_rating(float m_rating) {
		this.m_rating = m_rating;
	}
	public int getW_slope() {
		return w_slope;
	}
	public void setW_slope(int w_slope) {
		this.w_slope = w_slope;
	}
	public float getW_rating() {
		return w_rating;
	}
	public void setW_rating(float w_rating) {
		this.w_rating = w_rating;
	}
	
	
	
	

}
