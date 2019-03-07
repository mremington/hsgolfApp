package com.hsgolfApp.domain;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "fk_league")
	private League league;
	
	@OneToMany(mappedBy = "team")
	private List<User> userList = new ArrayList<User>();
	
	@OneToMany(mappedBy = "awayTeam")
	private List<Match> awayMatchList = new ArrayList<Match>();
	
	@OneToMany(mappedBy = "homeTeam")
	private List<Match> homeMatchList = new ArrayList<Match>();
	
	private String name;
	private String address;
	private String phone;
	private Color color1;
	private Color color2;
	private String logoFile;
	private String mascot;
	
	
	public Team() {}
	
	public Team(League league, String name, String address, String phone, Color color1,
			Color color2, String logoFile, String mascot) {
		super();
		this.league = league;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.color1 = color1;
		this.color2 = color2;
		this.logoFile = logoFile;
		this.mascot = mascot;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public League getLeague() {
		return league;
	}
	public void setLeague(League league) {
		this.league = league;
	}

	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
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
	public Color getColor1() {
		return color1;
	}
	public void setColor1(Color color1) {
		this.color1 = color1;
	}
	public Color getColor2() {
		return color2;
	}
	public void setColor2(Color color2) {
		this.color2 = color2;
	}
	public String getLogoFile() {
		return logoFile;
	}
	public void setLogoFile(String logoFile) {
		this.logoFile = logoFile;
	}
	public String getMascot() {
		return mascot;
	}
	public void setMascot(String mascot) {
		this.mascot = mascot;
	}
	
	public List<Match> getAwayMatchList() {
		return awayMatchList;
	}

	public void setAwayMatchList(List<Match> awayMatchList) {
		this.awayMatchList = awayMatchList;
	}

	public List<Match> getHomeMatchList() {
		return homeMatchList;
	}

	public void setHomeMatchList(List<Match> homeMatchList) {
		this.homeMatchList = homeMatchList;
	}
	

}
