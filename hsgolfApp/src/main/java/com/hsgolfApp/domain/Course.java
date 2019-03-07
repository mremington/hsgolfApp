package com.hsgolfApp.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany(mappedBy = "course")
	private List<Score> scores = new ArrayList<Score>();
	
	@OneToOne(mappedBy = "course")
	private Teebox teebox;
	
	@OneToMany(mappedBy = "course")
	private List<Match> matchList = new ArrayList<Match>();
	
	private String name;
	private String address;
	private String phone;
	private int frontNinePar;
	private int backNinePar;
	
	
	public Course(Teebox teebox, String name, String address, String phone, int frontNinePar,
			int backNinePar) {
		super();
		this.teebox = teebox;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.frontNinePar = frontNinePar;
		this.backNinePar = backNinePar;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Score> getScores() {
		return scores;
	}
	public void setScores(List<Score> scores) {
		this.scores = scores;
	}
	public Teebox getTeebox() {
		return teebox;
	}
	public void setTeebox(Teebox teebox) {
		this.teebox = teebox;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getFrontNinePar() {
		return frontNinePar;
	}
	public void setFrontNinePar(int frontNinePar) {
		this.frontNinePar = frontNinePar;
	}
	public int getBackNinePar() {
		return backNinePar;
	}
	public void setBackNinePar(int backNinePar) {
		this.backNinePar = backNinePar;
	}
	
	public List<Match> getMatchList() {
		return matchList;
	}

	public void setMatchList(List<Match> matchList) {
		this.matchList = matchList;
	}
	

}
